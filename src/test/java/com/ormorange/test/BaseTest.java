package com.ormorange.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orm.pages.DashboardPage;
import com.orm.pages.LoginPage;

import CommonLibs.CommonDriver;

public class BaseTest {
//	WebDriver driver;
	CommonDriver cmnDriver;

	WebDriver driver;

//	declare all pages
	LoginPage loginpage;
	DashboardPage dashboardpage;
	@Parameters("browserType")
	@BeforeClass
	public void preSetup(String browserType) throws Exception {
//		browser open and acces url
//		openBrowser("firefox");
//		openBrowser("chrome");
		openBrowser(browserType);
		navigateToUrl("https://opensource-demo.orangehrmlive.com");
		driver = cmnDriver.getDriver();
//		call page
		pageInitialization();
//		maximaze window and wait element
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@BeforeMethod
	public void setUp() {

		System.out.println("before method");
//		login
		loginpage.signIn("admin", "admin123");

	}

	@AfterMethod
	public void cleanUp() {
		System.out.println("after method");
	}

	@AfterClass
	public void postCleanUp() {
		cmnDriver.closeBrowser();
	}
	
	private void openBrowser(String browserType) throws Exception{
		// TODO Auto-generated method stub
		cmnDriver = new CommonDriver(browserType);
	}
	
	private void navigateToUrl(String url) throws Exception {
//		navigate url
		cmnDriver.navigateToUrl(url);		
	}
	
	private void pageInitialization() {
		loginpage = new LoginPage(driver);
		dashboardpage = new DashboardPage(driver);
		
	}
}
