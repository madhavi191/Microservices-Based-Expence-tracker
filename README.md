# 📊 Microservices-Based Expense Tracker

A modular, microservices-based **Expense Tracker** application built with **Spring Boot**, **MongoDB**, and **Docker**.  
This project manages **users, transactions, and budgets** as separate microservices, allowing scalable and maintainable architecture.  
**Postman** is used for testing all REST APIs for CRUD operations.
---

## 📑 Table of Contents
- [Overview](#overview)
- [Microservices](#microservices)
- [Tech Stack](#tech-stack)
- [Features](#features)
- [REST APIs](#rest-apis)
- [Getting Started](#getting-started)
- [Running the Project](#running-the-project)
- [Contributing](#contributing)
- [License](#license)
---

## Overview
This project implements a **microservices architecture** for expense tracking.  
Each module is developed as a separate Spring Boot application with its own MongoDB database.  
Communication between services can be handled asynchronously (Kafka optional).  
Centralized configuration can be managed via Spring Cloud Config.  

All **CRUD operations** (Create, Read, Update, Delete) are exposed via **REST APIs** and tested using **Postman**, allowing you to quickly fetch, post, update, and delete data in each microservice.
---

## Microservices
1. **Expense User Tracker**
   - Handles user registration, login, and profile management.
   - Provides REST APIs for CRUD operations on users.
   - Example APIs:
     - `GET /users` – Fetch all users
     - `POST /users` – Add a new user
     - `PUT /users/{id}` – Update a user
     - `DELETE /users/{id}` – Delete a user

2. **Expense Transaction Tracker**
   - Manages expense and income transactions.
   - Supports asynchronous processing via Kafka (if configured).
   - Example APIs:
     - `GET /transactions` – Fetch all transactions
     - `POST /transactions` – Add a transaction
     - `PUT /transactions/{id}` – Update a transaction
     - `DELETE /transactions/{id}` – Delete a transaction

3. **Expense Budget Tracker**
   - Tracks budgets for users and generates reports.
   - Uses MongoDB for storing budget data.
   - Runs in Docker container for easy deployment.
   - Example APIs:
     - `GET /budgets` – Fetch all budgets
     - `POST /budgets` – Add a new budget
     - `PUT /budgets/{id}` – Update budget
     - `DELETE /budgets/{id}` – Delete budget
---

## Tech Stack
- **Programming Language:** Java 21 
- **Framework:** Spring Boot 
- **Database:** MongoDB 
- **Containerization:** Docker 
- **Messaging (Optional):** Apache Kafka 
- **Configuration:** Spring Cloud Config 
- **Build Tool:** Maven or Gradle 
- **Version Control:** Git & GitHub 
- **API Testing:** Postman 
---

## Features
- ✅ Modular design with independently deployable services 
- ✅ User authentication and role-based access 
- ✅ Transaction and budget management with real-time updates 
- ✅ CRUD operations tested via **Postman** 
- ✅ Each microservice has its own MongoDB database 
- ✅ Containerized using Docker for easy deployment and scaling
---

## REST APIs
All microservices expose **REST APIs** for CRUD operations.  
You can test them easily with Postman.

### Example Postman Requests

**User Microservice**

'''' json

POST /users
{
  "name": "user",
  "email": "user@gmail.com",
  "password": "password1234"
}

Transaction Microservice:
'''' json 
POST /transactions
{
  "userId": "12334", // once you update the user details & you will get USERID ( it will generate UserID automatically) 
  "type": "expense",
  "amount": 500.00,
  "description": "Groceries"
}

Budget Microservice :
''''' json

POST /budgets
{
  "userId": "12345",
  "month": "September",
  "limit": 2000
}




