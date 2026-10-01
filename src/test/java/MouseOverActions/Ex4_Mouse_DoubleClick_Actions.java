package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4_Mouse_DoubleClick_Actions
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(4000);

//        click on element
        WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

//      create an object of Actions class which accept webdriver object as an input
        Actions act=new Actions(driver);

//        call method
//        act.moveToElement(doubleclick).doubleClick().perform();

//        act.moveToElement(doubleclick).perform();
//        act.doubleClick().perform();

        act.doubleClick(doubleclick).perform();

Thread.sleep(5000);
//        switch to alert popup
        driver.switchTo().alert().accept();






    }
}
