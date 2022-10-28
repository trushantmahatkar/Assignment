package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage 
{
	public WebDriver driver;
	
	public FirstPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//button[@id='ee-floating-control-button-form-3-applyNow']")
	WebElement applyNow;
	
	public void clickApplyNow()
	{
		applyNow.click();
	}	
}
