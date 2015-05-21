Feature: Buy a new product

Background:
Given I am logged into toolsQA 
When I search for a MagicMouse
And I add it to the cart
And I checkout and Continue
Then I should be navigated to checkout page

#Scenario: Select a Magic mouse
#Given I am logged into toolsQA 
#When I search for a MagicMouse
#And I add it to the cart
#And I checkout and Continue
#Then I should be navigated to checkout page

Scenario: Buy a Magic mouse
When I select India from the country dropdown
And I click on purchase 
Then I should be navigated to Trasaction results page
