package af;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class As {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			FirefoxOptions Prof = new FirefoxOptions();
			Prof.addPreference("browser.download.dir", "D:\\Roambi folder");
			Prof.addPreference("browser.download.folderList", 2);
			Prof.addPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");	
			//--------------------------------------------------------------------
			System.setProperty("webdriver.gecko.driver", "D:\\hari\\Selenium webdriver\\gecodriver 19.1\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver(Prof);
			//----------------------------------------------------------------------
			driver.manage().window().maximize();
			driver.get("http://docs.seleniumhq.org/download/");
			//driver.get("http://selenium-release.storage.googleapis.com/index.html?path=3.11/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='mainContent']/p[7]/a[1]")).click();
			//driver.findElement(By.linkText("selenium-server-standalone-3.11.0.jar")).click();
		}

}
