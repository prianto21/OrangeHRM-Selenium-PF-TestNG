import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
@Test
public class Project1 {
	public static void main(String[] args) {
		
		System.out.println("test");
		WebDriver driver;
		String baseURL = "https://opensource-demo.orangehrmlive.com";

		System.setProperty("webdriver.chrome.driver", "/home/ancient/Downloads/chromedriver_linux64(1)/chromedriver");

		ChromeOptions options=new ChromeOptions();
//		HashMap<String, Object> prefs=new HashMap<>();
//		prefs.put("plugins.always_open_pdf_externally", true);
		
//		options.setExperimentalOption("prefs", prefs);
//		akses web orangehrm

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		login
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement btn_login=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btn_login.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.close();
		
		

//		
		
	}
}
