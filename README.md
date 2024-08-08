
# Perfect Numbers Finder - Documentation

## Project Overview

The Perfect Numbers Finder is a Java 11 Spring Boot web application that allows users to find all perfect numbers within a specified range. A perfect number is an integer that equals the sum of its proper divisors.

### Features
- Web interface for inputting a numeric range.
- Displays perfect numbers found within the range.
- User-friendly interface powered by Thymeleaf.

## Project Structure

```
perfect-numbers/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── perfectnumbers/
│   │   │               ├── PerfectNumberApplication.java
│   │   │               ├── controller/
│   │   │               └── service/
│   │   └── resources/
│   │       └── templates/
│   │           ├── index.html
│   │           └── result.html
│   └── test/
└─── pom.xml
```

## Setup Instructions

### Prerequisites
- Java 11 JDK
- Maven 3.6+
- IDE (Optional)

### Build and Run

1. Clone the repository and navigate to the project directory.
2. Build the project with `mvn clean install`.
3. Run the application using `mvn spring-boot:run`.
4. Access the application at `http://localhost:8080`.

## Architecture Overview

### 1. Controller Layer

- **PerfectNumberController.java**: Manages HTTP requests and responses.
  - **Endpoint**: `/findPerfectNumbers` processes user input and returns perfect numbers within the specified range.

### 2. Service Layer

- **PerfectNumberService.java**: Contains the business logic to identify perfect numbers within the given range.

### 3. View Layer

- **index.html**: The form where users enter the start and end values.
- **result.html**: Displays the entered range and the list of perfect numbers found.

## Usage

1. Open `http://localhost:8080`.
2. Enter the start and end numbers in the form on the main page.
3. Submit the form to view the perfect numbers within the range.
