@Outline
Feature: To user verify login function
@Sanity
Scenario Outline: To user verify username and password
Given To launch chrome browser and pass url
When  To user enters username and password

    |java@yahoo|123455|233|
    |selinium@12345|987867645|123|
    |bus@yahoo.com|24198768946|345|
    
Then to user click login button

