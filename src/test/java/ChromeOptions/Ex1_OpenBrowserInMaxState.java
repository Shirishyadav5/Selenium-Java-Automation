package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex1_OpenBrowserInMaxState
{
    static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("start-maximized");

        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        driver.quit();
    }
}
