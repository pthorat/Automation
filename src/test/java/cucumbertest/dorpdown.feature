Feature: to verify from authontication functinality

Background: 
When user selects "Firefox" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in URL

@index
Scenario: select by index
Then click on "Dropdown"
Then select value by "index" with "1"

@index
Scenario: select by value
Then click on "Dropdown"
Then select value by "value" with "2"

@index
Scenario: select by text
Then click on "Dropdown"
Then select value by "text" with "Option 1"