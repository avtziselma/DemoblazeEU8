#Cucumber framework for DemoBlaze 

## Framework Format

1. configuration.properties:
    .To avoid hard coding some of the important test data in our project.
    . Centralised location 
    . We can easily do cross browser testing which means we can run the same test against different browsers just by changing the value of "browser" key from "chrome" to "firefox" and our test will be running in different browser
2. Create resources directory with same level with java directory( this directory is  where we put our features -scenarios for the project in Gherkin language)
3. Create Java packages:
    . runners
        -->CukesRunner(java class)    
    . pages (POM) 
        -->BasePage(java class)
    . utilities
        --> ConfigurationReader(java class)
    . step_definitions
        --> TestStepDefinitions
  # What is Page Object Design pattern (POM)
  Creating java class for each page of the web application. All of related web elements to current page will be stored to its own .java class