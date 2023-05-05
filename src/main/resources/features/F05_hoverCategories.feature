@smoke
  Feature: F05_hoverCategories | user could hover on categories
    Scenario: User successfully hover over a category and choose a sub category
      Given user navigate to website
      When hovering over a category
      And choosing a sub category
      Then the sub category title should be relevant to the category