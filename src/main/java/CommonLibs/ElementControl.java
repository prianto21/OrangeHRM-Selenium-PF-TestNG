package CommonLibs;

import org.openqa.selenium.WebElement;

public class ElementControl {

	public void clickElement(WebElement element) {
//		scrool operation
		element.click();
	}
	
	public void typeText(WebElement element,String textToType) {
		element.sendKeys(textToType);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
}
