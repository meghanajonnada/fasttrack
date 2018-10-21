Feature: Facebook message
Scenario: Facebook login test
Given user opens "chrome" user types "https://www.facebook.com/"
When user enters "jgvmeghana@gmail.com" and "14july1996"
And user clicks on login
And is on facebook home page
And user searches for "Meghana Jonnada"
And user clicks on friends profile
Then user sends him message "hai"

