package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_MouseLeftClick_Actions
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);

//        close sign in page
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(4000);

//        identify element which perform mouse action
        WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));

//        create an object of Actions Class which accept webdriver object as a input
        Actions act=new Actions(driver);

//        call actions class methods- movetoelement()
        act.moveToElement(cart).click().perform();












    }
}
