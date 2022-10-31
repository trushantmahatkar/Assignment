package pomClasses;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	@BeforeMethod
	public void method1()
	{
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
	
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		System.out.println("Browser is Opened");
		
		driver.get("https://eequeuestorage.blob.core.windows.net/staticfiles/appform-demo/ee-form-widget/form-3/index.html?university=18");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		String expectedURL= "https://eequeuestorage.blob.core.windows.net/staticfiles/appform-demo/ee-form-widget/form-3/index.html?university=18";
		
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL,expectedURL);
		
		if(actualURL.equalsIgnoreCase(expectedURL))
		{
			System.out.println("Correct URL is Opened");
		}
		else
		{
			System.out.println("URL is Wrong");
		}
		
		FirstPage fp = new FirstPage(driver);
		
		fp.clickApplyNow();
		
	}
}
