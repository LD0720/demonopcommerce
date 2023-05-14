@smoke
  Feature: F05_hoverCategories | user could hover on categories
    Scenario: User successfully hover over a category and choose a sub category
      Given hovering over a category
      When choosing a sub category
      Then the sub category title should be relevant to the category