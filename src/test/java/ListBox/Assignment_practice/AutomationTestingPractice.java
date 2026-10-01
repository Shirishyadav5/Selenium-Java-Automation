package ListBox.Assignment_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingPractice
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shirish");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shyadav5@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("84746383747");
        driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Flat 202, Avanza tower, 23 street Thane, Mumbai-182838");
        driver.findElement(By.xpath("//input[@id='male']")).click();
        driver.findElement(By.xpath("//input[@id='sunday']")).click();
        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
        Select s=new Select(country);
        s.selectByVisibleText("Canada");
        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s1=new Select(colors);
        s1.selectByVisibleText("Red");
        s1.selectByValue("green");
        WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
        Select s2=new Select(animal);
        s2.selectByValue("cat");
        WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("21/08/2026");
//        driver.findElement(By.xpath("//input[@id='txtDate']")).sendKeys("21/08/2026");
        driver.findElement(By.xpath("//input[@id='start-date']")).sendKeys("21/08/2026");
        driver.findElement(By.xpath("//input[@id='end-date']")).sendKeys("20/08/2027");
        driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();


    }
}
