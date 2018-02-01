# Created by patrick at 16/7/10
Feature: For sharing state
  in order to share state in different instance
  As as instance
  every instance should be have the same state

  Scenario: init state
    Given one instance change the state to init
    When another instance get the state
    Then The state is init