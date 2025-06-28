# HelloSpringBoot
Spring Boot learning project by Himanshu Ranjan, featuring REST APIs with H2 database:
- `/hello`: Returns a welcome message.
- `/greet`: Returns a Spring Boot greeting.
- `/test`: Returns a Spring Boot test message.
- `/user/{name}`: Returns a personalized greeting.
- `/user`: Create a user (POST, stored in H2).
- `/users`: List all users (GET, from H2).
- `/user/{name}`: Delete a user (DELETE, from H2).
- `/users/age/{age}`: Finds users by age. (H2 query)
- `/users?page=0&size5`: Expect a page with 5 users, including pagination metadata (e.g., totalElements, totalPages)
		- Added sorting to H2 Pagination

## CRUD Operations
- **Create**: `POST /user` - Add a user (e.g., {"name":"Himanshu","email":"himanshu@example.com","age":30}).
- **Read**: `GET /users` - List all users.
- **Update**: `PUT /user/{name}` - Modify user details.
- **Delete**: `DELETE /user/{name}` - Remove a user (e.g., /user/Himanshu).