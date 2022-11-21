package com.ormorange.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PimTest extends BaseTest{

	@Test
	public void SearchTest() {
		loginpage.signIn("admin", "admin123");
		dashboardpage.clickMenuPIM();
		pim.inputEmploName("melsi tri");
		pim.inputEmploId("0255");
		pim.Search();
		assertTrue(pim.verifyResultSearch());
	}
}
