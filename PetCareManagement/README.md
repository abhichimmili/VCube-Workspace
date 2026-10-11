# 🐾 Pet Care Management System — JDBC POC

## 📌 Overview

Pet Care Management System is a basic Java console application that manages pet records using **JDBC (Java Database Connectivity)** and MySQL. It demonstrates database connectivity and CRUD operations.

## 🚀 Features

* Add a new pet
* View all pets
* Search for a pet by ID
* Update pet details
* Delete pet records

## 🛠️ Technologies Used

* **Java** — Application development
* **JDBC** — Database connectivity
* **MySQL** — Database management
* **MySQL Connector/J** — JDBC driver, added manually to the project's build path
* **DAO Pattern** — Separates database operations from application logic

## 🗄️ Database Setup

1. Create a database named `petcare_db`.
2. Create a table named `pets` with fields for pet details, owner information, and health status.
3. Update the MySQL username and password in `DBConnection.java`.

## ⚙️ Setup and Execution

1. Install Java and MySQL.
2. Add the MySQL Connector/J JAR to the project's build path.
3. Create the database and `pets` table.
4. Configure the database credentials in `DBConnection.java`.
5. Run `PetCareApp.java` to start the application.

## 📚 JDBC Concepts Covered

* `DriverManager` and `Connection`
* `PreparedStatement`
* `ResultSet`
* `executeQuery()` and `executeUpdate()`
* Exception handling
* Try-with-resources
* CRUD operations

## 🎯 Purpose

This POC demonstrates how Java applications connect to MySQL databases and perform database operations using JDBC without Maven or Spring Boot.
