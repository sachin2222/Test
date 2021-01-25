$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/Delete.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Delete API",
  "description": "",
  "id": "validate-delete-api",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Delete API Test",
  "description": "",
  "id": "validate-delete-api;delete-api-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User have Place_id to Delete Places",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Calls the Delete API by Delete HTTP Request",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User get the Status \"OK\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});