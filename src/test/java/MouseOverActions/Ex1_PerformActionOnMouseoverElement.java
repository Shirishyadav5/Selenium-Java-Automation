package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_PerformActionOnMouseoverElement
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
//        close the popup
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(3000);

//      Step1: Identify mouse over element
        WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
        Thread.sleep(3000);

//      step2: create an object Action class with webdriver object as a input
        Actions act=new Actions(driver);

//        step3: call action class methods -moveToElement()
        act.moveToElement(login).perform();
        Thread.sleep(3000);

//      click on order link from mouse over element
        driver.findElement(By.xpath("//div[text()='Orders']")).click();






    }
}
