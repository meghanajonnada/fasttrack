Feature: Facebook message
Scenario: Facebook login test
Given user opens "chrome" user types "https://www.facebook.com/"
When user enters "jgvmeghana@gmail.com" and "14july1996"
And user clicks on login
And is on facebook home page
And user clicks on settings
And user selects Activitylog
Then user must view Activity log page
And user clicks on logout
