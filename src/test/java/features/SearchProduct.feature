Feature: Search and place Order products
@SearchOfferPage
Scenario Outline: Search experience for product search in both home and Offers page

Given User is on GreenCart Landing page
When user searched for Short name <Name> and extracted actual name of product
Then user searched for <Name> Short name in Offers page to check if product exist with same name
And Validate Product name in landing page matches with Offer page

Examples:
|Name|
|Tom|
|Beet|



