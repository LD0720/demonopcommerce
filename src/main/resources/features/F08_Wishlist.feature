@smoke
  Feature: F08_Wishlist | user should be able to add an object to wishlist
    Scenario: user should be able to see success message
      Given user click on add to wishlist
      Then success message will appear with a green background

    Scenario: user should be able to see the added object in the wishlist
      Given user click on add to wishlist
      When success message appear wait
      And user clicks on wishlist button
      Then quantity is bigger than one