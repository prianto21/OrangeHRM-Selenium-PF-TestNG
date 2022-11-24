package com.ormorange.test;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class PimTest extends BaseTest{

	@Test
	public void SearchTest() throws IOException {
		loginpage.signIn("admin", "admin123");
		dashboardpage.clickMenuPIM();
		pim.inputEmploName("melsi tri");
		pim.inputEmploId("0255");
		pim.Search();
		// screenshot test
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".//screenshoots//search.png");
		FileUtils.copyFile(src,trg);
		assertTrue(pim.verifyResultSearch());
	}
	
	@Test
	public void AddEmployeTest() {
		loginpage.signIn("admin", "admin123");
		dashboardpage.clickMenuPIM();
		pim.clickAddEmploye();
		pim.inputFirstName("pandji");
		pim.inputMiddleName("satria");
		pim.inputLastName("ancient");
		pim.clickSave();
	}
	
	@Test
	public void UpdateEmployeDetailTest() {
		loginpage.signIn("admin", "admin123");
		dashboardpage.clickMenuPIM();
		pim.inputEmploName("pandji");
		pim.Search();
		pim.EditDataBtn();
		assertTrue(pim.verifyDataEdit().contains("pandji ancient"));
	}
}
