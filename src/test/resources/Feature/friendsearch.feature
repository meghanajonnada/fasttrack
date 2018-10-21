Feature: Facebook logout
Scenario: Facebook login test
Given user opens "chrome" user types "https://www.facebook.com/"
When user enters "jgvmeghana@gmail.com" and "14july1996"
And user clicks on login
And is on facebook home page
And user searches for "Meghana Jonnada"
And user clicks on friends profile
And user clicks on home
And user clicks on settings
Then user clicks on logout

