package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userNameTextField;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="(//input[@value='Login'])[2]")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
}
