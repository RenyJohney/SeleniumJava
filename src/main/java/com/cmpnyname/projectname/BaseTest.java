package com.cmpnyname.projectname;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.databene.feed4testng.FeedTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest extends FeedTest {
 
	WebDriver  driver;
	Properties prop;
 
  @Parameters({"browser"})
  @BeforeSuite
  public void setDriverProperties(String browser) {
	  switch(browser) {
	  
	  case  "firefox" : 
		  
	  break;
		  
	  case  "chrome" : 
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\renyjohney1988\\Documents\\Reny\\Study\\Testing\\Selenium\\chromedriver_win32_3\\chromedriver.exe");
		  driver = new ChromeDriver();
	  break;
	  
	  case  "default" : 
		  
	  break;
	  
	  
	  }
  }
  
  @BeforeTest
  public void loadPropertiesFile() {
	  prop = new Properties();
	  try {
		prop.load(new FileInputStream("C:\\Users\\renyjohney1988\\Selenium Eclipse Workspace\\Testing Course\\projectname\\src\\main\\java\\resources\\config.properties"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  @AfterSuite
  public void quitDriver() {
	  driver.close();
	  driver.quit();
  }

}
