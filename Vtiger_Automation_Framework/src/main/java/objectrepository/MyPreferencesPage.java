package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPreferencesPage {

	@FindBy(xpath="//input[contains(@title,'Edit')]")
	private WebElement editButtonLink;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement changePasswordButton;
	
	@FindBy(xpath="//input[contains(@onclick,'showAudit')]")
	private WebElement viewAuditTrailButton;
	
	public MyPreferencesPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getEditButtonLink() {
		return editButtonLink;
	}

	public WebElement getChangePasswordButton() {
		return changePasswordButton;
	}

	public WebElement getViewAuditTrailButton() {
		return viewAuditTrailButton;
	}
	
	
}
