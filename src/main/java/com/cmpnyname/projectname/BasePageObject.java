package com.cmpnyname.projectname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public BasePageObject(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}
	
	public void getPage(String url) {
		driver.get(url);
		
	}
	
	public WebElement waitForElement(By locator) {
		
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}
	
	public void typeValue(String value, By locator){
		
		waitForElement(locator).sendKeys(value);
	}
	
	public String getValue(By locator) {
		String value = waitForElement(locator).getText();
		return value;
	}
	
	public void click(By locator) {
		waitForElement(locator).click();
		
	}
	

}
