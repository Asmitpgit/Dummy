package Appium.AsmitPatil;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasice {
	
	@Test
	
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("\\Users\\akash\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("AsmitEmulator");
		options.setApp("\\Users\\akash\\eclipse-workspace\\AsmitPatil\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.quit();
		service.stop();
		 
		
		
		
	}

}
