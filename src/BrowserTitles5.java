
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserTitles5 {
    @Test
    public void chrome5() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setBrowserName("chrome");
        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.31:4444"),caps);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }

    @Test
    public void edge5() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        // caps.setBrowserName("MicrosoftEdge");
        caps.setCapability(CapabilityType.BROWSER_NAME,"MicrosoftEdge");
        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.31:4444"),caps);
        driver.manage().window().maximize();
        driver.get("https://www.expedia.co.in/");
        System.out.println(driver.getTitle());
        driver.close();
    }

}
