package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_Attribute
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("D:\\Automation JAVA\\Code\\Seleniumjava\\HTML_Files\\Tagname.html");

        driver.findElement(By.id("3423")).sendKeys("xyz");

    }
}
