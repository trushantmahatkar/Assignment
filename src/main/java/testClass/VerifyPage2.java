package testClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import pomClasses.BaseClass;
import pomClasses.SecondPage;
import pomClasses.ThirdPage;

public class VerifyPage2 extends BaseClass
{
	@Test
	public void verifySecondPage() throws IOException, InterruptedException
	{
		SecondPage sp =new SecondPage(driver);
		
		sp.sendFirstName();
		System.out.println("FirstName Entered");
		sp.sendEmailID();
		System.out.println("EmailID Entered");
		sp.sendMobileNo();
		System.out.println("Mobile No Entered");
		sp.dropdown();
		System.out.println("Entity Selected");
		sp.sendComment();
		System.out.println("Comment Passed");
		sp.clickCheckBox();
		System.out.println("CheckBox Selected");
		sp.clickSubmitButton();
		System.out.println("Clicked Submit Button");
		sp.clickToFillTheApplication();
		System.out.println("Clicked To Fill The Application Form");
		
		List<String> allPageAddress = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(allPageAddress.get(1));
		
		ThirdPage tp = new ThirdPage(driver);
		tp.clickToProceed();
		tp.stream();
		tp.course();
		tp.campusPreference();
		tp.preferrenceDate();
		tp.dateOfBirth();
		tp.bloodGroup();
		tp.gender();
		tp.category();
		tp.religion();
		tp.nationality();
		tp.alternateMobileNo();
		tp.alternateEmailAddress();
		tp.passportNumber();
		tp.passportDateofIssue();
		tp.passportExpiryDate();
		tp.domicile();
		tp.citizenship();
		tp.caste();
		
		
	}
	
}
