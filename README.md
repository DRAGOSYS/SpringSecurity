# Spring Boot Projects

A collection of Spring Boot projects demonstrating secure user authentication with role-based access control and REST API development using Spring Security, Spring Data JPA, and Spring Data REST.

## Projects

### 1. Spring Security Authentication System
A secure user authentication system with role-based access control. Users can register and log in with passwords securely hashed using Bcrypt, with different roles assigned different permissions via Spring Security.

**Features:**
- Secure user registration and login
- Password encryption using Bcrypt via Spring Security
- PostgreSQL database for credential storage
- Role-based access control — different permissions for different user roles
- Layered MVC architecture — Controller, Service, DAO, Model

**Project Structure:**
```
spring-sec-demo/src/main/java/
├── controller/       → Handles HTTP requests
├── dao/              → Database access layer
├── model/            → User entity classes
├── securityconfig/   → Spring Security and Bcrypt configuration
├── service/          → Business logic layer
└── SpringSecDemoApplication.java
```

---

### 2. Job Posts REST API (Spring Data REST)
A Spring Data REST application that automatically exposes a full CRUD REST API for job postings without requiring a manual controller layer.

**Features:**
- Full CRUD operations auto-exposed via Spring Data REST
- Job post entity with profile, description, required experience, and tech stack
- Clean two-layer architecture — Model and Repository only

**Project Structure:**
```
Datarest/src/main/java/
├── model/
│   └── JobPost.java        → Entity with postId, postProfile, postDesc,
│                              reqExperience, postTechStack
├── repo/
│   └── Jobrepo.java        → JpaRepository interface
└── DatarestApplication.java
```

**Auto-generated API Endpoints:**

| Method | Endpoint | Description |
|---|---|---|
| GET | /jobPosts | Get all job posts |
| GET | /jobPosts/{id} | Get job post by ID |
| POST | /jobPosts | Create new job post |
| PUT | /jobPosts/{id} | Update job post |
| DELETE | /jobPosts/{id} | Delete job post |

---

## Tech Stack

| Component | Technology |
|---|---|
| Framework | Spring Boot |
| Security | Spring Security |
| Password Encryption | Bcrypt |
| Access Control | Role-based Authorization |
| Data Layer | Spring Data JPA, Spring Data REST |
| Database | PostgreSQL / MySQL |
| Boilerplate Reduction | Lombok |
| Language | Java |

## Setup

1. Clone the repository
```bash
git clone https://github.com/DRAGOSYS/SpringSecurity.git
```

2. Navigate to either project folder and configure `application.properties`
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

3. Run the project
```bash
./mvnw spring:boot run
```

> **Note:** Both projects require a running PostgreSQL or MySQL instance to function.
