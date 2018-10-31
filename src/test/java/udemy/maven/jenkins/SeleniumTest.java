package udemy.maven.jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class SeleniumTest {

	WebDriver driver = null;

	@Test
	public void chromeTest() throws InterruptedException {
		// using WebDriverManager dependency we can work on third party browser.
		// There is no need to provide system.set.property on browser drivers
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("The chrome driver is initiated using WebDriver Manager");
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.withMessage("vivek");
        driver.close();
	}

	@Test
	public void firefoxTest() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("The firefox driver is initiated using WebDriver Manager");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.close();
		
	}
	
	protected abstract void testOverride();

}
