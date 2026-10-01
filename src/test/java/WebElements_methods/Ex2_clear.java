package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_clear
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='name']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("xyz");

        System.out.println("---------------");
        Thread.sleep(2000);
       WebElement ele=driver.findElement(By.xpath("//input[@id='name']"));
        ele.clear();
        ele.sendKeys("shirish");
    }
}
