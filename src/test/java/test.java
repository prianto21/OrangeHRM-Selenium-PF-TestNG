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
//@Test
public class test {
	public static void main(String[] args) {
		System.out.println("test");
		WebDriver driver;
		String baseURL = "https://landx.id/";

		System.setProperty("webdriver.chrome.driver", "/home/ancient/Downloads/chromedriver_linux64(1)/chromedriver");

		ChromeOptions options=new ChromeOptions();
		HashMap<String, Object> prefs=new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		
		options.setExperimentalOption("prefs", prefs);
//		akses web landx

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		klik menu proyek
		WebElement menu_proyek = driver.findElement(By.xpath("//p[normalize-space()='Proyek']"));
		menu_proyek.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		cek apakah sudah ada di section pendanaan sedang berlangsung

		WebElement teks = driver.findElement(By.xpath("//h2[normalize-space()='Pendanaan yang Sedang Berlangsung']"));
		teks.getText();
		System.out.println(teks.getText());
		String expect = "Pendanaan yang Sedang Berlangsung";
//		Assert.assertEquals(teks, expect);
		
		WebElement pilih_menu=driver.findElement(By.xpath("//h2[normalize-space()='Ayam Tempong Bu Sri - PT. Ibu Sri Sejahtera Utama']"));
		pilih_menu.click();
		String expect_menu="Ayam Tempong Bu Sri - PT. Ibu Sri Sejahtera Utama";
		System.out.println(pilih_menu.getText());
//		Assert.assertEquals(pilih_menu.getText(), expect_menu);
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebElement download=driver.findElement(By.xpath("//button[normalize-space()='SHOW PROSPEKTUS']"));
		download.click();
		String Expect_download="SHOW PROSPEKTUS";
		System.out.println(download.getText());
		
	}
}
