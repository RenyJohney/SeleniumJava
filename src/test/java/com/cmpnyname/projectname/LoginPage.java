package com.cmpnyname.projectname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By userName = By.name("username");
	private By pwd = By.name("password");
	private By signInBtn = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"); 
	
	public void openLoginPage(String url) {
		getPage(url);
			
	}
	
	
	public void fillUpEmailPwd(String userName_s, String pwd_s) {
		System.out.println("*********User name = "+userName_s);
		typeValue(userName_s,userName);
		typeValue(pwd_s,pwd);
		
	}
	
	public void clickSignInBtn() {
		click(signInBtn);
		
	}

}
