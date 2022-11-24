package com.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage {
	
	@FindBy(name = "username")
	private WebElement Fieldusername;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement resetPassword;
	
	@FindBy(xpath = "//h6[text()='Reset Password link sent successfully']")
	private WebElement resetPasswordSentSucces;	
	public ResetPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fillUsername(String username) {
		Fieldusername.sendKeys(username);
	}
	public void resetPassword() {
		resetPassword.click();
	}
	public String NotifResetPassSuccesful() {
		return resetPasswordSentSucces.getText();
	}

}
