package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex3_HeadlessBrowser
{
    static void main() {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--headless");

        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.flipkart.com/");

        System.out.println(driver.getTitle());

        driver.quit();



    }
}
