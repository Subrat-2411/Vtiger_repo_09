package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement headerText; 
	
	@FindBy(xpath="//a[contains(text(),'del')]")
	private WebElement deleteLink;
	
	@FindBy(xpath="(//img[contains(@alt,'Search')])[1]")
	private WebElement searchIcon;
	
	@FindBy(xpath="//img[contains(@title,'Create Contact')]")
	private WebElement createContactsIconLink;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnameTextField;
	
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement salutationTypeDropDownList;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnameTextField;
	
	@FindBy(xpath="(//img[contains(@src,'select')])[1]")
	private WebElement organizationnameSelectIcon;
	
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
	
	@FindBy(xpath="(//input[@title='Clear'])[1]")
	private WebElement clearIcon;
	
	@FindBy(xpath="(//input[contains(@value,'Save')])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath="(//input[contains(@value,'Cancel')])[1]")
	private WebElement cancelButton;
	
    public ContactsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateContactsIconLink() {
		return createContactsIconLink;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getSalutationTypeDropDownList() {
		return salutationTypeDropDownList;
	}

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getOrganizationnameSelectIcon() {
		return organizationnameSelectIcon;
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

	public WebElement getClearIcon() {
		return clearIcon;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getDeleteLink() {
		return deleteLink;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public WebElement getHeaderText() {
		return headerText;
	}
    
    
	
}
