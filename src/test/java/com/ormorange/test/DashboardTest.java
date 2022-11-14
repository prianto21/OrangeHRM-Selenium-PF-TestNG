package com.ormorange.test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.orm.pages.DashboardPage;

public class DashboardTest extends BaseTest {
	@Test
	public void cekDashboard() {
		System.out.println("dashboard");
		dashboardpage.dashBoardPageTest();
	}
	
}
