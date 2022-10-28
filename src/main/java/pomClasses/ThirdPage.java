package pomClasses;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage 
{
	
public WebDriver driver;

	public ThirdPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="//button[@id='btncontinue']")
	WebElement clickToProceed;
	
	public void clickToProceed() throws IOException
	{
		clickToProceed.click();
	}
	
	@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[4]")
	WebElement stream;
	public void stream() throws InterruptedException
	{
		Thread.sleep(2000);
		stream.click();
		Thread.sleep(2000);
		stream.sendKeys("Btech");
		Thread.sleep(2000);
		stream.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
	}
	
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[6]")
			WebElement course;
	
			public void course()
			{
				course.click();
				course.sendKeys("2010");
				course.sendKeys(Keys.ENTER);	
			}
	
			@FindBy(xpath="//input[@id='preferredDate']")
			WebElement preferrenceDate;
			
			public void preferrenceDate()
			{
				preferrenceDate.sendKeys("10/09/2022");	
			}
			
			@FindBy(xpath="//input[@id='dateOfBirth']")
			WebElement dateOfBirth;
			
			public void dateOfBirth()
			{
				dateOfBirth.sendKeys("10/07/1992");	
			}
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[7]")
			WebElement campusPreference;
			
			public void campusPreference()
			{
				campusPreference.click();
				campusPreference.sendKeys("Field1F");
				campusPreference.sendKeys(Keys.ENTER);	
			}
			
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[8]")
			WebElement bloodGroup;
			
			public void bloodGroup()
			{
				bloodGroup.click();
				bloodGroup.sendKeys("O+");
				bloodGroup.sendKeys(Keys.ENTER);	
			}
			
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[9]")
			WebElement gender;
			
			public void gender()
			{
				gender.click();
				gender.sendKeys("Male");
				gender.sendKeys(Keys.ENTER);	
			}
			
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[10]")
			WebElement category;
			
			public void category()
			{
				category.click();
				category.sendKeys("OBC");
				category.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[11]")
			WebElement religion;
			
			public void religion()
			{
				religion.click();
				religion.sendKeys("Hindu");
				religion.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[12]")
			WebElement nationality;
			
			public void nationality()
			{
				nationality.click();
				nationality.sendKeys("Indian");
				nationality.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="//input[@id='alternateMobileNumber']")
			WebElement alternateMobileNo;
			
			public void alternateMobileNo()
			{
				alternateMobileNo.sendKeys("9172265373");	
			}
			
			@FindBy(xpath="//input[@id='alternateEmailAddress']")
			WebElement alternateEmailAddress;
			
			public void alternateEmailAddress()
			{
				alternateEmailAddress.sendKeys("mahatkartrushant@gmail.com");	
			}
			
			@FindBy(xpath="//input[@id='passportNumber']")
			WebElement passportNumber;
			
			public void passportNumber()
			{
				passportNumber.sendKeys("125555151515");	
			}
			
			@FindBy(xpath="//input[@id='passportDateofIssue']")
			WebElement passportDateofIssue;
			
			public void passportDateofIssue()
			{
				passportDateofIssue.sendKeys("28/10/2022");	
			}
			
			@FindBy(xpath="//input[@id='passportExpiryDate']")
			WebElement passportExpiryDate;
			
			public void passportExpiryDate()
			{
				passportExpiryDate.sendKeys("28/10/2025");	
			}
			
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[13]")
			WebElement domicile;
			
			public void domicile()
			{
				domicile.click();
				domicile.sendKeys("Indian");
				domicile.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[14]")
			WebElement citizenship;
			
			public void citizenship()
			{
				citizenship.click();
				citizenship.sendKeys("Maharashtrian");
				citizenship.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[15]")
			WebElement caste;
			
			public void caste()
			{
				caste.click();
				caste.sendKeys("Hindu");
				caste.sendKeys(Keys.ENTER);	
			}
}
