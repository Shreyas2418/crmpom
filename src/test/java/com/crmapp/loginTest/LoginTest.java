package com.crmapp.loginTest;

import java.util.ArrayList;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crmapp.base.ExcelReader;
import com.crmapp.pageObject.LoginPageObject;

public class LoginTest {
	
	@Test(dataProvider = "getData")
	public void testLogin(Object ussername, Object password) {
		System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		LoginPageObject pageObject = new LoginPageObject(driver);
		pageObject.getUssername().sendKeys(ussername.toString());
		pageObject.getpassword().sendKeys(password.toString());
		pageObject.getloginButton().click();
		driver.close();
		
	}
	@DataProvider
	public Object[][] getData(){
		ArrayList testData = ExcelReader.getTestData("D://loginTestData.xlsx");
		Object[] loginTestData = testData.toArray();
		Object[][] data = new Object[testData.size()/2][2];
		
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j<2; j++) {
				data[i][j] = loginTestData[count];
				count++;
			}
		}
		
		return data;
	}
}
