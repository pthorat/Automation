package pageobject;

import generic.SeleniumClass;

public class FormAuthentication  extends SeleniumClass{
 
	 String xpathUserName ="//input[@id='username']";                 // "html/body/div[2]/div/div/form/div[1]/div/input";
	 String xpathPassword = "//input[@id='password']";              //;html/body/div[2]/div/div/form/div[2]/div/input";
	 String xpathLoginButton = "//form[@id='login']/button";                  //html/body/div[2]/div/div/form/button";
	 String xpathErrorMsg = "//div[@id='flash']";                      //;"html/body/div[1]/div/div";
	 																//"html/body/div[2]/div/div/h4";
     String xpathLogout = "//div[@id='content']/div/a";             //;"html/body/div[2]/div/div/a";
     String xpathHeader = "//div[@id='content']/div/h2";
     String xpathWelcomeText = "//div[@id='content']/div/h4"; 
	 String xpathClickOn = "//*[@id='content']/div/a";

     public void enterUserName(String uname){
    	 element=this.locateElement(xpathUserName, "xpath");
    	 this.passvaluesToTextBox(element, uname);
     }
	public void password(String pword){
		element=this.locateElement(xpathPassword, "xpath");
		this.passvaluesToTextBox(element, pword);
	}
	public void clickElementLogin(){
		element=this.locateElement(xpathLoginButton, "xpath");
		this.ClickElement(element);
	}
 
	public void clickElementLogout(){
		element=this.locateElement(xpathLogout, "xpath");
		this.ClickElement(element);
	}
	public void clickOn(){
		element=this.locateElement(xpathClickOn,"xpath");
		this.ClickElement(element);
	}
	
	
	/*public void switchToAnother(){
		element= this.locateElement(address, type)
		
	}*/
}