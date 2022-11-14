package com.orm.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	private WebDriver driver;

	@FindBy(name = "username")
	private WebElement usernameField;
	
	@FindBy(name="password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement btn_login;
	
	public LoginPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void signIn(String username, String password) {
		System.out.println("sudah page factory");
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		btn_login.click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
