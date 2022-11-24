package com.ormorange.test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.orm.pages.DashboardPage;
import com.orm.pages.LoginPage;

public class DashboardTest extends BaseTest {
	@Test
	public void cekDashboard() {
//		login
		loginpage.signIn("admin", "admin123");
		System.out.println("dashboard");
		dashboardpage.dashBoardPageTest();
	}
	@Test
	public void MenuAdminTest() {
		loginpage.signIn("admin", "admin123");
		dashboardpage.ClikMenuAdmin();
		assertTrue(dashboardpage.verifyMenuAdmin().contains("Admin"));
	}
	
	@Test 
	public void MenuPIMTest() {
		loginpage.signIn("admin", "admin123");
		dashboardpage.clickMenuPIM();
		assertTrue(dashboardpage.verifyMenuPIM().contains("PIM"));
	}
	
}
