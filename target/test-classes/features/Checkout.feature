Feature: Place Order products
@PlaceOrderPage
Scenario Outline: Search experience for product search in both home and Offers page

Given User is on GreenCart Landing page
When user searched for Short name <Name> and extracted actual name of product
And Added "3" times the product to cart
Then user proceed and validate <Name> product in checkout page
And verify that user can enter Promo code and place order

Examples:
|Name|
|Tom|



