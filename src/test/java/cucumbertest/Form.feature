Feature: to verify from authontication functinality

Background: 
When user selects "Firefox" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in URL
@login
Scenario: Verfiy the from Authentication
Then click on "Form Authentication"
Then verify "login" is present in URL
Then enter username as "tomsmith1"
Then enter password as "SuperSecretPassword4!"
Then click on login 

Then verify "secure" is present in URL
And click on logout

@multiple
Scenario: Verfiry multple window 
Then click on "Multiple Windows"
Then verify "windows" is present in URL
And click on click here link
Then switch to another window
Then verify "windows/new" is present in URL
Then switch to another window
Then verify "windows" is present in URL