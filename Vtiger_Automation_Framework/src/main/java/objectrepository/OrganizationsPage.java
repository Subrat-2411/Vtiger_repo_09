package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement headerText; 
	
	@FindBy(xpath="//img[contains(@title,'Create')]")
	private WebElement createIconLink;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organizationNameTextField;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement websiteTextField;
	
	@FindBy(xpath="(//input[@name='assigntype'])[1]")
	private WebElement userRadioButton;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement groupRadioButton;
	
	@FindBy(xpath="//select[@name='assigned_user_id']")
	private WebElement administratorDropDownLink;
	
	@FindBy(xpath="//b[contains(text(),'Copy Shipping')]")
	private WebElement copyShippingAddressRadioButton;
	
	@FindBy(xpath="//b[contains(text(),'Copy Billing')]")
	private WebElement copyBillingAddress;
	
	@FindBy(xpath="(//input[contains(@value,'Save')])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath="(//input[contains(@value,'Cancel')])[1]")
	private WebElement cancelButton;
	
	public OrganizationsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateIconLink() {
		return createIconLink;
	}

	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}

	public WebElement getWebsiteTextField() {
		return websiteTextField;
	}

	public WebElement getUserRadioButton() {
		return userRadioButton;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}

	public WebElement getAdministratorDropDownLink() {
		return administratorDropDownLink;
	}

	public WebElement getCopyShippingAddressRadioButton() {
		return copyShippingAddressRadioButton;
	}

	public WebElement getCopyBillingAddress() {
		return copyBillingAddress;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getHeaderText() {
		return headerText;
	}
	
	
}
