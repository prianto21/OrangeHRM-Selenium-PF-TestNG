package com.orm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
//	private WebDriver driver;
	
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	WebElement tab_user;
	
	@FindBy(xpath = "//a[normalize-space()='About']")
	WebElement aboutBtn;
	
	@FindBy(xpath = "//button[normalize-space()='×']")
	WebElement exitBtn;

	
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
//		this.driver=driver;
	}
	public void dashBoardPageTest() {
		System.out.println("----from dashboardPage----");
		tab_user.click();
		aboutBtn.click();
		exitBtn.click();
	}

}
