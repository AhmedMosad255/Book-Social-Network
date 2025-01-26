# Book Social Network

A full-stack application that allows users to manage books, share them with others, and borrow books. Built with **Spring Boot** (backend) and **Angular** (frontend), this project demonstrates CRUD operations, user authentication, and book sharing features.

---

## Features

### **Book Management**
- Users can create, update, and delete books.
- Archive books that are no longer shared but kept as records.
- Fully implemented CRUD operations on both backend and frontend.

### **Book Sharing**
- Mark books as available for sharing.
- View a list of books that are available for sharing.
- Share books with other users.

### **Borrow Book**
- Users can borrow books.
- Tracks the status of each book:
  - **Available**
  - **Borrowed**
  - **Archived**
- Prevents multiple users from borrowing the same book simultaneously.

### **User Authentication**
- User registration and login functionality.
- Backend authentication using **Spring Security**.
- Security token-based authentication between Spring Boot and Angular using **JWT (JSON Web Tokens)**.

---

## Tech Stack

### **Backend**
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- JPA/Hibernate
- PostgreSQL (or any relational database)

### **Frontend**
- Angular
- Angular Material (for UI components)
- Tailwind CSS (optional, if you're using it for styling)

---

## Getting Started

### **Prerequisites**
- Install **Java 17** or higher.
- Install **Node.js** and **Angular CLI**.
- Set up a **PostgreSQL database** or your preferred RDBMS.
- Install **Maven** (for backend dependency management).

---

### **Backend Setup**![Screenshot (140)](https://github.com/user-attachments/assets/2c552aea-77fc-406d-8153-ede0fc1c98df)

1. Clone the repository:
   ```bash
   git clone (https://github.com/AhmedMosad255/Book-Social-Network.git)
   cd book-social-network/backend
![localhost_8088_api_v1_swagger-ui_index html](https://github.com/user-attachments/assets/1cc1605a-8320-418f-b610-f455974e04c5)
