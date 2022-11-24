package com.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(id ="input-firstname")
	private WebElement Field_firstname;
	
	@FindBy(id="input-lastname")
	private WebElement Field_lastname;
	
	@FindBy(id="input-email")
	private WebElement Field_email;
	
	@FindBy(id="input-telephone")
	private WebElement Field_telp;
	
	@FindBy(id="input-password")
	private WebElement Field_password;
	
	@FindBy(id="input-confirm")
	private WebElement Field_pass_confirm;
	
	@FindBy(xpath="//input[@value='1' and @name='newsletter']")
	private WebElement subscribe;
//	input[@name='agree']
	@FindBy(name = "agree")
	private WebElement Privacy_Policy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement btn_continue;
	
//	page for confirmation register is succes
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement registerSucces;
	public boolean validasiRegisterSucces() {
		System.out.println(registerSucces.getText());
		return registerSucces.isDisplayed();
	}
	
	public RegisterPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void klik_continue() {
		btn_continue.click();
	}
	public void inputFirstName(String fn) {
		Field_firstname.sendKeys(fn);
	}
	public void inputLastName(String ln) {
		Field_lastname.sendKeys(ln);
	}
	public void inputEmail(String email) {
		Field_email.sendKeys(email);
	}
	public void inputTelp(String telp) {
		Field_telp.sendKeys(telp);
	}
	public void inputPassword(String password) {
		Field_password.sendKeys(password);
	}
	public void inputConfirmPass(String conPass) {
		Field_pass_confirm.sendKeys(conPass);
	}
	public void click_subcriber() {
		subscribe.click();
	}
	public void clickAgreePolicy() {
		Privacy_Policy.click();
	}
	public void clickContinue() {
		btn_continue.click();
	}
}
