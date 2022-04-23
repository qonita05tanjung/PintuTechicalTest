package pintuAndroidTest;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class base {

	AndroidDriver<AndroidElement> driver;

	DesiredCapabilities cap= new DesiredCapabilities();

	File appDir = new File("src");
	File app = new File(appDir, "Sample Android App Login Test_v4.0_apkpure.com.apk");

	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pintuAndroidTest");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator");
	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

	driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	
	
			
	
	
}
