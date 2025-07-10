package organizations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import genericutility.JavaUtility;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
import objectrepository.OrganizationsPage;

@Listeners(ListenerUtility.class)
public class TC_VT_002_Test extends BaseClass{
	
	@Test(groups = "smoke")
	public void createOrganization() throws EncryptedDocumentException, IOException
	{
		
		JavaUtility jutil=new JavaUtility();
		
		ExcelUtility eutil=new ExcelUtility();
		
		HomePage hp=new HomePage(driver);
		
		hp.getOrganizationsTabLink().click();
		
		OrganizationsPage op=new OrganizationsPage(driver);
		
		op.getCreateIconLink().click();
		
		op.getOrganizationNameTextField().sendKeys(eutil.getStringDatafromExcel("Organization", 4, 0));
		
		Alert popup = wutil.switchToAlert(driver);
		
		popup.accept();
		
		op.getOrganizationNameTextField().sendKeys(eutil.getStringDatafromExcel("Organization", 4, 0)+jutil.getRandomNumber());
		
		op.getSaveButton().click();
		
        Assert.assertTrue(op.getHeaderText().getText().contains(eutil.getStringDatafromExcel("Organization", 4, 0)),"Organization is not created.");
		
		test.log(Status.PASS,"Organization Page is Displayed.");
	}

}
