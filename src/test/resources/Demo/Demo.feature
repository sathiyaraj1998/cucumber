@Demo 
Feature: To verify  the login functionality
Background:
Given To launch the browser and pass valid url
@smoke @regression
Scenario: To verifylogin function with valid username valid password
When To user enter valid username and valid password
Then to click login
@smoke @regression
Scenario: To verifylogin function  with invalid username and invalid password
When To user enter invalid username and invalid password
And to click login button
Then to user quit browser


