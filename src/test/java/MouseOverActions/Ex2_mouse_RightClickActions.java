package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_mouse_RightClickActions
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);

//        close signin popup
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
Thread.sleep(3000);
//        identify the mouse over action element
        WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
Thread.sleep(3000);
//        create an object actions class which accept webdriver object as a input
        Actions act=new Actions(driver);
        Thread.sleep(3000);

//        call the actions class methods Movetoelement
//        act.moveToElement(cart).contextClick().perform();

    /*    act.contextClick().perform();
        act.moveToElement(cart).perform();
    */

        act.contextClick(cart).perform();



    }
}
