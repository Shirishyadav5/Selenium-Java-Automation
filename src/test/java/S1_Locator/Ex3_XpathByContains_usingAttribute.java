package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_XpathByContains_usingAttribute
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).sendKeys("shirish");

        driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys("shirishyadav@gmail.com");

    }
}
