package generic;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public abstract  class SeleniumClass extends BaseClass{
	
	static WebDriver driver;
	protected WebElement element;
	protected List <WebElement> listOfElements =  new ArrayList<WebElement>();
	
	
	public void selectBrowser(String browserName){
		System.out.println("Selecting "+  browserName + "browser");
		
		String path = this.setPath("\\src\\test\\java\\util\\");
		if (browserName.equalsIgnoreCase("FireFox")){
    	   
    	      System.setProperty("webdriver.gecko.driver",path+ "geckodriver.exe");
	
	          driver= new FirefoxDriver();
         }else if(browserName.equalsIgnoreCase("Chrome")){
	
    	   
    	   System.setProperty("webdriver.chrome.driver","src\\test\\java\\cucumbertest");
	       driver =new ChromeDriver();
	
         }else if (browserName.equalsIgnoreCase("ie")){
    	  System.setProperty("webdriver.ie.driver", "src\\test\\java\\cucumbertest");
	       driver = new InternetExplorerDriver();
	        }else{
	          System.out.println("Incorrect browser");
          }	
      }


public void launchApp(String URL){
	
	System.out.println("Launching" + URL );
	driver.get(URL);
   }

	 public void verifyCurrentURL(String ExceptedURL){
		 
		 String actualURL = driver.getCurrentUrl(); 
		 assert actualURL.contains(ExceptedURL): ExceptedURL  + " is not matching " + actualURL; 
	 }
	 
 
         public void closeAPP(boolean cl){   //when execute else loop
         	if (cl){
		         driver.quit();
		    }else{
		         driver.close();
	        }
      }
     public WebElement locateElement(String address,String type ){  //String address..?
	       if(type.equalsIgnoreCase("linktext")){
	       return driver.findElement(By.linkText(address));
	
            }
	       else if (type.equalsIgnoreCase("id")){
	    	   return driver.findElement(By.id(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("class")){
	    	   return driver.findElement(By.className(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("name")){
	    	   return driver.findElement(By.name(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("tagName")){
	    	   return driver.findElement(By.tagName(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("css")){
	    	   return driver.findElement(By.cssSelector(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("xpath")){
	    	   return driver.findElement(By.xpath(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("partialLinkText")){
	    	   return driver.findElement(By.partialLinkText(address));
	    	   
	       }
	      
          return null;	
     }     

      public void ClickElement(WebElement element){
       element.click();
     }
	 public void passvaluesToTextBox(WebElement element,String value){
		 
		 element.sendKeys(value);
	 }
      
      public List<WebElement> locateElements(String address,String type ){  //String address..?
	       if(type.equalsIgnoreCase("linktext")){
	       return driver.findElements(By.linkText(address));
	
           }
	       else if (type.equalsIgnoreCase("id")){
	    	   return driver.findElements(By.id(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("class")){
	    	   return driver.findElements(By.className(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("name")){
	    	   return driver.findElements(By.name(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("tagName")){
	    	   return driver.findElements(By.tagName(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("css")){
	    	   return driver.findElements(By.cssSelector(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("xpath")){
	    	   return driver.findElements(By.xpath(address));
	    	   
	       }
	       else if (type.equalsIgnoreCase("partialLinkText")){
	    	   return driver.findElements(By.partialLinkText(address));
	    	   
	       }
	      
         return null;	
    }
      
      public LinkedHashSet<String> getLinkTextFromWebElement(List<WebElement> list){
    	  
    	  LinkedHashSet<String> lhs = new  LinkedHashSet<String>();
    	  
    	  for(WebElement element: list ){
    		  System.out.println(element.getText());
    		  lhs.add(element.getText());
    			
    		}
    	  return lhs;
      }
      
      public void switchToAnother(){
    	  String parentWindowHandle = driver.getWindowHandle();
    	  Set<String> handles = driver.getWindowHandles();
    	  for(String Key: handles){
    		  if (Key.equalsIgnoreCase(parentWindowHandle)){
    			  continue;
    		  }
    		  else{
    			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			  driver.switchTo().window(Key);
    			  System.out.println(driver.getTitle());
    			  break;
    		  }
    	  
    	  }
      }
      
    		  public void dropDownlist(String type,String value, WebElement element2){
    			  
    			  Select st =new Select(element2);
    			  
    			  if(type.equalsIgnoreCase("index")){
    				  st.selectByIndex(Integer.parseInt(value));
    				  
    			  }
    			  else if(type.equalsIgnoreCase("value")){
    				  st.selectByValue(value);
    			  }
    			  else if (type.equalsIgnoreCase("text")){
    				  st.selectByVisibleText(value);
    				  
    			  }
    	  
    	  
    	  
    	  
    	  
      }
}

