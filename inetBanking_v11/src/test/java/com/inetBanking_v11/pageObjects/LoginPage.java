package com.inetBanking_v11.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	WebElement txtUsername;

	@FindBy(name = "password")
	WebElement txtPassword;

	@FindBy(name = "btnLogin")
	WebElement btnLogin;

	public void setUsername(String uname) {

		txtUsername.sendKeys(uname);
	}

	public void setPassword(String pwd) {

		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() {
		btnLogin.click();

	}

}
