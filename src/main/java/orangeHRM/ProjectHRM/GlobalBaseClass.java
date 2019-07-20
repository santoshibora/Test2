package orangeHRM.ProjectHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class GlobalBaseClass {
public static WebDriver driver;
	
	@BeforeSuite
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\AutomationTraining\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
}
