package pomClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SecondPage 
{
public WebDriver driver;

	
	public SecondPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//input[@id='ee-form-3-form-3-firstName']")
	WebElement sendFirstName;
	
	public void sendFirstName() throws IOException
	{
		sendFirstName.clear();
	sendFirstName.sendKeys("Trushant");
	}
	
	@FindBy(xpath="//input[@id='ee-form-3-form-3-email']")
	WebElement sendEmailId;
	
	public void sendEmailID() throws IOException
	{
		sendEmailId.clear();
		sendEmailId.sendKeys("mahatkartrushant@gmail.com");
	}	
	
	@FindBy(xpath="//input[@id='ee-form-3-form-3-mobile']")
	WebElement sendMobileNo;
	
	public void sendMobileNo() throws IOException
	{
		sendMobileNo.clear();
		sendMobileNo.sendKeys("9172125373");
	}
	
	@FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
	WebElement dropdown;
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement dropdownData;
	
	public void dropdown()
	{
		dropdown.click();
		dropdownData.sendKeys("BE");
		dropdownData.sendKeys(Keys.ENTER);	
	}

	@FindBy(xpath="//textarea[@id='ee-form-3-form-3-comments']")
	WebElement sendComment;
	
	public void sendComment() throws IOException
	{
		sendComment.clear();
		sendComment.sendKeys("NA");
	}

	@FindBy(xpath="//input[@id='ee-form-3-form-3-iAgree']")
	WebElement clickCheckBox;
	
	public void clickCheckBox() throws IOException
	{
		clickCheckBox.click();
	}
	
	@FindBy(xpath="	//button[@id='ee-form-3-form-3-submit']")
	WebElement clickSubmitButton;
	
	public void clickSubmitButton() throws IOException
	{
		clickSubmitButton.click();
	}

	@FindBy(xpath="//button[@class='btn btn-feedback-control btn-feedback-custom']")
	WebElement clickToFillTheApplication;
	
	public void clickToFillTheApplication() throws IOException
	{
		clickToFillTheApplication.click();
	}
}
