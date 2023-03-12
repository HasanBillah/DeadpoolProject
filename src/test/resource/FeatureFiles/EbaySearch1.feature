@regression @smoke @SKYW-15 @E2E
Feature: Ebay Search Functionality

Scenario: Search for Shoes
Given Open Ebay Homepage
When Search for shoes
And Click on search button
Then Item list should have only shoes related products


Scenario: Search for Pants
Given Open Ebay Homepage
When Search for Pants
And Click on search button
Then Item list should have only pants related products


Scenario: Search for Shirts
Given Open Ebay Homepage
When Search for shirts
And Click on search button
Then Item list should have only shirts related products