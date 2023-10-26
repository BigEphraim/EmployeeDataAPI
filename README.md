# Employee Data API

![Java](https://img.shields.io/badge/Java-11-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-brightgreen)
![GitHub](https://img.shields.io/badge/GitHub-Repository-lightgrey)

Welcome to the Employee Data API repository! This project is a demonstration of my skills in Java, Spring Boot, and API development.

## Description

This repository contains a RESTful microservice built with Java Spring Boot that performs basic CRUD operations on a database. The microservice is designed to manage employee data and is deployed on Amazon AWS for the database and on Render for the application. The project structure and implementation follow the tutorial series by Ramesh Fatadare (Java Guides) on YouTube (https://youtu.be/slTUtTSwRKU?si=g1PO1_u7KatuPiQJ).

## Project Overview

This RESTful microservice, built entirely with Java Spring Boot, manages employee data efficiently and securely. The API offers endpoints for basic CRUD operations and is optimized for high performance.

## Why This Repository Matters

- **Skill Proficiency**: This repository demonstrates my skills in Java and Spring Boot, showcasing my ability to create robust, scalable, and maintainable web applications.

- **Database Management**: Utilizing Amazon AWS for database hosting, this project highlights my abilities in setting up and managing databases in cloud environments.

- **API Development**: The API endpoints (GET, POST, PUT, DELETE) are meticulously implemented, demonstrating my knowledge of RESTful API design and development.

- **Deployment on Render**: Deploying the application on Render emphasizes my proficiency in deploying and hosting web applications, ensuring seamless user experiences.

### Built With

- Java 
- Springboot
- Maven

## API Endpoints
GET /api/employees: Get a list of all employees.
GET /api/employees/{id}: Get details of a specific employee by ID.
POST /api/employees: Create a new employee record.
PUT /api/employees/{id}: Update an existing employee record by ID.
DELETE /api/employees/{id}: Delete an employee record by ID.
### Testing Endpoints with Postman
You can test the API endpoints using Postman. Here are some sample requests:

GET (https://springboot-backend-render.onrender.com/employees): Sends a GET request to retrieve all employees.
GET (https://springboot-backend-render.onrender.com/employees/3): Sends a GET request with a specific ID parameter (in this case, the ID parameter is 3) to retrieve a particular employee's details (the employee with ID = 3).
POST (https://springboot-backend-render.onrender.com/employees): Sends a POST request with JSON data to create a new employee record.
PUT (https://springboot-backend-render.onrender.com/employees/3): Sends a PUT request with JSON data to update an existing employee's record by ID (in this case, the employee with ID = 3 will be updated in the database).
DELETE (https://springboot-backend-render.onrender.com/employees/3): Sends a DELETE request with a specific ID parameter to delete an employee record (in this case, the employee with ID = 3 will be updated in the database).

## Acknowledgement

Special thanks to Ramesh Fatadare and Java Guides for the helpful tutorial series on YouTube.

## Contact

For any enquiries or feedback, feel free to contact the project maintainers:
- Ephraim Rodgers: [erodgers092@gmail.com] or [codemage357@gmail.com]

**Please feel free to clone the repository and run the project locally on your machine. If you have any questions or suggestions, don't hesitate to reach out. Happy coding!**
