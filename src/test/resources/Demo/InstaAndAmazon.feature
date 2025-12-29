Feature: Insta and amazon login and add to cart
Scenario: Insta login purpose
Given  launch browser to insta url
When Insta login values to data driven
Then close the insta browser

Scenario: amazon add to cart
Given launch amazon url
When search product and add to cart product
Then close the amazon browser


