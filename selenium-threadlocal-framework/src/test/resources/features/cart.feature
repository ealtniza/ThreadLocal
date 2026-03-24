
Feature: Cart tests

@regression
Scenario: Add to cart
Given user launches "firefox" browser
When user logs in
Then user adds products
And user opens cart
