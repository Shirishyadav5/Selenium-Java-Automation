package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_Sendkeys
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");

        System.out.println("----------------------------------");

        WebElement element=driver.findElement(By.xpath("//input[@id='name']"));
        element.sendKeys("pqr");



    }
}
