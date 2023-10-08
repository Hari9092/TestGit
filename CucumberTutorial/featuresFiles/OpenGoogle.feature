Feature: This is the login featurefor Orange HRM

@tag1
Scenario: This is user to login
Given user is on te login page
When user enters the valid credentials 
And clicks the login button
Then the user should see the home page
	
