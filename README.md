# Library Management System

## Overview
The **Library Management System** is a Java-based application designed to help manage library operations such as adding, searching, borrowing, and returning library items. It also supports managing patrons (students or employees) and authors. The system demonstrates object-oriented programming principles and includes features like item management, patron management, and borrowing/returning functionality.

---

## Features
1. **Item Management**
    - Add, search, edit, and delete items (Books, Periodicals).
    - Each item includes properties such as:
        - ID
        - Title
        - Author
        - ISBN
        - Publisher
        - Copies available

2. **Author Management**
    - Add and display authors.
    - Each author includes:
        - Name
        - Date of Birth

3. **Patron Management**
    - Add, search, edit, and delete patrons (Students or Employees).
    - Each patron includes:
        - ID
        - Name
        - Role (Student or Employee)
        - Address
        - Phone number
        - Borrowed items

4. **Borrowing and Returning Items**
    - Borrow items by item ID and patron ID.
    - Return borrowed items.
    - Items cannot be borrowed if they are out of stock.

---

## How to Run the Program
### Prerequisites
- Java Development Kit (JDK 11 or later).
- IntelliJ IDEA or any Java IDE.

### Steps to Run:
1. Clone the repository:
   ```bash
   git clone https://github.com/DanBowersJR/LibraryManagementSystem.git
