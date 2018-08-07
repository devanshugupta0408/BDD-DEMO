$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("conf.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3467674844,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@execute"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Conference room booking pag",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User select \u0027Next\u0027 link after entering Valid set of information",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Personal details are validated. message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "ConferenceStepDef.user_is_on_Conference_room_booking_pag()"
});
formatter.result({
  "duration": 901586161,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceStepDef.user_select_Next_link_after_entering_Valid_set_of_information()"
});
formatter.result({
  "duration": 1504986838,
  "status": "passed"
});
formatter.match({
  "location": "ConferenceStepDef.personal_details_are_validated_message_should_display()"
});
formatter.result({
  "duration": 17960,
  "status": "passed"
});
});