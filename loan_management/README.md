# Loan Management System

A console-based **Loan Management System** developed using **Core Java** to demonstrate fundamental and advanced **Object-Oriented Programming (OOP) concepts** through a real-world loan example.

## 📌 Overview

The application allows users to select different types of loans and enter customer and loan details through a console-based menu.

Supported loan types:

* 🏠 Home Loan
* 🚗 Car Loan
* 👤 Personal Loan
* 🎓 Education Loan

Each loan shares common properties and behavior while providing its own loan-specific implementation.

---

## 🛠️ Technologies Used

* **Java**
* **Core Java**
* **OOP Concepts**
* **Scanner** for console input

---

## 🏗️ Project Structure

```text
src
└── com.loan
    ├── Loan.java
    ├── LoanImpl.java
    ├── HomeLoan.java
    ├── CarLoan.java
    ├── PersonalLoan.java
    ├── EducationLoan.java
    └── LoanDriver.java
```

---

## 🔹 Class Design

```text
                         Loan
                    <<interface>>
                           ▲
                           │
                       LoanImpl
                     <<abstract>>
                           ▲
          ┌────────────────┼────────────────┐
          │                │                │
          ▼                ▼                ▼
      HomeLoan          CarLoan        PersonalLoan
                                          
                           │
                           └──── EducationLoan
```

All concrete loan classes extend `LoanImpl` and inherit common loan functionality.

---

## 🧠 OOP Concepts Demonstrated

| OOP Concept                 | Implementation                                     |
| --------------------------- | -------------------------------------------------- |
| **Abstraction**             | `Loan` interface and `LoanImpl` abstract class     |
| **Encapsulation**           | Private fields with getters and setters            |
| **Inheritance**             | Loan classes extend `LoanImpl`                     |
| **Polymorphism**            | `Loan` reference holding different loan objects    |
| **Runtime Polymorphism**    | Overridden methods called through `Loan` reference |
| **Method Overriding**       | Loan-specific `getInterestRate()` implementation   |
| **Method Overloading**      | Multiple `displayLoanDetails()` methods            |
| **Upcasting**               | `Loan loan = new HomeLoan(...)`                    |
| **Constructor**             | Parameterized constructors in classes              |
| **`this` keyword**          | Referring to current object's fields               |
| **`super` keyword**         | Calling parent constructor/method                  |
| **Dynamic Method Dispatch** | Runtime selection of overridden methods            |
| **Data Validation**         | Validation inside setters                          |
| **`toString()`**            | Object representation                              |

---

## 🔄 Polymorphism Example

The driver uses an interface reference:

```java
Loan loan;
```

The reference can hold different loan objects:

```java
loan = new HomeLoan(...);
```

```java
loan = new CarLoan(...);
```

```java
loan = new PersonalLoan(...);
```

```java
loan = new EducationLoan(...);
```

The same reference is then used to invoke:

```java
loan.applyLoan();
loan.displayLoanDetails();
loan.calculateInterest();
loan.calculateEMI();
```

The appropriate overridden implementation is selected at runtime.

---

## 💰 Loan Calculations

Each loan type provides its own interest rate.

| Loan Type      | Interest Rate |
| -------------- | ------------: |
| Home Loan      |          8.5% |
| Car Loan       |          9.0% |
| Personal Loan  |         11.5% |
| Education Loan |          7.5% |

Common interest and EMI calculations are handled by the abstract `LoanImpl` class.

---

## 🖥️ Console Menu

```text
======================================
        LOAN MANAGEMENT SYSTEM
======================================
Welcome to ABC Bank
======================================
1. Home Loan
2. Car Loan
3. Personal Loan
4. Education Loan
5. Exit

Enter your choice:
```

After selecting a loan type, the application collects the required customer and loan information and displays the calculated loan details.

---

## ▶️ How to Run

### Prerequisites

* Java JDK 21 or compatible version
* Any Java IDE such as IntelliJ IDEA, Eclipse, STS, or VS Code

### Steps

1. Clone the repository.

```bash
git clone <YOUR_GITHUB_REPOSITORY_URL>
```

2. Open the project in your Java IDE.

3. Run:

```text
LoanDriver.java
```

4. Select a loan type from the console menu.

5. Enter the required details.

---

## 🚀 Future Enhancements

* Add more loan types
* Add loan eligibility checking
* Add credit score validation
* Add loan approval/rejection
* Store multiple loans using `ArrayList`
* Search loans by ID
* Add custom exceptions
* Add file handling
* Add loan repayment tracking
* Add loan application status

---

## 🎯 Learning Outcome

This project demonstrates how multiple OOP concepts work together in a real-world domain:

```text
Interface
    ↓
Abstract Class
    ↓
Inheritance
    ↓
Encapsulation
    ↓
Method Overriding
    ↓
Upcasting
    ↓
Runtime Polymorphism
    ↓
Dynamic Method Dispatch
```

The project was developed as a **Core Java OOP practice project** to strengthen object-oriented design and interview preparation.

---

## 👩‍💻 Author

**Abhi Chimmili**
