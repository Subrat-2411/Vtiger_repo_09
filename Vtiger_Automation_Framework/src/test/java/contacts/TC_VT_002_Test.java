package contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import genericutility.ListenerUtility;
import objectrepository.ContactsPage;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_VT_002_Test extends BaseClass {

	@Test(groups = "smoke")
	public void createContact() throws EncryptedDocumentException, IOException
	{
		ExcelUtility eutil=new ExcelUtility();
		
		HomePage hp=new HomePage(driver);
		
		hp.getContactsTabLink().click();
		
		ContactsPage cp=new ContactsPage(driver);
		
		cp.getCreateContactsIconLink().click();
		
		cp.getLastnameTextField().sendKeys(eutil.getStringDatafromExcel("Contacts", 1, 0));
		
		cp.getSaveButton().click();
		
		Assert.assertTrue(cp.getHeaderText().getText().contains(eutil.getStringDatafromExcel("Contacts", 1, 0)), "Contact is not Created.");
		
		test.log(Status.PASS,"Contact has been created Successfully." );
	}
	
}
