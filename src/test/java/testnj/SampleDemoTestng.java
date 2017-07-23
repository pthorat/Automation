package testnj;

import org.testng.annotations.Test;

import pageobject.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class SampleDemoTestng {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  HomePage hp =new HomePage();
	  hp.selectBrowser("firefox");
	  hp.launchApp("https://www.google.com");
	  hp.closeAPP(true);
	  System.out.println("Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }


  @DataProvider
  public Object[][] dp() {
	   System.out.println("Test");
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
   
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("TbeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersiute");
  }

}
