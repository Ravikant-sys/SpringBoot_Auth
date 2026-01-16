# Spring Boot Login Application - Project Guide

This guide explains how the application works and how you can use it as a template for future projects.

## 1. Project Structure

The project follows the standard Spring Boot architecture:

```
src/main/java/com/example/loginapp/
├── controller/       # Handles HTTP requests (URLs)
│   └── AuthController.java
├── model/           # Database entities (Tables)
│   └── User.java
├── repository/      # Database access layer
│   └── UserRepository.java
├── service/         # Business logic
│   └── UserService.java
└── LoginAppApplication.java  # Main entry point
```

## 2. Key Components Explained

### Model (`User.java`)
- Represents a table in the database.
- Annotated with `@Entity` to tell Hibernate to create a table.
- Fields like `id`, `username`, `password` become columns.

### Repository (`UserRepository.java`)
- Extends `JpaRepository`.
- Provides built-in methods like `save()`, `findAll()`, `findById()`.
- We added `findByUsername()` to search for users.

### Service (`UserService.java`)
- Contains the "business logic".
- **Register**: Checks if a user exists, then saves them.
- **Authenticate**: Checks if the username exists and the password matches.

### Controller (`AuthController.java`)
- Maps URLs (like `/login`, `/register`) to Java methods.
- **@GetMapping**: Handles page loads.
- **@PostMapping**: Handles form submissions.
- Uses `Model` to pass data to the HTML view.
- Uses `HttpSession` to keep the user logged in.

### Views (Thymeleaf)
- Located in `src/main/resources/templates/`.
- HTML files with special `th:` attributes.
- Example: `<span th:text="${user.username}">` replaces the content with the username from the Java controller.

## 3. How to Build Similar Projects

To create a new project (e.g., a "Todo List" app) based on this one:

1.  **Copy the Structure**: Keep the same package structure (controller, model, repository, service).
2.  **Create a New Model**: E.g., `TodoItem.java` with fields `title`, `description`.
3.  **Create a Repository**: `TodoRepository` extending `JpaRepository<TodoItem, Long>`.
4.  **Create a Service**: `TodoService` with methods to add/remove items.
5.  **Create a Controller**: `TodoController` to handle `/todos` URLs.
6.  **Create Views**: `todos.html` to list items.

## 4. Troubleshooting & Setup

### Database Issues
If `sudo systemctl start mysqld` fails, it's often because the database isn't initialized.
Try running:
```bash
sudo mariadb-install-db --user=mysql --basedir=/usr --datadir=/var/lib/mysql
sudo systemctl start mysqld
```

### Changing the Database
To use a different database (e.g., PostgreSQL or an online MySQL):
1.  Update `pom.xml` with the new driver dependency.
2.  Update `src/main/resources/application.properties` with the new `url`, `username`, and `password`.

## 5. Running the App
```bash
mvn spring-boot:run
```
Access at: `http://localhost:8080`
