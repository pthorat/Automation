package pageobject;

import generic.SeleniumClass;

public class DropDown extends SeleniumClass {
	
String idDropdown = "dropdown";
 
public void selectValue(String type,String value){
	element =this.locateElement(idDropdown, "id");
	super.dropDownlist(type, value,element);
}
	

}
