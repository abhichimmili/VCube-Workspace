# 🎟️ BookMyShow Multithreading POC

A simple **BookMyShow ticket booking simulation developed using Java Multithreading** to demonstrate how multiple customers can try to book tickets concurrently while maintaining data consistency using synchronization.

## 🚀 Features

* Multiple customers booking tickets concurrently
* Shared ticket resource
* Thread creation using `Thread`
* Synchronized ticket booking
* Available ticket tracking
* Handling insufficient ticket availability
* Thread execution using `start()` and `run()`

## 🧠 Concepts Implemented

### Multithreading

* `Thread` class
* `start()`
* `run()`
* Multiple threads executing concurrently
* Shared resources between threads

### Synchronization

The `bookMyShowTickets()` method is declared as:

```java
public synchronized void bookMyShowTickets(String name, int tickets)
```

This ensures that only **one customer thread at a time** can modify the shared `total_tickets` value.

### Shared Resource

The `BookMyShow` object maintains the common ticket count:

```java
private int total_tickets = 10;
```

All customer threads use the same `BookMyShow` object.

## 🔄 Working Flow

```text
Customer Threads
      │
      ├── Abhi
      ├── Sujitha
      ├── Sandhya
      ├── Priyanka
      ├── Mounika
      └── Amulya
             │
             ▼
       BookMyShow Object
             │
             ▼
    synchronized booking()
             │
             ▼
      Available Tickets
```

If the requested tickets are available, the booking is completed and the remaining ticket count is updated. If insufficient tickets are available, the booking is rejected.

## 🛠️ Technologies Used

* Java
* Multithreading
* `Thread`
* Synchronization
* Shared Resources

## ▶️ How to Run

Run:

```text
BookMyShowDemo.java
```

Multiple customer threads will attempt to book tickets from the same pool of 10 available tickets.

## 🎯 Purpose

This POC was created to understand **Java multithreading, synchronization, concurrent access, shared resources, race-condition prevention, and thread-based ticket booking systems**.
