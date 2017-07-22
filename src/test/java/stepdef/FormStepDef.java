package stepdef;

import cucumber.api.java.en.Then;
import pageobject.FormAuthentication;

public class FormStepDef {
	
	FormAuthentication fa =new FormAuthentication();
	
	@Then("^enter username as \"([^\"]*)\"$")
	public void enter_username_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 fa.enterUserName(arg1);   
	}

	@Then("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fa.password(arg1);
	}

	@Then("^click on login$")
	public void click_on_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fa.clickElementLogin();
	}

	@Then("^click on logout$")
	public void click_on_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
	 fa.clickElementLogout();  
	}


@Then("^click on click here link$")
public void click_on_click_here_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   fa.clickOn();
}

@Then("^switch to another window$")
public void switch_to_another_window() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   fa.switchToAnother();
}

}
