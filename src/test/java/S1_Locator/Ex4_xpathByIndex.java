package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_xpathByIndex
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc");

        driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("shirishyadav5@gmail.com");

        driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("916319919");

    }
}
