
Feature: SauceDemo Login

@smoke @sanity
Scenario: Login test
Given user launches "chrome" browser
When user logs in
Then user adds products
And user opens cart
