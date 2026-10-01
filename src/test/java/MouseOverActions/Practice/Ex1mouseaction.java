package MouseOverActions.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1mouseaction
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
//        close the popup
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(3000);

//        identify target element
        WebElement ele = driver.findElement(By.xpath("(//div[@class='wszdrO'])[1]"));

//        create an object actions class which accept webdriver object as a input
        Actions act=new Actions(driver);

        act.moveToElement(ele).perform();



    }
}
