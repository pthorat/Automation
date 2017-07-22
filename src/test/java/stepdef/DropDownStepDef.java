package stepdef;

import cucumber.api.java.en.Then;
import pageobject.DropDown;

public class DropDownStepDef {
  
	DropDown dd=new DropDown();
	 
	
	
	@Then("^select value by \"([^\"]*)\" with \"([^\"]*)\"$")
	public void select_value_by_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dd.selectValue(arg1, arg2);
	}
}
