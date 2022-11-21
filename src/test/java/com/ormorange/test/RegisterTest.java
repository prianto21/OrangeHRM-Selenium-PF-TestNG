package com.ormorange.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orm.pages.DashboardPage;

public class RegisterTest extends BaseTest {
@Test
	public void regisTest() {
//	link web demo http://tutorialsninja.com/demo/index.php?route=account/register
		System.out.println("register");
		
		dashboardpage.klikMyAccount();
		dashboardpage.register();
		register.inputFirstName("yakutl");
		register.inputLastName("enak");
		register.inputEmail("yakutl222@gmail.com");
		register.inputTelp("08821886082");
		register.inputPassword("123456");
		register.inputConfirmPass("123456");
		register.click_subcriber();
		register.clickAgreePolicy();
		register.klik_continue();
//		assertEquals("register.validasiRegisterSucces()","Your Account Has Been Created!");
		assertTrue(register.validasiRegisterSucces());
		
		
	}
}
