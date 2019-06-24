Feature: Login to OrangeHrm WebApplication

@smoke
Scenario: Login with valid credential

Given User navigates and land to the login page
When user sees login form is displayed
Then user types valid username and password in the boxes
And user clicks onto the login button
Then user should succesfully login into the application
And user should see Dashboard statement on the page
Then user would log out

@regression
Scenario: Login with invalid credential

Given User navigates and land to the login page
When user sees login form is displayed
Then user types invalid username and password in the boxes
And user clicks onto the login button
Then user should not login into the application
And user should see error message on the page
Then user would log out





