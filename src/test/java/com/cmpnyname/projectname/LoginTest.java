package com.cmpnyname.projectname;

import org.databene.benerator.anno.Source;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
    @Test(description="Positive Test", priority=1, dataProvider="feeder")
    @Source("src\\main\\java\\resources\\TestData.csv")
  public void PositiveLoginTest(String user,String pwd) throws InterruptedException {
    	
    	String url = prop.getProperty("url");
    	System.out.println("**********************"+url);
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.openLoginPage(url);
    	Thread.sleep(4000);
    	loginPage.fillUpEmailPwd(user, pwd);
    	loginPage.clickSignInBtn();
    	System.out.println(driver.getTitle());
    	
    	
  }
}
