# Simple Online Shop JavaFX App

[![Java](https://img.shields.io/badge/Java-21-red.svg?logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![JavaFX](https://img.shields.io/badge/JavaFX-21-blue.svg?logo=openjdk&logoColor=white)](https://openjfx.io/)
[![Database](https://img.shields.io/badge/Database-PostgreSQL-blue.svg?logo=postgresql&logoColor=white)](https://www.postgresql.org/)

This is a basic desktop application built with JavaFX to manage products and customers for a small online shop.

## Key Features

*   Product Management (Add, Fetch, Update, Delete)
*   Customer Management (Register, Search, Update, Remove)
*   Simple JavaFX User Interface
*   PostgreSQL Database for data storage

## Technologies Used

*   JavaFX
*   Java (21)
*   PostgreSQL
*   JDBC
*   FXML

## Getting Started

To run this application from the repository:

**Prerequisites:**

1.  **Java Development Kit (JDK) 21:** Install from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or use an OpenJDK distribution.
2.  **PostgreSQL Database:** Install and run PostgreSQL.
3.  **IDE (Recommended):** IntelliJ IDEA is recommended.

**Steps:**

1.  **Clone the repository:**  Use `git clone [repository URL]` to download the project.
2.  **Database Setup:**
    *   Create a PostgreSQL database named `JavaFXProject`.
    *   Ensure you have `products` and `customers` tables. Table structure is in `Product.java` and `Customer.java`.
    *   Edit `src/main/java/com/onlineshop/JavaFX/util/DatabaseConnection.java` with your PostgreSQL details (`DB_URL`, `DB_USER`, `DB_PASS`).
3.  **Import Project:** Open the project in IntelliJ IDEA as a Java project.
4.  **Run the Application:** Run `HelloApplication.java` located in `src/main/java/com/onlineshop/JavaFX/HelloApplication.java`.

## Project Structure (Simplified)

```
onlineshop-javafx-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── onlineshop/
│   │   │           └── JavaFX/
│   │   │               ├── HelloApplication.java
│   │   │               ├── controller/
│   │   │               ├── entity/
│   │   │               ├── repository/
│   │   │               └── util/
│   │   └── resources/
│   │       └── com/
│   │           └── onlineshop/
│   │               └── JavaFX/
│   │                   ├── customer-view.fxml
│   │                   └── product-view.fxml
└── README.md
```

## Error Handling

The application includes basic error handling to show alerts if something goes wrong, like incorrect input or database issues.
