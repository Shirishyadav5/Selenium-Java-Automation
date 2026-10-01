package MouseOverActions.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseScrollAction
{
    static void main() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        Actions act=new Actions(driver);
        Actions scroll = act.scrollToElement(driver.findElement(By.xpath("//h2[text()='Drag and Drop']")));
        scroll.perform();

        act.moveToElement(driver.findElement(By.xpath("//select[@id='country']"))).click().perform();

    }
}
