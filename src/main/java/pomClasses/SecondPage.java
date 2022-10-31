package pomClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


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
	@FindBy(xpath="//label[text()='Please fill out - First Name']")
	WebElement errorFirstName;
	
	public void sendFirstName() throws IOException
	{
		sendFirstName.clear();
	sendFirstName.sendKeys("Trushant");
	}
	
	@FindBy(xpath="//input[@id='ee-form-3-form-3-email']")
	WebElement sendEmailId;
	@FindBy(xpath="//label[text()='Please fill out - Email Address']")
	WebElement errorEmailId;
	
	public void sendEmailID() throws IOException
	{
		sendEmailId.clear();
		sendEmailId.sendKeys("mahatkartrushant@gmail.com");
	}	
	
	@FindBy(xpath="//input[@id='ee-form-3-form-3-mobile']")
	WebElement sendMobileNo;
	@FindBy(xpath="//label[text()='Please fill out - Mobile Number']")
	WebElement errorMobileNo;
	
	public void sendMobileNo() throws IOException
	{
		sendMobileNo.clear();
		sendMobileNo.sendKeys("9152632521");
	}
	
	@FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
	WebElement dropdown;
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement dropdownData;
	@FindBy(xpath="//label[text()='Please fill out - Entity2']")
	WebElement errorEntity2;
	
	public void dropdown()
	{
		dropdown.click();
		dropdownData.sendKeys("BE");
		dropdownData.sendKeys(Keys.ENTER);	
	}

	@FindBy(xpath="//textarea[@id='ee-form-3-form-3-comments']")
	WebElement sendComment;
	@FindBy(xpath="//label[text()='Please fill out - Your comment']")
	WebElement errorComment;
	
	public void sendComment() throws IOException
	{
		sendComment.clear();
		sendComment.sendKeys("NA");
	}

	@FindBy(xpath="//input[@id='ee-form-3-form-3-iAgree']")
	WebElement clickCheckBox;
	@FindBy(xpath="//label[text()='Please fill out - Agreement']")
	WebElement errorCheckBox;
	
	public void clickCheckBox() throws IOException
	{
		clickCheckBox.click();
	}
	
	@FindBy(xpath="	//button[@id='ee-form-3-form-3-submit']")
	WebElement clickSubmitButton;
	
	public void clickSubmitButton() throws IOException
	{
		clickSubmitButton.click();
//		String result = errorFirstName.getText();
//		if(result.equalsIgnoreCase("Please fill out - First Name"))
//		{
//			Assert.assertFalse(true,"Please fill out - First Name");
//		}
//		String result1 = errorEmailId.getText();
//		if(result1.equalsIgnoreCase("Please fill out - Email Address"))
//		{
//			Assert.assertFalse(true,"Please fill out - Email Address");
//		}
//		String result2 = errorMobileNo.getText();
//		if(result2.equalsIgnoreCase("Please fill out - Mobile Number"))
//		{
//			Assert.assertFalse(true,"Please fill out - Mobile Number");
//		}
//		String result3 = errorEntity2.getText();
//		if(result3.equalsIgnoreCase("Please fill out - Entity2"))
//		{
//			Assert.assertFalse(true,"Please fill out - Entity2");
//		}
//		String result4 = errorComment.getText();
//		if(result4.equalsIgnoreCase("Please fill out - Your comment"))
//		{
//			Assert.assertFalse(true,"Please fill out - Your comment");
//		}
//		String result5 = errorCheckBox.getText();
//		if(result5.equalsIgnoreCase("Please fill out - Agreement"))
//		{
//			Assert.assertFalse(true,"Please fill out - Agreement");
//		}
	}

	@FindBy(xpath="//button[@class='btn btn-feedback-control btn-feedback-custom']")
	WebElement clickToFillTheApplication;
	
	public void clickToFillTheApplication() throws IOException
	{
		clickToFillTheApplication.click();
	}
}
