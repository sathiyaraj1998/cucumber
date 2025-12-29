
Feature: To user vberify search box
Scenario: To user enter valid product

Given To user launch browser and pass junean url
When to user enter product search box
    #map 2 dimensional
       |pant       |shirt       |tshrit|
       |jeans pant|cotton shrit|vneck |
       |cotton pant|jeans shirt | polo tshirt|
       |shorts     | lycra      |vest|
Then To user click search box button