@read_feature
Feature: database features
  Scenario: TC01_read_customer_information
    Given user connects to the database
    And user gets the "*" from "tp_customer" table
#    Select * from tp_customer; Select all column from tp_customer table
    And user reads all of the "ssn" column data
