Feature: FaceBook login 
Scenario Outline: login values of facebook
Given chrome browser launch in fb
When pass the values of "<email>" and "<password>"
Then close browsers of FB

Examples:
 |email|password|
 |pavan@yahoo.com|6763253283|
 |viji@yagoo.com|34089787553|
 |gmail@gmail.com|4374572145|
