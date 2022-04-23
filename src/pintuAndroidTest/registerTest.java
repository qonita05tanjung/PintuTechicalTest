package pintuAndroidTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class registerTest {

	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeout().implicitlyWait(10, TimeUnit.SECONDS);
	
	boolean result = true;
	String name = "userTest";
	String email = "userTest@mail.com";
	String pass = "userTest";
	String confirmPass = "userTest2";
	
	@Test
	public void login(String name, String email, String pass, String confirmPass)
	{
		
	// click 'create one' link
	driver.findElementByXPath("//android.widget.TextView[@text='No account yet? Create one']").click();
	
	// input data
	driver.findElementById("com.loginmodule.learning:id/textInputEditTextName").sendKeys(name);
	driver.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").sendKeys(email);
	driver.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").sendKeys(pass);
	driver.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword").sendKeys(confirmPass);
	
	// click register
	driver.findElementById("com.loginmodule.learning:id/appCompatButtonRegister").click();
	
	// verify response
	warningFullName = driver.findElementByXPath("//android.widget.TextView[@text='Enter Full Name']").isDisplayed();
	warningEmail = driver.findElementByXPath("//android.widget.TextView[@text='Enter Valid Email']").isDisplayed();
	warningPassword = driver.findElementByXPath("//android.widget.TextView[@text='Enter Password']").isDisplayed();
	warningConfirmPassword = driver.findElementByXPath("//android.widget.TextView[@text='Password Does Not Matches']").isDisplayed();
	
	if warningFullName == true{
		driver.findElementByXPath("//android.widget.TextView[@text='Enter Full Name']").getText();
		result = false;
	}
	else if warningEmail == true{
		driver.findElementByXPath("//android.widget.TextView[@text='Enter Valid Email']").getText();
		result = false;
	}
	
	else if warningPassword == true{
		driver.findElementByXPath("//android.widget.TextView[@text='Enter Password']").getText();
		result = false;
	}
	
	else if warningConfirmPassword == true{
		driver.findElementByXPath("//android.widget.TextView[@text='Password Does Not Matches']").getText();
		result = false;
	}
	
	else {
		result = true;
	}
	
	}
}
