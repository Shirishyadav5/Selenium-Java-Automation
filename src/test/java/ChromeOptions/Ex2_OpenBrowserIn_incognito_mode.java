package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex2_OpenBrowserIn_incognito_mode
{
    static void main()
    {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--incognito");

        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.facebook.com/");
    }
}
