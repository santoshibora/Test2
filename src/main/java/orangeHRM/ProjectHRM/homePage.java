package orangeHRM.ProjectHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homePage extends GlobalBaseClass {
	
	public homePage()
	{
		PageFactory.initElements(driver, this);
		}

	@FindBy(id="welcome")
	WebElement welcomefield;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	
	public void verifywelcomeText()
	{
		String welcometext = welcomefield.getText();
		Assert.assertEquals(welcometext, "Welcome Admin");
	}
	
	public void navigationtoadmin() 
	{
		admin.click();
	}

}
