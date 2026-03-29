# Library
Library
# 📚 Library Management System (Java OOP)

## 📌 Overview

This project is a simple **Object-Oriented Programming (OOP)** implementation of a library system in Java.
It demonstrates core OOP principles such as **encapsulation, composition, and class design**.

The system allows storing books, listing their titles, and calculating the total number of pages in the library.

---

## 🚀 Features

* Store books with a fixed capacity
* Manage author and book information
* List all book titles in the library
* Calculate total number of pages
* Simple and clean OOP structure

---

## 🧱 Project Structure

```
📦 LibrarySystem
 ┣ 📜 Author.java
 ┣ 📜 Book.java
 ┣ 📜 Library.java
 ┗ 📜 Main.java
```

### 🔹 Author Class

Represents an author with:

* Name
* Surname
* Nationality

### 🔹 Book Class

Represents a book with:

* Title
* Author (object reference)
* Number of pages

### 🔹 Library Class

Manages the collection of books:

* Stores books using an array
* Controls capacity
* Provides methods to:

  * Add books
  * List titles
  * Calculate total pages

### 🔹 Main Class

* Creates authors and books
* Adds them to the library
* Displays results

---

## ▶️ How to Run

1. Compile all files:

```bash
javac *.java
```

2. Run the program:

```bash
java Main
```

---

## 📊 Example Output

```
Titles of all books in the library:
Harry Potter and the Sorcerer's Stone
Harry Potter and the Chamber of Secrets
1984
Animal Farm
Total number of pages in the library: 1090
```

---

## 🧠 OOP Concepts Used

* **Encapsulation** → private fields + getters
* **Composition** → Book has an Author
* **Abstraction** → Library manages book operations
* **Modularity** → Separate classes for each entity

---

## 📌 Notes

* The library capacity is flexible (set in constructor)
* Currently uses a fixed array instead of dynamic collections
* Designed for educational purposes (intro to OOP)

---

## 👨‍💻 Author

Your Name

---

## ⭐ Contribution

Feel free to fork this project and improve it (e.g., search, remove books, UI).

---
