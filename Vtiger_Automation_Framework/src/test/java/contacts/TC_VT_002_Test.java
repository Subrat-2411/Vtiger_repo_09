package contacts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.ContactsPage;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_VT_002_Test extends BaseClass {

	@Test(groups = "smoke")
	public void createContact()
	{
		
		HomePage hp=new HomePage(driver);
		
		hp.getContactsTabLink().click();
		
		ContactsPage cp=new ContactsPage(driver);
		
		cp.getCreateContactsIconLink().click();
		
		cp.getLastnameTextField().sendKeys("Shapom");
		
		cp.getSaveButton().click();
		
		Assert.assertTrue(cp.getHeaderText().getText().contains("Shapom"), "Contact is not Created.");
		
		test.log(Status.PASS,"Contact has been created Successfully." );
	}
	
}
