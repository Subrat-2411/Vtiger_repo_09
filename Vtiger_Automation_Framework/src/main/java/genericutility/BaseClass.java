package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;

public class BaseClass {
	
	public static ExtentReports eReport;
	
	public static ExtentTest test;

	public static WebDriver driver;
	
	public WebDriverUtility wutil=new WebDriverUtility();
	
	public FileUtility futil=new FileUtility();
	
	public JavaUtility jutil =new JavaUtility();
	
	/**
	 * This Method is used to Configure report.
	 */
	@BeforeSuite(alwaysRun = true)
	public void reportConfiguration()
	{
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extent_report"+jutil.getSystemTime()+".html");
		
		eReport=new ExtentReports();
		
		eReport.attachReporter(spark);
		
	}
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(futil.getDatafromProperty("url"));
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.getUserNameTextField().sendKeys(futil.getDatafromProperty("username"));
		
		lp.getPasswordTextField().sendKeys(futil.getDatafromProperty("password"));
		
		lp.getLoginButton().click();

	}
	
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		HomePage hp=new HomePage(driver);
		
		wutil.mouseHover(driver, hp.getAdministratorIconLink());
		
		hp.getSignoutLink().click();
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@AfterSuite(alwaysRun = true)
	public void reportBackUp()
	{
		eReport.flush();
	}
}
