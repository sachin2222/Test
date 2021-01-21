Feature: Validating  Place API


  Scenario Outline: Successful adding Place into the DB by AddPlace API.
    Given User have Required Payload "<name>","<address>","<website>","<accuracy>","<latitude>","<longitude>","<phone_number>","<Language>"
    When User calls the AddPlace API and post with HTTP Request.
    Then User get Status Code 200
    And user get the Status "OK"
    And User have the Required Place_id
    When User request the GetPlace API by GET HTTP Request.
    Then User should get Status Code 200.
    Then User Should get Response Body of the Required Place.


    Examples:
      | name  | address     | website        | accuracy | latitude | longitude | phone_number | Language |
      | Load1 | RestAssured | www.google.com | 10       | -37.899  | 78.87     | 100          | Hindi    |






