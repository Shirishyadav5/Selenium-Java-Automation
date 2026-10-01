package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_Mouse_ScrollElement
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(5000);

        WebElement ele = driver.findElement(By.xpath("//a[text()='1']"));
        Actions act=new Actions(driver);
        act.scrollToElement(ele).perform();

        Thread.sleep(4000);
        WebElement ele1 = driver.findElement(By.xpath("//h2[text()='Dynamic Button']"));
        act.scrollToElement(ele1).perform();








    }
}
