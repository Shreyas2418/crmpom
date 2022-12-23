package com.crmapp.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {
	
	ChromeDriver driver;
	public LoginPageObject(ChromeDriver driver) {
		this.driver = driver;
	}
	
	By ussername = By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='pass']");
	By loginButton = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button");
	
	public WebElement getUssername() {
		WebElement usserName = driver.findElement(ussername);
		return usserName;
	}
	public WebElement getpassword() {
		WebElement pass = driver.findElement(password);
		return pass;
	}
	public WebElement getloginButton() {
		WebElement login = driver.findElement(loginButton);
		return login;
	}
}
