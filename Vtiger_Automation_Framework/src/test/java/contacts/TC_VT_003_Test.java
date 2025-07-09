package contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
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
public class TC_VT_003_Test extends BaseClass{

	@Test
	public void createContact() throws EncryptedDocumentException, IOException
	{
		ExcelUtility eutil=new ExcelUtility();
		
		HomePage hp=new HomePage(driver);
		
		hp.getContactsTabLink().click();
		
		ContactsPage cp=new ContactsPage(driver);
		
		cp.getCreateContactsIconLink().click();
		
		cp.getLastnameTextField().sendKeys(eutil.getStringDatafromExcel("Contacts", 1, 0));
		
		cp.getOrganizationnameSelectIcon().click();
		
		wutil.switchToWindow(driver, "Accounts");
		
		driver.findElement(By.xpath("//a[@id='3']")).click();
		
		wutil.switchToWindow(driver, "Contacts");
		
		cp.getSaveButton().click();
		
		Assert.assertTrue(cp.getHeaderText().getText().contains(eutil.getStringDatafromExcel("Contacts", 1, 0)),"Contact is not created.");
		
		test.log(Status.PASS,"Contacts Page is Displayed.");
		
		
	}
}
