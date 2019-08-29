# RESTful Web Service application with Java, Spring MVC, Spring Boot and Spring Data JPA
Project imlement features like:
- Build and run REST API with Maven 
- User sign-up and User sign-in
- Email verification
- Secure Web Service endpoints with Spring Security
- Token-Based Authentication
- Generate and include the JSON Web Token in HTTP Request
- Get user details API call
- Create user details API call
- Update user details and Delete user details API calls
- Get list of users API call and implement Pagination
- Connect MySQL database
- Use Spring Data JPA

#### Notes

##### Running Web Services App without STS (jar)
- Change current catalog to the project catalog 
- Build thr project: mvn install
- Run application: mvn spring-boot:run
- Quit: ctrl+C

##### Running Web Services App as a Java application (jar)
- Change current catalog to the project catalog
- Build thr project: mvn install
- Upload the deployable .jar file to a production server
- Run application: java -jar app-ws-pro-0.0.1-SNAPSHOT.jar
- Quit: ctrl+C

##### Generating WAR file
- mvn clean
- mvn install

... and deploying to Apache Tomcat
