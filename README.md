# interview-evaluation-kit
A private repository with code, exercises, and sections designed to evaluate candidates' skills across multiple technologies, including Java, Spring Boot, SQL, and software architecture during technical interviews.

## Maven questions
### Multi Modules
Scenario:
You are tasked with creating a multi-module Maven project for a large application. The project consists of three modules:

- common: Contains shared utilities and helper classes used by other modules.
- service: Contains business logic and depends on common.
- web: A Spring Boot web application that depends on both common and service.

Q: How would you structure the directory hierarchy for this multi-module Maven project?


### Dependency
Q. What are the different types of dependency scopes in Maven, and when would you use each?

A.
Compile (default scope):

Dependencies needed at compile time and runtime.
Example: Libraries your application directly depends on, like spring-core.
Provided:

Dependencies required at compile time but not at runtime (e.g., because the container provides them).
Example: javax.servlet-api in a web application deployed on a servlet container.
Runtime:

Dependencies required at runtime but not during compilation.
Example: JDBC drivers for database connectivity.
Test:

Dependencies only needed during testing.
Example: JUnit, Mockito.
System:

Dependencies explicitly provided by the user, outside the Maven repository.
Example: A proprietary JAR file located on your local file system.
Note: Rarely used and generally discouraged.
Import (for dependency management):

Allows importing the dependencies of another POM file.
Example: Managing a Bill of Materials (BOM) for version alignment.
