package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_XpathByAttribute
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");

        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("909098989");






    }
}
