$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/shoppingDressTypes.feature");
formatter.feature({
  "name": "Shopping Dress types",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.background({
  "name": "Going to homepage and hover over on dresses",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to shopping homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ShppingDressTypes_steps.user_goes_to_shopping_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hovers over on Dresses",
  "keyword": "And "
});
formatter.match({
  "location": "ShppingDressTypes_steps.user_hovers_over_on_Dresses()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of Summer Dresses",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@uniqueID"
    }
  ]
});
formatter.step({
  "name": "user clicks on Summer Dresses",
  "keyword": "When "
});
formatter.match({
  "location": "ShppingDressTypes_steps.user_clicks_on_Summer_Dresses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page should display \"SUMMER DRESSES\" header",
  "keyword": "Then "
});
formatter.match({
  "location": "ShppingDressTypes_steps.page_should_display_header(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: Shopping casual dresses verificatiopn:  expected:\u003cSUMMER DRESSES[]\u003e but was:\u003cSUMMER DRESSES[ ]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat steps.ShppingDressTypes_steps.page_should_display_header(ShppingDressTypes_steps.java:36)\n\tat ✽.page should display \"SUMMER DRESSES\" header(src/test/resources/features/shoppingDressTypes.feature:16)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("THIS SCENARIO FAILED");
formatter.after({
  "status": "passed"
});
});