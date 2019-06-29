# RomanNumeral

This service provides REST API to convert an integer into a roman numeral.

### Technology used and or Dependencies:

Springboot, JAVA 1.8, Gradle, Junit, Lombok

### Run application

Once cloned, run gradle clean build install. This will install the dependencies from the build.gradle.

Run the service in either of the ways below,
1. Run the application directly in Intellij/Eclipse as springboot application by right clicking the Application.java-> Run as Springboot Application
2. Execute command "gradle bootrun" command

Testing :
This project has junit tests written. We can create a jenkins build to run the tests when we are about to merge the story to the master.

### Packaging Layout
- src
  - main/java
    - com/test
      - controllers : Contains the API
      - domain : defines the model
      - services : Actual business logic
  - test/java
    - com/test, Basic junit test cases

#### API 
http://localhost:8080/romannumeral?query=XXX