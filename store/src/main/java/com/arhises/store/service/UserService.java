package com.arhises.store.service;

import com.arhises.store.entity.User;
import com.arhises.store.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User createUser(User user) {
        return repo.save(user);
    }

    public User updateUser(Long id, User user) {
        if (!repo.existsById(id)) {
            return null;
        }
        user.setId(id);
        return repo.save(user);
    }

    public User getUserById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        repo.deleteById(id);
    }

}
