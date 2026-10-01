package ChromeOptions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Ex5_GetBrowserName_Version
{
    static void main() {

        WebDriver driver = new ChromeDriver();

        Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
        System.out.println(capabilities.getBrowserName());
        System.out.println(capabilities.getBrowserVersion());
        System.out.println(capabilities.getPlatformName());



    }
}
