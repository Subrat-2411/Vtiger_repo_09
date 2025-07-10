package organizations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.UnhandledAlertException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
import objectrepository.OrganizationsPage;

@Listeners(ListenerUtility.class)
public class TC_VT_002_Test extends BaseClass{
	
	@Test(groups = "smoke")
	public void createOrganization() throws EncryptedDocumentException, IOException
	{
		ExcelUtility eutil=new ExcelUtility();
		
		HomePage hp=new HomePage(driver);
		
		hp.getOrganizationsTabLink().click();
		
		OrganizationsPage op=new OrganizationsPage(driver);
		
		op.getCreateIconLink().click();
		
		try {
			op.getOrganizationNameTextField().sendKeys(eutil.getStringDatafromExcel("Organization", 4, 0));
		} catch (EncryptedDocumentException e) {
			
			System.out.println("Already exists");
		} catch (IOException e) {
			System.out.println("Duplication Happened. Please Change Data.");
		}
		catch(UnhandledAlertException e) {
			System.out.println("change the data. it is duplicated.");
		}
		
		op.getSaveButton().click();
		
        Assert.assertTrue(op.getHeaderText().getText().contains(eutil.getStringDatafromExcel("Organization", 4, 0)),"Organization is not created.");
		
		test.log(Status.PASS,"Organization Page is Displayed.");
	}

}
