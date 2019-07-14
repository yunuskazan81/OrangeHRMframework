$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on PIM link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_PIM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on  Add Employee link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_Add_Employee_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add data from Excel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ExcelData"
    }
  ]
});
formatter.step({
  "name": "I provide employee details from excel \"Locations\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_provide_employee_details_from_excel(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca href\u003d\"#/pim/addEmployee\" ui-sref\u003d\"pim.add_employee\" ui-sref-opts\u003d\"{reload: true, notify: true}\" ng-attr-target\u003d\"{{undefined}}\" id\u003d\"menu_pim_addEmployee\" class\u003d\"waves-effect waves-orange active current\"\u003e...\u003c/a\u003e is not clickable at point (95, 395). Other element would receive the click: \u003cdiv class\u003d\"lean-overlay\" id\u003d\"materialize-lean-overlay-1\" style\u003d\"z-index: 1002; display: block; opacity: 0.5;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d75.0.3770.100)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dMac OS X 10.14.5 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Yunuss-MacBook-Pro.local\u0027, ip: \u00272601:586:200:5106:0:0:0:847%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.5\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: /var/folders/rw/tbwnwbx91q5...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53121}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.100, webStorageEnabled: true}\nSession ID: 6eab1ee02901fc4060bff1fb8884712e\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\n\tat com.orangehrm.steps.AddEmployeeSteps.i_provide_employee_details_from_excel(AddEmployeeSteps.java:174)\n\tat ✽.I provide employee details from excel \"Locations\"(file:src/test/resources/features/AddEmployee.feature:40)\n",
  "status": "failed"
});
formatter.step({
  "name": "I click on create login details",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_create_login_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I provide all mandatory fields",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_provide_all_mandatory_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see employee is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_employee_is_added_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});