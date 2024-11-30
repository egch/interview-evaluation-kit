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
