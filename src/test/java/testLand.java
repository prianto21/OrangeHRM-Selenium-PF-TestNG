import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

public class testLand {
	WebDriver driver;
	String baseURL = "https://landx.id/";

	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/home/ancient/Downloads/chromedriver_linux64/chromedriver");
	}
	
//	akses web landx
	public void akses_web_landx() {
		this.driver=new ChromeDriver();
		driver.navigate().to(baseURL);
	}
	
//	klik menu proyek
	public void menu_proyek_click() {
		WebElement menu_proyek=driver.findElement(By.xpath("//p[normalize-space()='Proyek']"));
		menu_proyek.click();
	}
	
//	cek apakah sudah ada di section pendanaan sedang berlangsung
	public void cek_section() {
		WebElement teks=driver.findElement(By.xpath("//h2[normalize-space()='Pendanaan yang Sedang Berlangsung']"));
		teks.getText();
		String expect="Pendanaan yang Sedang Berlangsung";
		AssertJUnit.assertEquals(teks, expect);
	}
}
