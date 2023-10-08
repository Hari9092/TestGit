Feature: This is the login feature for Login Page 

Scenario: This is user to login the LoginPage
Given user to enter the login page
When user enters the valid credentials with username and password of "Admin" and "admin123"
And clicks the login button after enter the credential
Then the user should see the home page after the sucessful login