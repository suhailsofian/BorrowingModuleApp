# Library Management System

A comprehensive Library Management System built with Spring Boot that allows users to manage books, borrow/return them, and get personalized recommendations.

## Features

- **User Management**: CRUD operations for library users
- **Book Management**: Add, update, delete, and search books
- **Borrowing System**: Track book borrowings and returns
- **Recommendations**: Get personalized book recommendations based on user preferences
- **RESTful API**: Fully documented with Swagger/OpenAPI
- **Database**: MySQL for database migrations

## Tech Stack

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Data JPA**
- **MySQL 8.0+** (with phpMyAdmin)
- **Hibernate** (for schema management)
- **MapStruct** (for DTO-Entity mapping)
- **Lombok** (for reducing boilerplate code)
- **SpringDoc OpenAPI** (for API documentation)
- **Maven** (build tool)

## Prerequisites

- Java 17 or later
- Maven 3.6.3 or later
- MySQL 8.0 or later

## Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd library-management-system
   ```

2. **Configure the database**
   - Ensure MySQL server and phpMyAdmin are running on your local machine
   - Open phpMyAdmin (usually at http://localhost/phpmyadmin)
   - Create a new database named `borrowing_db` (or use an existing one)
   - Update the database configuration in `src/main/resources/application.yml` with your MySQL credentials:
     ```yaml
     spring:
       datasource:
         url: jdbc:mysql://localhost:3306/borrowing_db?useSSL=false&serverTimezone=UTC
         username: your_mysql_username
         password: your_mysql_password
         driver-class-name: com.mysql.cj.jdbc.Driver
     ```
   - Make sure the database user has all necessary privileges

3. **Build the application**
   ```bash
   mvn clean install
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```
   The application will start on http://localhost:8081

## Database Initialization

The application uses Hibernate's auto-ddl feature to manage the database schema. On startup, it will:
1. Connect to your MySQL database
2. Automatically create all necessary tables if they don't exist
3. Update the schema if there are any changes to the entities

### Important Notes:
- The database must be created manually in phpMyAdmin before running the application
- The application won't create the database automatically (for security reasons)
- Make sure your MySQL user has all necessary privileges on the database

## API Documentation

Once the application is running, you can access the following:

- **Swagger UI**: http://localhost:8081/swagger-ui.html
- **OpenAPI JSON**: http://localhost:8081/api-docs

## API Endpoints



### Borrowings
- `GET /api/borrowing/{id}` - Borrow a book


## Testing

Run the tests using:
```bash
mvn test
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
