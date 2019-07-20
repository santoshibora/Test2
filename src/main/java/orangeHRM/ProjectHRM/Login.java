package orangeHRM.ProjectHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends GlobalBaseClass {

	@FindBy(id="txtUsername")
	WebElement userNameField;

	@FindBy(id="txtPassword")
	WebElement passwordField;

	@FindBy(id="btnLogin")
	WebElement loginBtn;

	public homePage login(String sUserName, String sPassword)
	{
		userNameField.sendKeys(sUserName);
		passwordField.sendKeys(sPassword);
		loginBtn.click();
		return new homePage();
	}


	public Login()
	{
		PageFactory.initElements(driver,this );

	}
}


