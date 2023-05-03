@smoke
  Feature: F04_Search | User should be able to search using product name or sku
    Scenario: User could search using product name
      Given user navigate to website
      When user click on search box
      And user write the product name as "<product name>"
      And click search
      Then right results should appear
      |product name|
      |nike|


    Scenario:  User could search using sku
      Given user navigate to website
      When user click on search box
      And user write the sku as "<sku>"
      And click search
      Then right results should appear
      |sku|
      |SCI_FAITH|

