package organizations;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_VT_001_Test extends BaseClass {

	@Test
	public void clickOnOrganizations()
	{
		HomePage hp=new HomePage(driver);
		
		hp.getOrganizationsTabLink().click();
		
		Assert.assertTrue(driver.getTitle().contains("Organizations"), "Organizations Page is not Displayed.");
		test.log(Status.PASS, "Organizations Page is Displayed.");
		
		 
	}
}
