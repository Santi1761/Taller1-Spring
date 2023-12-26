# Bookstore Management System

## Overview
This workshop aims to create a book management system for a bookstore. To accomplish this, the model, repository, and service classes for the books must be developed. The Book class is characterized by having the attributes id, name, publisher and author. In the main application, the service bean will be instantiated, three books will be created directly in code, data from one of them will be obtained using its ID, and one book will be deleted using its ID. Additionally, this task should be performed in three versions of the project, each using a different form of dependency injection

 * **Configuration using XML.** This version of the project is developed in the branch **Xml'sBranch**
 * **Configuration using annotations in classes.** This version of the project is developed in the branch **Annotation'sBranch**
 * **Configuration using a configuration file.** This version of the project is developed in the branch **Configuration'sBranch**

Additionally, in one of the versions of the project(**Annotation version**), the Publisher class will be incorporated with the attributes id, name, address and a list of books. Three Publisher instances will be created and at least five books will be added to each. The number of books associated with each publisher will be displayed and the books belonging to a specific publisher will be listed.

## In the Main Branch it's found the Annotation version

## Requirements
To run the Bookstore Management System, you'll need the following:

- Java Development Kit (JDK) 17
- Apache Maven for building the project
- A web browser to access the application

## Technologies Used
- **Spring Boot**: A Java-based framework for building web applications.
- **Thymeleaf**: A templating engine for server-side rendering of HTML templates.
- **Spring Data JPA**: Simplifies database access using Spring applications.
- **Lombok**: A Java library to reduce boilerplate code.
- **HTML/CSS**: For creating the user interface.
- **GitHub**: For version control and collaboration.

## Development Approach
The project follows a microservices architecture with components for Books, Publishers, and Authors. Key development steps include:

1. **Modeling**: Define the data model including classes for books, publishers, and authors.

2. **Repository and Service Layers**: Create repository and service classes to handle data storage and business logic.

3. **Controller Layer**: Implement controllers to handle HTTP requests and define REST endpoints.

4. **Frontend**: Develop HTML templates using Thymeleaf to render pages.

5. **Database Configuration**: Configure a database (H2 or other) for data storage.

6. **Dependency Injection**: Use Spring Boot's dependency injection to wire components together.

7. **Testing**: Write unit and integration tests for critical components.

8. **Collaboration**: Collaborate with team members to integrate components and resolve issues.

## Collaborators
- [Juan Pablo Acevedo](https://github.com/juanpabblo16)
- [Jesus Garces](https://github.com/JesusGarce22)
- [Santiago Arboleda](https://github.com/Santi1761)

## Getting Started
To run the application locally, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/taller-1-intro-spring-equipo-9.git`

2. Build the project: `mvn clean install`

## [Report about activity](https://docs.google.com/document/d/1YvJYv9yR7bw0rL9Q2IR2XtSUMV3uLuMDgQbdWA1GLe0/edit?usp=sharing)

4. Run the application: `java -jar target/taller-1-intro-spring-equipo-9.jar`

5. Access the application in your web browser: `http://localhost:8080`

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
