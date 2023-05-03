@smoke
  Feature: F03_currencies | user could change currency
    Scenario: User changes currency to euro successfully
      Given user navigate to website
      When user clicks on dropdown list
      And user chooses euro
      Then all elements' price on screen will contains the euro sign