package stepdef;

import java.util.LinkedHashSet;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import pageobject.HomePage;    //need more explanation 

public class HomeStepdef {
	
	
	
	HomePage hp =new HomePage();
	


@When("^user selects \"([^\"]*)\" browser$")
public void user_select_s_browser(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     hp.selectBrowser(arg1);
    
}

@When("^launches \"([^\"]*)\"$")
public void launches(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	hp.launchApp(arg1);
	
}
@Then("^verify \"([^\"]*)\" is present in URL$")
public void verify_is_present_in_URL(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   hp.verifyCurrentURL(arg1);
   
}

@Then("^click on \"([^\"]*)\"$")
public void click_on(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    hp.clickLink(arg1);
    
}


@After
@Then("^close application$")
public void close_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//	System.out.println("close browser");
	hp.closeAPP(true);
}

@Then("^get all links present on home page$")
public void get_all_links_present_on_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 LinkedHashSet<String> lhs = hp.getAllLinks();
	 hp.verifyAllLinks(lhs);
}



}





