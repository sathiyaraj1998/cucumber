Feature: junean login and search the shopper
Scenario Outline: login possitive and negative pass values  
Given chrome browser launching
When pass values "<emailId>" and the "<passwords>"
Then to close the browser

Examples:
 |emailId|passwords|
 |pavan@yahoo.com|676325328|
 