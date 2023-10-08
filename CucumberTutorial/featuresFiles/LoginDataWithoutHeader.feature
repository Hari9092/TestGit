Feature: This is the login feature for Login Page 
@LoginDataWithoutHeader
Scenario: This is user1 to login the LoginPage
Given user1 to enter the login page
When user1 enters the valid credentials with username and password of 
|Admin|admin123|
And clicks1 the login button after enter the credential
Then the user1 should see the home page after the sucessful login