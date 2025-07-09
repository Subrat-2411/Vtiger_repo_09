package genericutility;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
/**
 * @author Subrat
 */
public class WebDriverUtility {
	/**
	 * This method is used to maximise the window.
	 * @param driver
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void mouseHover(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		
		act.moveToElement(element).perform();
		
	}
	/**
	 * This is used to drag and drop the element.
	 * @param driver
	 * @param element
	 * @param target
	 */
	public void dragAndDropDriver(WebDriver driver,WebElement element,WebElement target)
	{
		Actions act=new Actions(driver);
		
		act.dragAndDrop(element,target).perform();
		
	}
	
	/**
	 * This method is used to perform right click operation on the element.
	 * @param driver
	 * @param element
	 */
	public void rightClickDriver(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		
		act.contextClick(element).perform();
		
	}
	
	/**
	 * This method is used to perform click and hold operation on the element.
	 * @param driver
	 * @param element
	 */
	public void clickAndHoldDriver(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		
		act.clickAndHold(element).perform();
		
	}
	/**
	 * This method is used to select the options present in the dropdown based on the index.
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element,int index)
	{
		Select ref=new Select(element);
		
		ref.selectByIndex(index);
	}
	
	/**
	 * This method is used to select the options present in the dropdown based on the value.
	 * @param element
	 * @param value
	 */
	public void selectByValue(WebElement element,String value)
	{
		Select ref=new Select(element);
		
		ref.selectByValue(value);
	}
	
	/**
	 * This method is used to select the options present in the dropdown based on the visible text.
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element,String text)
	{
		Select ref=new Select(element);
		
		ref.selectByVisibleText(text);
	}
	/**
	 * This method is used to get all the options present in the dropdown or listbox.
	 * @param element
	 * @return String[]
	 */
	public String[] getOptions(WebElement element)
	{
		Select ref=new Select(element);
		
		List<WebElement> allOptions = ref.getOptions();
		
		String[] options=new String[allOptions.size()];
		
		
		for (int i=0;i<=allOptions.size()-1;i++) {
			
			options[i]=allOptions.get(i).getText();
		}
		
		return options;
		
	}
	/**
	 * This method is used to switch from window to frame based on the index.
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch from window to frame based on the name or id.
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrame(WebDriver driver,String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	/**
	 * This method is used to switch from window to frame based on the element.
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to switch from child frame to parent frame.
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	/**
	 * This method is used to switch from child frame to Main page.
	 * @param driver
	 */
	public void switchToMainPage(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is used to switch from window to alert.
	 * @param driver
	 * @return
	 */
	public Alert switchToAlert(WebDriver driver)
	{
		return driver.switchTo().alert();
	}
	/**
	 * This method is used to switch from window to window.
	 * @param driver
	 * @param expURL
	 */
	public void switchToWindow(WebDriver driver,String expURL)
	{
		Set<String> allIds = driver.getWindowHandles();
		
		for (String id: allIds) {
			
			driver.switchTo().window(id);
			
			if(driver.getCurrentUrl().contains(expURL)) {
				break;
			}
		}
	}
	/**
	 * This method is used to take screenshot of the webpage.
	 * @param driver
	 * @param path
	 * @throws IOException
	 */
	public void getPhoto(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		JavaUtility jutil=new JavaUtility();
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/"+jutil.getSystemTime()+".png");
		
		FileHandler.copy(temp, dest);
	}
	/**
	 * This method is used to scroll the webpage using javascript.
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void jsScrolling(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		js.executeScript("window.scrollTo("+x+","+y+")");

	}
}
