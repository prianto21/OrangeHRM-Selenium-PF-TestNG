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
import com.orm.pages.PimPage;
import com.orm.pages.RegisterPage;
import com.orm.pages.ResetPasswordPage;

import CommonLibs.CommonDriver;

public class BaseTest {
//	WebDriver driver;
	CommonDriver cmnDriver;

	WebDriver driver;

//	declare all pages
	LoginPage loginpage;
	DashboardPage dashboardpage;
	RegisterPage register;
	ResetPasswordPage resetpass;
	PimPage pim;
	@Parameters("browserType")
	@BeforeClass
	public void preSetup() throws Exception {
//		browser open and acces url
//		openBrowser("firefox");
		openBrowser("chrome");
//		openBrowser(browserType);
//		navigateToUrl("http://tutorialsninja.com/demo/");
		navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver = cmnDriver.getDriver();
//		call page
		pageInitialization();
//		maximaze window and wait element
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	@BeforeMethod
	public void setUp() {

		System.out.println("before method");

	}

	@AfterMethod
	public void cleanUp() {
		System.out.println("after method");
	}

	@AfterClass
	public void postCleanUp() {
//		cmnDriver.closeBrowser();
		
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
		register=new RegisterPage(driver);
		resetpass=new ResetPasswordPage(driver);
		pim=new PimPage(driver);
	}
}
