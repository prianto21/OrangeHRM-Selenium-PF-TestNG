package com.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//	//input[@placeholder='Type for hints...' and @xpath='1']

	@FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
	private WebElement FieldEmploName;
	
	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement FieldEmploId;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SearchBtn;
	
	@FindBy(xpath = "//div[text()='melsi tri']")
	private WebElement hasilSearch;
	public void inputEmploName(String name) {
		FieldEmploName.sendKeys(name);
	}
	public void inputEmploId(String id) {
		FieldEmploId.sendKeys(id);
	}
	public void Search() {
		SearchBtn.click();
	}
	public boolean verifyResultSearch() {
		return hasilSearch.isDisplayed();
	}
	
}
