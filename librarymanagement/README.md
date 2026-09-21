# 📚 Library Management System

A **console-based Library Management System developed using Java** to practice Core Java concepts, Object-Oriented Programming, Arrays, CRUD Operations , logical operations, and custom exception handling.

## 🚀 Features

* Add Book
* Get Book by ID
* Get All Books
* Update Book
* Remove Book
* Search Book by Title
* Custom exception handling
* Menu-driven console application

## 🛠️ Technologies Used

* Java
* OOP
* Arrays
* Scanner
* Custom Exceptions

## 🧩 Book Types

The system supports:

* **E-Book**
* **Printed Book**
* **Magazine**

All book types inherit from the abstract `Book` class.

## 🧠 Concepts Implemented

### Object-Oriented Programming

* **Abstraction** – Hides implementation details using abstract classes and abstract methods.
* **Encapsulation** – Protects data using private fields with getters and setters.
* **Inheritance** – Allows child classes to reuse properties and methods of the parent `Book` class.
* **Polymorphism** – Allows a parent `Book` reference to hold different child-class objects.
* **Method Overriding** – Child classes provide their own implementation of parent-class methods.
* **Interfaces** – Defines a common contract for library operations using `LibraryOperations`.

### Arrays

* **Array Traversal** – Iterates through the `Book[]` array to access stored books.
* **Searching** – Searches for books based on book ID or title.
* **Insertion** – Adds new book objects to the available position in the array.
* **Removing Elements** – Removes books by clearing and reorganizing their array position.
* **Shifting Array Elements** – Shifts elements to the left after removing a book.

### CRUD Operations

* **Create** – Adds new books to the library.
* **Read** – Retrieves a book by ID or displays all available books.
* **Update** – Modifies the title, author, and price of an existing book.
* **Delete** – Removes a book from the library and shifts the remaining array elements.

### Logical Operations

* **if-else** – Used for conditions such as validation and checking whether a book exists.
* **switch** – Used for menu selection and choosing different book types.
* **for loop** – Used to traverse and search the book array.
* **while loop** – Used to continuously display and process the main menu.
* **do-while loop** – Used to repeatedly request valid book-type input.
* **break** – Used to exit loops or switch cases when the required condition is met.
* **return** – Used to exit methods and return values when required.
* **Validation and Conditional Logic** – Used to validate inputs and control the program flow.

### Exception Handling

* **Custom Exception Handling** – Uses custom exceptions to handle application-specific errors.
* **Invalid Operations** – Handles situations such as adding a book when the library is full or providing invalid input.


## 📂 Project Structure

```text
src/
└── librarymanagement/
    ├── Book.java
    ├── EBook.java
    ├── PrintedBook.java
    ├── Magazine.java
    ├── LibraryOperations.java
    ├── LibraryServiceImpl.java
    ├── LibraryDriver.java
    └── Custom Exceptions
```

## 🏗️ Architecture

```text
LibraryDriver
      ↓
LibraryOperations
      ↓
LibraryServiceImpl
      ↓
   Book[]
      ↓
 ┌────┼──────────┐
EBook PrintedBook Magazine
```

## ▶️ How to Run

1. Clone the repository.
2. Open the project in any Java IDE.
3. Run `LibraryDriver.java`.
4. Select an option from the menu and follow the instructions.

## 🎯 Purpose

This project is built to strengthen **Core Java, OOP concepts, array manipulation, logical problem-solving, CRUD operations, and exception handling** through a practical console-based application.

## 👩‍💻 Author

**Abhi Chimmili**
