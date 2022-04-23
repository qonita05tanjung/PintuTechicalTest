package pintuAndroidTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class loginTest {

	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeout().implicitlyWait(10, TimeUnit.SECONDS);
	
	boolean result = true;
	String email = "user123@mail.com";
	String pass = "112233";
	
	@Test
	public void login(String email, String pass)
	{
	// input Email and password then click login
	driver.findElementById("com.loginmodule.learning:id/textInputEditTextEmail").sendKeys(email);
	driver.findElementById("com.loginmodule.learning:id/textInputEditTextPassword").sendKeys(pass);
	driver.findElementById("com.loginmodule.learning:id/appCompatButtonLogin").click();
	
	// verify response
	warningEmail = driver.findElementsByXPath("//android.widget.TextView[@text='Enter Valid Email']").isDisplayed();
	warningWrong = driver.findElementsByXPath("//android.widget.TextView[@text='Wrong Email or Password']").isDisplayed();
	hello = driver.findElementsByXPath("//android.widget.TextView[@text='Hello,']").isDisplayed();
	
	if warningEmail == true{
		driver.findElementByXPath("//android.widget.TextView[@text=''Enter Valid Email']").getText();
		result = false;
	}
	else if warningWrong == true{
		driver.findElementByXPath("//android.widget.TextView[@text='Wrong Email or Password']").getText();
		result = false;
	}
	else if hello == true{
		driver.findElementsByXPath("//android.widget.TextView[@text='Hello,']").getText();
		result = true;
	}
	
	else {
		result = false;
	}
	
	
	}
	
	
}
