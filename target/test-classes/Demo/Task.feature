Feature: junean login and search
Scenario Outline: login possitive and negative values in
Given chrome browser launch
When pass values "<email>" and "<password>"
Then close browsers

Examples:
 |email|password|
 |pavan@yahoo.com|676325328|
