package com.inetBanking_v11.testCases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking_v11.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.get(baseURL);

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		lp.setUsername(username);
		lp.setPassword(password);
		logger.info("Password is entered");
		lp.clickSubmit();

		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {

			Assert.assertTrue(true);
			logger.info("Login is pass - test");
		}

		else {
			Assert.assertTrue(false);

			logger.info("Login is fail");
		}
	}
	
	@Test
	public void getListMenu() {
		
		List<WebElement>items=driver.findElements(By.xpath("//ul[@class=\"menusubnav\"]/li/a"));
		int noOfItems=driver.findElements(By.xpath("//ul[@class=\"menusubnav\"]/li/a")).size();
		
		for(int i=0;i<noOfItems;i++) {
			
			String itemName=items.get(i).getText();
			System.out.println("itemName="+ itemName);
			
		}
	}

}
