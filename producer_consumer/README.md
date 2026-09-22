# 🔄 Producer-Consumer POC

A simple **Producer-Consumer implementation in Java** demonstrating thread synchronization and communication using a shared resource.

## 🚀 Features

* Producer and Consumer threads
* Shared resource
* Thread synchronization
* `synchronized` methods
* `wait()` and `notify()`
* Thread creation using `Runnable`
* Thread naming
* `Thread.sleep()`
* Interrupt handling

## 🧠 Concepts Implemented

### Multithreading

* `Runnable`
* `Thread`
* `start()`
* `run()`
* Thread naming

### Synchronization

* `synchronized` methods ensure safe access to the shared resource.
* `wait()` makes a thread wait until the required condition is satisfied.
* `notify()` wakes a waiting thread after producing or consuming data.

### Producer-Consumer Pattern

```text
Producer
   ↓
put()
   ↓
Shared Resource
   ↓
get()
   ↓
Consumer
```

The `Resource` class acts as the shared resource between the Producer and Consumer.

## 🔄 Working Flow

```text
Producer → Produces value → Resource
                              ↓
                           notify()
                              ↓
Consumer ← Consumes value ← Resource
                              ↓
                           notify()
                              ↓
Producer → Produces next value
```

The `available` flag ensures that the Producer waits when a value is already available and the Consumer waits when there is no value to consume.

## 🛠️ Technologies Used

* Java
* Multithreading
* Synchronization
* `Runnable`
* `wait()` / `notify()`

## ▶️ How to Run

Run:

```text
ProducerConsumerDemo.java
```

The program continuously produces and consumes values using separate threads.

## 🎯 Purpose

This POC was created to understand **Java multithreading, thread synchronization, inter-thread communication, shared resources, and the Producer-Consumer pattern**.
