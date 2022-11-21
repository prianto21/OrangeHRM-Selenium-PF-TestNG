package com.ormorange.test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {
	
	
	@Test
	public void TestLogin() {
//		test apakah user login sebagai admin
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String Expect = "OrangeHRM";
		String ActualTitle = driver.getTitle();
		assertEquals(ActualTitle, Expect);

	}
	
	
}
