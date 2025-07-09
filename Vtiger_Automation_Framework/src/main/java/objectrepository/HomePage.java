package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(xpath="//img[contains(@title,'Last')]")
	private WebElement lastViewedIconLink;
	
	@FindBy(xpath="(//input[contains(@value,'Search')])[2]")
	private WebElement searchTextField;
	
	@FindBy(xpath="(//a[text()='Calendar'])[1]")
	private WebElement calenderTabLink;
	
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	private WebElement leadsTabLink;

	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement organizationsTabLink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsTabLink;
	
	@FindBy(xpath="(//a[text()='Opportunities'])[1]")
	private WebElement OpportunitiesTabLink;
	
	@FindBy(xpath="(//a[text()='Products'])[1]")
	private WebElement productsTabLink;
	
	@FindBy(xpath="(//a[text()='Documents'])[1]")
	private WebElement documentsTabLink;
	
	@FindBy(xpath="(//a[text()='Email'])[1]")
	private WebElement EmailTabLink;
	
	@FindBy(xpath="(//a[text()='Trouble Tickets'])[1]")
	private WebElement troubleTicketsTabLink;
	
	@FindBy(xpath="(//a[text()='Dashboard'])[1]")
	private WebElement dashboardTabLink;
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement moreDropDownLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorIconLink;
	
	@FindBy(xpath="//a[contains(@id,'my_preferences')]")
	private WebElement myPreferencesLink;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/mainSettings.PNG']")
	private WebElement settingsIconLink;
	
	@FindBy(xpath="//img[contains(@src,'Add')]")
	private WebElement addIcon;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getCalenderTabLink() {
		return calenderTabLink;
	}

	public WebElement getLeadsTabLink() {
		return leadsTabLink;
	}

	public WebElement getOrganizationsTabLink() {
		return organizationsTabLink;
	}

	public WebElement getContactsTabLink() {
		return contactsTabLink;
	}

	public WebElement getOpportunitiesTabLink() {
		return OpportunitiesTabLink;
	}

	public WebElement getProductsTabLink() {
		return productsTabLink;
	}

	public WebElement getDocumentsTabLink() {
		return documentsTabLink;
	}

	public WebElement getEmailTabLink() {
		return EmailTabLink;
	}

	public WebElement getTroubleTicketsTabLink() {
		return troubleTicketsTabLink;
	}

	public WebElement getDashboardTabLink() {
		return dashboardTabLink;
	}

	public WebElement getMoreDropDownLink() {
		return moreDropDownLink;
	}

	public WebElement getAdministratorIconLink() {
		return administratorIconLink;
	}

	public WebElement getSignoutLink() {
		return signoutLink;
	}

	public WebElement getSettingsIconLink() {
		return settingsIconLink;
	}

	public WebElement getMyPreferencesLink() {
		return myPreferencesLink;
	}

	public WebElement getAddIcon() {
		return addIcon;
	}

	public WebElement getLastViewedIconLink() {
		return lastViewedIconLink;
	}
	
}
