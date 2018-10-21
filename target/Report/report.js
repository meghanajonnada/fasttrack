$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("activitylog.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook message",
  "description": "",
  "id": "facebook-message",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Facebook login test",
  "description": "",
  "id": "facebook-message;facebook-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user opens \"chrome\" user types \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters \"jgvmeghana@gmail.com\" and \"14july1996\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "is on facebook home page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on settings",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user selects Activitylog",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user must view Activity log page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 12
    },
    {
      "val": "https://www.facebook.com/",
      "offset": 32
    }
  ],
  "location": "Launchstepdef.user_opens_Facebook(String,String)"
});
formatter.result({
  "duration": 9467102294,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jgvmeghana@gmail.com",
      "offset": 13
    },
    {
      "val": "14july1996",
      "offset": 40
    }
  ],
  "location": "Launchstepdef.user_enters_credentials(String,String)"
});
formatter.result({
  "duration": 508000000,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdef.user_clicks_on_login()"
});
formatter.result({
  "duration": 5195802880,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdef.user_is_on_home_page()"
});
formatter.result({
  "duration": 509470293,
  "status": "passed"
});
formatter.match({
  "location": "Iconsstepdef.user_clicks_on_settings()"
});
formatter.result({
  "duration": 7250056533,
  "status": "passed"
});
formatter.match({
  "location": "Iconsstepdef.user_selects_activity_log()"
});
formatter.result({
  "duration": 10469803093,
  "status": "passed"
});
formatter.match({
  "location": "Iconsstepdef.user_must_view_activitylog()"
});
formatter.result({
  "duration": 503437226,
  "status": "passed"
});
formatter.match({
  "location": "Iconsstepdef.user_clicks_on_logout()"
});
formatter.result({
  "duration": 10167695786,
  "status": "passed"
});
formatter.uri("friendsearch.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook logout",
  "description": "",
  "id": "facebook-logout",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Facebook login test",
  "description": "",
  "id": "facebook-logout;facebook-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user opens \"chrome\" user types \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters \"jgvmeghana@gmail.com\" and \"14july1996\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "is on facebook home page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user searches for \"Meghana Jonnada\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on friends profile",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on home",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on settings",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on logout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 12
    },
    {
      "val": "https://www.facebook.com/",
      "offset": 32
    }
  ],
  "location": "Launchstepdef.user_opens_Facebook(String,String)"
});
formatter.result({
  "duration": 7983712000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jgvmeghana@gmail.com",
      "offset": 13
    },
    {
      "val": "14july1996",
      "offset": 40
    }
  ],
  "location": "Launchstepdef.user_enters_credentials(String,String)"
});
formatter.result({
  "duration": 530332160,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdef.user_clicks_on_login()"
});
formatter.result({
  "duration": 3916303360,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdef.user_is_on_home_page()"
});
formatter.result({
  "duration": 261724587,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Meghana Jonnada",
      "offset": 19
    }
  ],
  "location": "Searchfriendstepdef.user_searches_for(String)"
});
formatter.result({
  "duration": 1097545386,
  "status": "passed"
});
formatter.match({
  "location": "Searchfriendstepdef.user_clicks_on_friends_profile()"
});
formatter.result({
  "duration": 11475022080,
  "status": "passed"
});
formatter.match({
  "location": "Iconsstepdef.user_clicks_on_home()"
});
formatter.result({
  "duration": 111626667,
  "status": "passed"
});
formatter.match({
  "location": "Iconsstepdef.user_clicks_on_settings()"
});
formatter.result({
  "duration": 7216915200,
  "status": "passed"
});
formatter.match({
  "location": "Iconsstepdef.user_clicks_on_logout()"
});
formatter.result({
  "duration": 7180090027,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-N5IJKTU1\u0027, ip: \u002725.130.10.219\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578737 (49da6702b16031..., userDataDir: C:\\Users\\MULESO~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62142}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: a0be1e8576d09a8f90f9c12d4a946d4e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat method.Methods.clickLogout(Methods.java:301)\r\n\tat stepDefinition.Iconsstepdef.user_clicks_on_logout(Iconsstepdef.java:28)\r\n\tat ✽.Then user clicks on logout(friendsearch.feature:11)\r\n",
  "status": "failed"
});
formatter.uri("message.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook message",
  "description": "",
  "id": "facebook-message",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Facebook login test",
  "description": "",
  "id": "facebook-message;facebook-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user opens \"chrome\" user types \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters \"jgvmeghana@gmail.com\" and \"14july1996\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "is on facebook home page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user searches for \"Meghana Jonnada\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on friends profile",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user sends him message \"hai\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 12
    },
    {
      "val": "https://www.facebook.com/",
      "offset": 32
    }
  ],
  "location": "Launchstepdef.user_opens_Facebook(String,String)"
});
formatter.result({
  "duration": 8331256747,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jgvmeghana@gmail.com",
      "offset": 13
    },
    {
      "val": "14july1996",
      "offset": 40
    }
  ],
  "location": "Launchstepdef.user_enters_credentials(String,String)"
});
formatter.result({
  "duration": 496305494,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdef.user_clicks_on_login()"
});
formatter.result({
  "duration": 5340666454,
  "status": "passed"
});
formatter.match({
  "location": "Launchstepdef.user_is_on_home_page()"
});
formatter.result({
  "duration": 456404480,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Meghana Jonnada",
      "offset": 19
    }
  ],
  "location": "Searchfriendstepdef.user_searches_for(String)"
});
formatter.result({
  "duration": 988060160,
  "status": "passed"
});
formatter.match({
  "location": "Searchfriendstepdef.user_clicks_on_friends_profile()"
});
formatter.result({
  "duration": 10938941440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hai",
      "offset": 24
    }
  ],
  "location": "Searchfriendstepdef.user_sends_him_message(String)"
});
formatter.result({
  "duration": 3178432000,
  "status": "passed"
});
});