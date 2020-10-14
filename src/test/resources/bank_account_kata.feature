Feature: Bank account kata
  management of bank account

  Scenario: deposit an amount in my account
    Given I have some money in my account
    When I deposit an amount in my account
    Then My balance must increase by the amount deposited

  Scenario: deposit a negative amount in my account
    Given I have some money in my account
    When I try to deposit a negative amount in my account
    Then I should be told "Your amount is incorrect"

  Scenario: withdrawal an amount from my account
    Given I have some money in my account
    When I withdrawal an amount from my account
    Then My balance must decrease by the amount deposited

  Scenario: withdrawal a negative amount from my account
    Given I have some money in my account
    When I try withdrawal a negative amount from my account
    Then I should be told "Your amount is incorrect"

  Scenario: withdrawal an amount greater then my balance from my account
    Given I have some money in my account
    When I try withdrawal an amount greater then my balance from my account
    Then I should be told "Your amount is greater then your balance"