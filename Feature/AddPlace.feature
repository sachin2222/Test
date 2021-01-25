
Feature: Validating  AddPlace/GetPlace API Response


  Scenario Outline:Successful Adding Place and Getting Same Place .
    Given User have Required Payload "<name>","<address>","<website>","<accuracy>","<latitude>","<longitude>","<phone_number>","<Language>"
    When User calls the AddPlace API and post with HTTP Request.
    Then User get Status Code 200
    And user Should get the Status "OK"
    Then User Have Required PlaceID to Get Resposne
    Then  User Hit the GetPlaceAPI through GET HTTP Request
    Then User should get the Response Body of Place.
    Then  Status Code Should be  200.

    Examples:
      | name  | address     | website        | accuracy | latitude | longitude | phone_number | Language |
      | New1 | RestAssured | www.google.com | 10       | -37.899  | 78.87     | 100          | Hindi    |













