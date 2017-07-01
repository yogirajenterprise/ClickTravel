
Feature: login functionality with valid Credential

  @SmokeTest
Scenario: Successful authentication with valid credentials

Given a user with valid credentials
When user enter username qualityassurance@clicktravelcom
  And enter password Testing123
Then authentication is successful
And the user can view his dashboard
