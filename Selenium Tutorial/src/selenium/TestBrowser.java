package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBrowser {

	public static void main(String[] args) {
		
 System.setProperty("webdriver.ie.driver","C:\\Users\\recurpost-qa\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
 
				//WebDriver driver = new ChromeDriver();
				//driver.get("https://www.google.com");
 

//it is used to define IE capability 
//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, "True");
//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
 
//capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");,

				
 //InternetExplorerDriver driver = new InternetExplorerDriver(capabilities);
 EdgeDriver driver = new EdgeDriver();
 driver.get("https://way2automation.com");
 

	}

}
