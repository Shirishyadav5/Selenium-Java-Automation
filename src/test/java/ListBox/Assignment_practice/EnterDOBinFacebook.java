package ListBox.Assignment_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterDOBinFacebook
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//span[text()='Create new account']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[text()='First name']")).sendKeys("Shirish");
        driver.findElement(By.xpath("//label[text()='Surname']")).sendKeys("Yadav");
        Thread.sleep(4000);
//        identify day list box
        WebElement day=driver.findElement(By.xpath("//div[@aria-label='Select day']"));
//        create object of select class with webelement argument
        Select s=new Select(day);
        s.selectByVisibleText("2");




    }
}
