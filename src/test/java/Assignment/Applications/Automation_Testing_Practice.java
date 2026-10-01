package Assignment.Applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Testing_Practice
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shirish");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shirishyadav5@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8987654670");
        driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Near hinjewadi, near it park Pune");
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='monday']")).click();
        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));

        Select S=new Select(country);
        S.selectByVisibleText("Canada");

//       WebElement colour=driver.findElement(By.xpath("//select[@id='colours']"));
//        Select s=new Select(colour);
//        s.selectByVisibleText("Blue");

        driver.findElement(By.xpath("(//a[contains(text(),'Home')])[2]")).click();
    }

}
