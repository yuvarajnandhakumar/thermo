$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/CreateAccount.feature");
formatter.feature({
  "name": "Flipkart Automation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@thermofisher"
    }
  ]
});
formatter.scenario({
  "name": "Login into flipkart application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@thermofisher"
    },
    {
      "name": "@accountcreation"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Launch chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccount.launch_chromebrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Createaccount button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccount.click_on_Createaccount_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "bookmark the cookies",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccount.bookmark_the_cookies()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Login into flipkart application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@accountcreation"
    }
  ]
});
formatter.step({
  "name": "Launch chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on Createaccount button for \"\u003ccountry\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "bookmark the cookies",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "country"
      ]
    },
    {
      "cells": [
        "IN"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login into flipkart application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@thermofisher"
    },
    {
      "name": "@accountcreation"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Launch chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccount.launch_chromebrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Createaccount button for \"IN\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccount.click_on_Createaccount_button_for(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "bookmark the cookies",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccount.bookmark_the_cookies()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});