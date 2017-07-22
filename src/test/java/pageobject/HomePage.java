package pageobject;

import java.io.IOException;
import java.util.LinkedHashSet;

import generic.SeleniumClass;

public class HomePage  extends  SeleniumClass{
	private String linkTextHomeLinks ="%s";   //string value
	private String tagNameHomeLinks = "a";

	
	public void clickLink(String linkName){
		linkTextHomeLinks = String.format(linkTextHomeLinks, linkName);
		
		System.out.println(linkTextHomeLinks);
		 element= this.locateElement(linkTextHomeLinks, "linktext");
		 this.ClickElement(element);
	}
	public LinkedHashSet<String> getAllLinks(){
		
		
	this.listOfElements = super.locateElements(tagNameHomeLinks, "tagName"); //ask rohit
	System.out.println(this.listOfElements.size());
	//return super.getLinkTextFromWebElement(this.listOfElements);
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	lhs= super.getLinkTextFromWebElement(this.listOfElements);

		try {
			this.writeExcel("Prafulla.xlsx",lhs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		
	return lhs;
	}
	public void verifyAllLinks( LinkedHashSet<String> linkTextLink){
		
	
	}
	
	
	//Form Authontication
}
