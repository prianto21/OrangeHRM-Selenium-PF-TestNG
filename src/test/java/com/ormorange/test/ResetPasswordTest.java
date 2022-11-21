package com.ormorange.test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class ResetPasswordTest extends BaseTest{
	
	@Test
	public void ResetPassTest() {
		loginpage.clickForgotPassword();
		resetpass.fillUsername("melsi");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		resetpass.resetPassword();
		assertTrue(resetpass.NotifResetPassSuccesful().contains("Reset Password link sent successfully"));
	}

}
