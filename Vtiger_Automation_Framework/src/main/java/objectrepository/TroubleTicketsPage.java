package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTicketsPage {

	@FindBy(xpath="(//a[contains(text(),'Create')])[2]")
	private WebElement createTicketLink;
	
	@FindBy(xpath="//a[contains(text(),'Import ')]")
	private WebElement importTroubleTicketsLink;
	
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	private WebElement deleteButton;
	
	@FindBy(xpath="(//input[@value='Mass Edit'])[1]")
	private WebElement massEditButton;
	
	@FindBy(xpath="//textarea[@name='ticket_title']")
	private WebElement ticketTitleTextField;
	
	@FindBy(xpath="//select[@name='ticketstatus']")
	private WebElement ticketStatusDropDown;
	
//	@FindBy(xpath="")
//	private WebElement open
	
	public TroubleTicketsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateTicketLink() {
		return createTicketLink;
	}

	public WebElement getImportTroubleTicketsLink() {
		return importTroubleTicketsLink;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getMassEditButton() {
		return massEditButton;
	}

	public WebElement getTicketTitleTextField() {
		return ticketTitleTextField;
	}

	public WebElement getTicketStatusDropDown() {
		return ticketStatusDropDown;
	}
	
	
}
