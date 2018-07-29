$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/modelClassTest.feature");
formatter.feature({
  "name": "Model class test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing the model class, custom data type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@pojo_type"
    }
  ]
});
formatter.step({
  "name": "user logs in to application",
  "keyword": "Given "
});
formatter.step({
  "name": "user creates account for user info:",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "title",
        "first name",
        "last name",
        "phone number"
      ]
    },
    {
      "cells": [
        "\u003ctitle\u003e",
        "\u003cfirstName\u003e",
        "\u003clastName\u003e",
        "\u003cphoneNumber\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "user verifies stuff",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "title",
        "firstName",
        "lastName",
        "phoneNumber"
      ]
    },
    {
      "cells": [
        "Mr",
        "John",
        "Doe",
        "123123123"
      ]
    },
    {
      "cells": [
        "Mrs",
        "Emily",
        "Smith",
        "95494838392"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing the model class, custom data type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@pojo_type"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in to application",
  "keyword": "Given "
});
formatter.match({
  "location": "ModelClassTest_steps.user_logs_in_to_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates account for user info:",
  "rows": [
    {
      "cells": [
        "title",
        "first name",
        "last name",
        "phone number"
      ]
    },
    {
      "cells": [
        "Mr",
        "John",
        "Doe",
        "123123123"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ModelClassTest_steps.user_creates_account_for_user_info(User\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies stuff",
  "keyword": "And "
});
formatter.match({
  "location": "ModelClassTest_steps.user_verifies_stuff()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing the model class, custom data type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@pojo_type"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in to application",
  "keyword": "Given "
});
formatter.match({
  "location": "ModelClassTest_steps.user_logs_in_to_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates account for user info:",
  "rows": [
    {
      "cells": [
        "title",
        "first name",
        "last name",
        "phone number"
      ]
    },
    {
      "cells": [
        "Mrs",
        "Emily",
        "Smith",
        "95494838392"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ModelClassTest_steps.user_creates_account_for_user_info(User\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies stuff",
  "keyword": "And "
});
formatter.match({
  "location": "ModelClassTest_steps.user_verifies_stuff()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});