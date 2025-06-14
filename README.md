# Top-Level Directory Structure

    my-fullstack-app/
    ├── backend/                  ← Java Spring Boot app
    ├── frontend/                 ← React app
    ├── nginx/                   ← Nginx config
    ├── docker-compose.yml       ← Full system orchestration
    ├── .env                     ← Shared environment variables
    └── README.md

## backend/ (Java + Spring Boot)

    backend/
    ├── src/
    │   └── main/
    │       ├── java/com/myapp/
    │       │   ├── config/               ← Security config, CORS, JWT filters
    │       │   ├── controller/           ← REST controllers
    │       │   ├── dto/                  ← Data Transfer Objects
    │       │   ├── entity/               ← JPA Entities
    │       │   ├── exception/            ← Global exception handling
    │       │   ├── mapper/               ← MapStruct interfaces
    │       │   ├── repository/           ← Spring Data JPA repositories
    │       │   ├── security/             ← JWT utils, token generation, refresh
    │       │   ├── service/              ← Business logic
    │       │   └── MyAppApplication.java
    │       └── resources/
    │           ├── application.properties
    │           ├── static/               ← (Optional for static files)
    │           └── templates/            ← (Optional for views)
    ├── pom.xml

## frontend/ (React + Vite or CRA)

    frontend/
    ├── public/
    │   └── index.html
    ├── src/
    │   ├── assets/              ← Images, icons, etc.
    │   ├── components/          ← Reusable UI elements
    │   ├── pages/               ← Pages like Login, Register, Profile
    │   ├── services/            ← Axios logic for backend
    │   ├── context/             ← Auth, Theme, etc.
    │   ├── hooks/               ← Custom hooks (e.g. useAuth, useUpload)
    │   ├── routes/              ← Protected routes, routes config
    │   ├── utils/               ← JWT, validators, helpers
    │   ├── App.jsx
    │   └── main.jsx
    ├── package.json
    ├── vite.config.js

## nginx/ (Reverse Proxy)

    nginx/
    └── default.conf     ← Nginx reverse proxy config

| Feature                            | Where                                |
| ---------------------------------- | ------------------------------------ |
| JWT Auth + Refresh                 | `security/` + frontend hooks         |
| DTO + Mappers                      | `dto/` + `mapper/` (MapStruct)       |
| Uploading Files                    | MultipartFile + frontend upload      |
| Payments                           | Stripe or PayPal SDK                 |
| Secure Endpoints + Role-based Auth | Spring Security                      |
| PostgreSQL ORM                     | `entity/`, `repository/`             |
| Dev on IntelliJ + VSCode           | Backend: IntelliJ / Frontend: VSCode |
| Docker + Nginx Setup               | Done                                 |
