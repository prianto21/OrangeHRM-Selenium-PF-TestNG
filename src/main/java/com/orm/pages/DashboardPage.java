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
	
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement menuAdminBtn;
	
	@FindBy(xpath = "//h6[text()='Admin']")
	private WebElement breadcrumbAdmin;

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement menuPimbtn;
	
	@FindBy(xpath = "//h6[text()='PIM']")
	private WebElement breadcrumbPim;
	
	
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
	
//	main page 
	//span[normalize-space()='My Account']
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement MyAcount;
	public void klikMyAccount() {
		MyAcount.click();
	}
	
	@FindBy(xpath=("//a[normalize-space()='Register']"))
	WebElement register_link;
	public void register() {
		register_link.click();
	}
	
	public void ClikMenuAdmin() {
		menuAdminBtn.click();
	}
	
	public String verifyMenuAdmin() {
		System.out.println(breadcrumbAdmin.getText());
		return breadcrumbAdmin.getText();
	}
	
	public void clickMenuPIM() {
		menuPimbtn.click();
	}
	
	public String verifyMenuPIM() {
		System.out.println(" ini text dari  " + breadcrumbPim.getText());
		return breadcrumbPim.getText();
	}

}
