$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Azar/Cucumber/src/test/java/featurepackage/usingdatatable.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook App Testing2",
  "description": "",
  "id": "facebook-app-testing2",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Facebook App Open2",
  "description": "",
  "id": "facebook-app-testing2;facebook-app-open2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User can open the fblogin page2",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User can enter username2",
  "rows": [
    {
      "cells": [
        "9573705757"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User can enter Password2",
  "rows": [
    {
      "cells": [
        "azar5757"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click login button2",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the logout link2",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the logout button2",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close the browser2",
  "keyword": "And "
});
formatter.match({
  "location": "Usingdatatablesstepdef.openbrowser()"
});
formatter.result({
  "duration": 32883180941,
  "status": "passed"
});
formatter.match({
  "location": "Usingdatatablesstepdef.Enterdetails(DataTable)"
});
formatter.result({
  "duration": 2897083491,
  "status": "passed"
});
formatter.match({
  "location": "Usingdatatablesstepdef.EnterPassword(DataTable)"
});
formatter.result({
  "duration": 876748378,
  "status": "passed"
});
formatter.match({
  "location": "Usingdatatablesstepdef.Clickloginbutton2()"
});
formatter.result({
  "duration": 551854409,
  "status": "passed"
});
formatter.match({
  "location": "Usingdatatablesstepdef.Clicklogoutlink2()"
});
formatter.result({
  "duration": 38739685726,
  "status": "passed"
});
formatter.match({
  "location": "Usingdatatablesstepdef.Clicklogoutbutton()"
});
formatter.result({
  "duration": 17292339485,
  "status": "passed"
});
formatter.match({
  "location": "Usingdatatablesstepdef.closebrowser2()"
});
formatter.result({
  "duration": 1463481084,
  "status": "passed"
});
});