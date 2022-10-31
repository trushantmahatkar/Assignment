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
		System.out.println("Clicked on Proceed");
		tp.stream();
		System.out.println("Selected Stream");
		tp.course();
		System.out.println("Selected Course");
		tp.campusPreference();
		System.out.println("Selected Campus Preference");
		tp.preferrenceDate();
		System.out.println("Selected Preference Date");
		tp.dateOfBirth();
		System.out.println("Selected Date of Birth");
		tp.bloodGroup();
		System.out.println("Selected BloodGroup");
		tp.gender();
		System.out.println("Selected Gender");
		tp.category();
		System.out.println("Selected Category");
		tp.religion();
		System.out.println("Selected Religion");
		tp.nationality();
		System.out.println("Selected Nationality");
		tp.alternateMobileNo();
		System.out.println("Entered Alternate Mobile No.");
		tp.alternateEmailAddress();
		System.out.println("Entered Alternate Email Address");
		tp.passportNumber();
		System.out.println("Entered Passport No.");
		tp.passportDateofIssue();
		System.out.println("Selected Passport Date of Issue");
		tp.passportExpiryDate();
		System.out.println("Selected Passport Expiry Date ");
		tp.domicile();
		System.out.println("Selected Domicile");
		tp.citizenship();
		System.out.println("Selected Citizenship");
		tp.caste();
		System.out.println("Selected Caste");	
	}
	
}
