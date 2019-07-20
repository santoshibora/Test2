package orangeHRM.ProjectHRM;


import org.testng.annotations.Test;


public class AppTest extends GlobalBaseClass {

	Login objLogin;
	homePage objhomePage;
	//admin objadmin;


	@Test(priority=1)
	public void login()
	{
		objLogin=new Login();
		objhomePage=objLogin.login("admin", "admin123");
	}
	@Test(priority=2)
	public void verifyAdminFunctionality() {
		objhomePage.verifywelcomeText();
		objhomePage.navigationtoadmin();
	}

	@Test(priority=3)
	public void verifysearchbyusername()
	{
		//admin objadmin = new admin();
		System.out.println("started");
		//objadmin.enterusername("Admin");
		System.out.println("stoped");
		//objadmin.clickonsearchbutton();
		System.out.println("search");
		//objadmin.verifyusername("Admin");

	}



}
