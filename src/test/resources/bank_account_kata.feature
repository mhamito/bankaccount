Feature: Bank account kata
  management of bank account

  Scenario: Deposit 500 euro in account and ask statement balance
    Given I deposit 500 euro in account
    When I ask the account balance
    Then My balance should be 500 euro

  Scenario: Withdrawal 300 euro from account that have 500 euro and ask statement balance
    Given I deposit 500 euro in account
    And I withdrawal 300 euro from account
    When I ask the account balance
    Then My balance should be 200 euro

  Scenario: Multiple Deposit / withdrawal operations and ask statement balance
    Given I deposit 500 euro in account
    And I withdrawal 100 euro from account
    And I deposit 400 euro in account
    And I withdrawal 200 euro from account
    When I ask the account balance
    Then My balance should be 600 euro

  Scenario: Try to deposit -500 euro in account
    Given I deposit 400 euro in account
    When I try to deposit -500 euro in account
    Then I should be told "Your amount is incorrect"

  Scenario: Try to withdrawal -500 from account
    Given I deposit 400 euro in account
    When I try to withdrawal -500 euro from account
    Then I should be told "Your amount is incorrect"

  Scenario: Deposit 500 euro in account and try to withdrawal 700 euro
    Given I deposit 500 euro in account
    When I try to withdrawal 700 euro from account
    Then I should be told "Your amount is greater then your balance"

    