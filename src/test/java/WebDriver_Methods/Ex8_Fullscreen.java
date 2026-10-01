package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_Fullscreen
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
    }
}
