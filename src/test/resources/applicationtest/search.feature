Feature: Adding an iPhone to the Cart and Phone Search and Filter
Background:
    Given user should be on the website homepage
    
  Scenario: Search for iPhone, view details, and add to cart
   
    When user search for "iPhone" 
    And user select the iPhone from the list of results
    And user navigate to the product details page
    Then user should be able to store the price of the iPhone in a variable
    And user add the iPhone to the cart
    
Scenario: Register user and search for a phone with filters
    When user register as a new user
    And user search for "phone"
    And user apply filters for specific criteria
    Then user should see a filtered list of phones
    And the filtered list should match the applied criteria
    

