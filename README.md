A robust, production-ready authentication system built with **Spring Boot**, **MySQL**, and **Thymeleaf**. This project demonstrates a secure login and registration flow with a clean, responsive user interface.

## ✨ Features

-   **User Registration**: Secure sign-up with username, email, and password.
-   **Authentication**: Secure login system with session management.
-   **Dashboard**: Protected area viewable only by logged-in users.
-   **User Management**: View a list of all registered users (admin-like feature).
-   **Responsive UI**: Modern, clean design that works on desktop and mobile.
-   **Database Integration**: Full MySQL persistence with Hibernate/JPA.

## 🛠️ Tech Stack

-   **Backend**: Java, Spring Boot (Web, Data JPA)
-   **Database**: MySQL / MariaDB
-   **Frontend**: HTML5, CSS3, Thymeleaf
-   **Build Tool**: Maven

## 🚀 Getting Started

### Prerequisites

-   Java JDK 17 or higher
-   Maven
-   MySQL or MariaDB Server

### Database Setup

1.  Start your MySQL service:
    ```bash
    sudo systemctl start mysqld
    ```
2.  Create the database:
    ```bash
    mysql -u root -p -e "CREATE DATABASE IF NOT EXISTS login_app_db;"
    ```
    *(Enter your root password when prompted)*

### Installation & Run

1.  **Clone the repository** (or download the source):
    ```bash
    git clone https://github.com/yourusername/auth-pade.git
    cd auth-pade
    ```

2.  **Build the project**:
    ```bash
    mvn clean package
    ```

3.  **Run the application**:
    ```bash
    java -jar target/loginapp-0.0.1-SNAPSHOT.jar
    ```

4.  **Access the App**:
    Open your browser and navigate to:
    [http://localhost:8080](http://localhost:8080)

## 📂 Project Structure

For a detailed explanation of the code structure and how to extend this project, please refer to the [PROJECT_GUIDE.md](PROJECT_GUIDE.md) included in this repository.

## 🤝 Contributing

Feel free to fork this project and submit pull requests. You can also open issues for bugs or feature requests.

---
*Built with ❤️ by Minion*
