$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/AddPlace.feature");
formatter.feature({
  "line": 1,
  "name": "Validating  Place API",
  "description": "",
  "id": "validating--place-api",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Successful adding Place into the DB by AddPlace API.",
  "description": "",
  "id": "validating--place-api;successful-adding-place-into-the-db-by-addplace-api.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User have Required Payload \"\u003cname\u003e\",\"\u003caddress\u003e\",\"\u003cwebsite\u003e\",\"\u003caccuracy\u003e\",\"\u003clatitude\u003e\",\"\u003clongitude\u003e\",\"\u003cphone_number\u003e\",\"\u003cLanguage\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User calls the AddPlace API and post with HTTP Request.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User get Status Code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user get the Status \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User have the Required Place_id",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User request the GetPlace API by GET HTTP Request.",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should get Status Code 200.",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Should get Response Body of the Required Place.",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "validating--place-api;successful-adding-place-into-the-db-by-addplace-api.;",
  "rows": [
    {
      "cells": [
        "name",
        "address",
        "website",
        "accuracy",
        "latitude",
        "longitude",
        "phone_number",
        "Language"
      ],
      "line": 16,
      "id": "validating--place-api;successful-adding-place-into-the-db-by-addplace-api.;;1"
    },
    {
      "cells": [
        "Load1",
        "RestAssured",
        "www.google.com",
        "10",
        "-37.899",
        "78.87",
        "100",
        "Hindi"
      ],
      "line": 17,
      "id": "validating--place-api;successful-adding-place-into-the-db-by-addplace-api.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Successful adding Place into the DB by AddPlace API.",
  "description": "",
  "id": "validating--place-api;successful-adding-place-into-the-db-by-addplace-api.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User have Required Payload \"Load1\",\"RestAssured\",\"www.google.com\",\"10\",\"-37.899\",\"78.87\",\"100\",\"Hindi\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User calls the AddPlace API and post with HTTP Request.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User get Status Code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user get the Status \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User have the Required Place_id",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User request the GetPlace API by GET HTTP Request.",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should get Status Code 200.",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Should get Response Body of the Required Place.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Load1",
      "offset": 28
    },
    {
      "val": "RestAssured",
      "offset": 36
    },
    {
      "val": "www.google.com",
      "offset": 50
    },
    {
      "val": "10",
      "offset": 67
    },
    {
      "val": "-37.899",
      "offset": 72
    },
    {
      "val": "78.87",
      "offset": 82
    },
    {
      "val": "100",
      "offset": 90
    },
    {
      "val": "Hindi",
      "offset": 96
    }
  ],
  "location": "Parameterized_Test.user_have_Required_Payload(String,String,String,int,double,double,String,String)"
});
formatter.result({
  "duration": 2629664200,
  "status": "passed"
});
formatter.match({
  "location": "Parameterized_Test.user_calls_the_AddPlace_API_and_post_with_HTTP_Request()"
});
formatter.result({
  "duration": 2050707300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 21
    }
  ],
  "location": "Parameterized_Test.user_get_Status_Code(int)"
});
formatter.result({
  "duration": 53968400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OK",
      "offset": 21
    }
  ],
  "location": "Parameterized_Test.user_get_the_Status(String)"
});
formatter.result({
  "duration": 667378400,
  "status": "passed"
});
formatter.match({
  "location": "Parameterized_Test.user_have_the_Required_Place_id()"
});
formatter.result({
  "duration": 17452900,
  "status": "passed"
});
formatter.match({
  "location": "Parameterized_Test.user_request_the_GetPlace_API_by_GET_HTTP_Request()"
});
formatter.result({
  "duration": 1866508700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 28
    }
  ],
  "location": "Parameterized_Test.user_should_get_Status_Code(int)"
});
formatter.result({
  "duration": 1840600,
  "status": "passed"
});
formatter.match({
  "location": "Parameterized_Test.user_Should_get_Response_Body_of_the_Required_Place()"
});
formatter.result({
  "duration": 835700,
  "status": "passed"
});
});