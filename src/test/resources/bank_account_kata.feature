Feature: Bank account kata
  management of bank account

  Scenario: deposit an amount in my account
    Given I have some money in my account
    When I deposit an amount in my account
    Then My balance must increase by the amount deposited