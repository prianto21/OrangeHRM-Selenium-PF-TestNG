package CommonLibs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonDriver {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public CommonDriver(String browserType) throws Exception {
		browserType = browserType.trim();
		if (browserType.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver",
//					"/home/ancient/Downloads/chromedriver_linux64(1)/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserType.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "/home/ancient/Downloads/geckodriver-v0.31.0-linux64/geckodriver");
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Invalid browserType" + browserType);
		}
	}

	public void navigateToUrl(String url) throws Exception {
		url = url.trim();
		if (url.startsWith("http://") || url.startsWith("https://")) {

			driver.get(url);
		} else {
			throw new Exception();
		}
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		if (driver != null) {

			driver.quit();
		}
	}
}
