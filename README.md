# RomanNumeral

This service provides REST API to convert an integer into a roman numeral.

# Technology used and or Dependencies:

Springboot, JAVA 1.8, Gradle

# Run application

Once cloned run gralde clean install
Run the application directly in Intellij as springboot application or by entering the comman "gradle bootrun" command

Testing :
This project has junit tests written. We can create a jenkins build to run the tests when we are about to merge the story to the master.

Packagin Layout
- src/main
  - java
    - com/test
      - controllers : Contains the API
      - domain : defines the model
      - services : Actual business logic
  - test, Basic junit test cases
