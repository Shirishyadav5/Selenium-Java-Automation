package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_Tagname
{

    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("D:\\Automation JAVA\\Code\\Seleniumjava\\HTML_Files\\Tagname.html");

        driver.findElement(By.tagName("input")).sendKeys("abc");
    }
}
