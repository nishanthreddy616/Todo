
# Spring Boot TODO App

This Spring Boot application serves as a backend for a TODO app, providing APIs for managing tasks. It is connected to MongoDB Atlas for data storage and retrieval.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Maven
- Postman (for testing APIs)

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/nishanthreddy616/Todo
   ```

2. Navigate to the project directory:

3. Open `src/main/resources/application.properties` and configure your MongoDB Atlas connection URI:

   ```properties
   spring.data.mongodb.uri=<your-mongodb-atlas-connection-uri>
   ```

4. Build the project using Maven:

   ```bash
   mvn clean install
   ```

5. Run the application:

   ```bash
   java -jar target/Todo.jar
   ```

## Available Endpoints

POST /todos: Creates a new TODO item.
GET /todos: Retrieves all TODO items.
GET /todos/{todoId}: Retrieves a specific TODO item by its ID.
GET /todos/title/{title}: Retrieves TODO items by their title.
GET /todos/completed/{completed}: Retrieves TODO items by their completion status.
DELETE /todos/{todoId}: Deletes a TODO item by its ID.

## Contributing

Contributions are welcome! Feel free to submit issues or pull requests.
