$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/AddPlace.feature");
formatter.feature({
  "line": 2,
  "name": "Validating  AddPlace/GetPlace API Response",
  "description": "",
  "id": "validating--addplace/getplace-api-response",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Successful Adding Place and Getting Same Place .",
  "description": "",
  "id": "validating--addplace/getplace-api-response;successful-adding-place-and-getting-same-place-.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User have Required Payload \"\u003cname\u003e\",\"\u003caddress\u003e\",\"\u003cwebsite\u003e\",\"\u003caccuracy\u003e\",\"\u003clatitude\u003e\",\"\u003clongitude\u003e\",\"\u003cphone_number\u003e\",\"\u003cLanguage\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User calls the AddPlace API and post with HTTP Request.",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User get Status Code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user Should get the Status \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Have Required PlaceID to Get Resposne",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Hit the GetPlaceAPI through GET HTTP Request",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User should get the Response Body of Place.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Status Code Should be  200.",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "validating--addplace/getplace-api-response;successful-adding-place-and-getting-same-place-.;",
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
      "id": "validating--addplace/getplace-api-response;successful-adding-place-and-getting-same-place-.;;1"
    },
    {
      "cells": [
        "New1",
        "RestAssured",
        "www.google.com",
        "10",
        "-37.899",
        "78.87",
        "100",
        "Hindi"
      ],
      "line": 17,
      "id": "validating--addplace/getplace-api-response;successful-adding-place-and-getting-same-place-.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Successful Adding Place and Getting Same Place .",
  "description": "",
  "id": "validating--addplace/getplace-api-response;successful-adding-place-and-getting-same-place-.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User have Required Payload \"New1\",\"RestAssured\",\"www.google.com\",\"10\",\"-37.899\",\"78.87\",\"100\",\"Hindi\"",
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
  "line": 7,
  "name": "User calls the AddPlace API and post with HTTP Request.",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User get Status Code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user Should get the Status \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Have Required PlaceID to Get Resposne",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Hit the GetPlaceAPI through GET HTTP Request",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User should get the Response Body of Place.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Status Code Should be  200.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New1",
      "offset": 28
    },
    {
      "val": "RestAssured",
      "offset": 35
    },
    {
      "val": "www.google.com",
      "offset": 49
    },
    {
      "val": "10",
      "offset": 66
    },
    {
      "val": "-37.899",
      "offset": 71
    },
    {
      "val": "78.87",
      "offset": 81
    },
    {
      "val": "100",
      "offset": 89
    },
    {
      "val": "Hindi",
      "offset": 95
    }
  ],
  "location": "AddPlace.user_have_Required_Payload(String,String,String,int,double,double,String,String)"
});
formatter.result({
  "duration": 3104990500,
  "status": "passed"
});
formatter.match({
  "location": "AddPlace.user_calls_the_AddPlace_API_and_post_with_HTTP_Request()"
});
formatter.result({
  "duration": 1978575300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 21
    }
  ],
  "location": "AddPlace.user_get_Status_Code(int)"
});
formatter.result({
  "duration": 2669600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OK",
      "offset": 28
    }
  ],
  "location": "AddPlace.user_Should_get_the_Status(String)"
});
formatter.result({
  "duration": 133100,
  "status": "passed"
});
formatter.match({
  "location": "AddPlace.user_Have_Required_PlaceID_to_Get_Resposne()"
});
formatter.result({
  "duration": 8035500,
  "status": "passed"
});
formatter.match({
  "location": "AddPlace.user_Hit_the_GetPlaceAPI_through_GET_HTTP_Request()"
});
formatter.result({
  "duration": 1971962500,
  "status": "passed"
});
formatter.match({
  "location": "AddPlace.user_should_get_the_Response_Body_of_Place()"
});
formatter.result({
  "duration": 60000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 23
    }
  ],
  "location": "AddPlace.status_Code_Should_be(int)"
});
formatter.result({
  "duration": 184900,
  "status": "passed"
});
});