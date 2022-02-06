@scenario_outline_search
Feature: search_using_scenario_outline
  Background: user_is_on_the_page
    Given user is on the google page
    #Scenario Outline MUST HAVE EXAMPLE KEYWORD
  # Example is used to pass test data
  Scenario Outline: google_search_test
    When user search for "<item>"
    Then verify the result has "<item>"
    Then close the application
    Examples: test_data
      |item    |
      |iPhone  |
      |tea pot |
      |tesla   |
      |honda   |
      |broadway|
#What is scenario outline? When do you use?
# Scenario Outline is used to run same scenario with multiple different test data.
# Scenario Outline makes the feature files shorter
# Scenario outline must followed by Example keyword
# Examples is used to pass test data.
# Scenario outline is especially used for Data Driven Testing(DDT)
# Data Driven Testing means use multiple external test data. It is like using excel data.