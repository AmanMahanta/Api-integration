# 📚 Book Management REST API

## Overview
A RESTful API built using **Spring Boot** to manage book records. The application supports basic CRUD operations and follows a layered architecture for clean and maintainable backend development.

## Tech Stack
Java, Spring Boot, Spring Web, Spring Data JPA, H2 Database, Maven

## Features
- Create, read, update, and delete books  
- RESTful API design using HTTP methods  
- Input validation and global exception handling  
- Database persistence using Spring Data JPA  

## API Endpoints
- GET `/api/books`
- GET `/api/books/{id}`
- POST `/api/books`
- PUT `/api/books/{id}`
- DELETE `/api/books/{id}`

## Run the Project
1. Open the project in IntelliJ IDEA  
2. Run the main Spring Boot application class  
3. Server starts at `http://localhost:8080`

## Database
- H2 Console: `http://localhost:8080/h2-console`  
- JDBC URL: `jdbc:h2:mem:testdb`

## Purpose
Demonstrates implementation of a simple **Spring Boot REST API** with CRUD operations and proper layering.

## Author
Aman Mahanta
