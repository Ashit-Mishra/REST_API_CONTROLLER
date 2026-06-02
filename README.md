# User Management System

A simple Spring Boot REST API for performing CRUD operations on users using an in-memory HashMap.

## Features

- Create User
- Get All Users
- Get User By ID
- Update User
- Delete User

## Technologies Used

- Java
- Spring Boot
- Maven
- REST API

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|-------------|
| POST | `/user` | Create a user |
| GET | `/user` | Get all users |
| GET | `/user/{id}` | Get user by ID |
| PUT | `/user` | Update user |
| DELETE | `/user/{id}` | Delete user |

## Run Locally

```bash
mvn spring-boot:run
```
SERVER RUNS AT
http://localhost:8080


## Concepts Demonstrated

- Spring Boot
- REST APIs
- Dependency Injection
- Annotations
- IOC Container
- Request Mapping
- Path Variables
- Request Body Handling
- CRUD Operations
- Java Collections Framework
