@smoke
  Feature: F04_Search | User should be able to search using product name or sku
    Scenario Outline: User could search using product name
      Given user navigate to website
      When user click on search box
      And user write the product name as "<product name>"
      And click search
      Then right results should appear based on product name
      Examples:
      |product name|
      |nike|


    Scenario Outline:  User could search using sku
      Given user navigate to website
      When user click on search box
      And user write the sku as "<sku>"
      And click search
      Then right results should appear based on sku
      Examples:
      |sku|
      |SCI_FAITH|

