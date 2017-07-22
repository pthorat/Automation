Feature: To verify home page links are working 
Background: 
When user selects "Firefox" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in URL

@tag2
Scenario Outline: To verify home page links aer working 
Then click on <linkname>
Then verify <URL> is present in URL
Examples:
    | linkname  |URL |
    | "A/B Testing" | "abtest"   | 
    #| "Broken Images" |  "broken_images "  | 
    #|"Challenging DOM" |"challenging_dom"|
    #|"Checkboxes"| "checkboxes"|
    #| "Context Menu" |"context_menu"|
    
 @allLink  
Scenario: get all links present on hame page and verify linktext
Then verify "https://the-internet.herokuapp.com/" is present in URL
#And verify all links

 