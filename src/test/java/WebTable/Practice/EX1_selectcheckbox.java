package WebTable.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EX1_selectcheckbox
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
//

        List<WebElement> page = driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
        for (WebElement paginations:page)
        {


            paginations.click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr//input[1]")).click();
            Thread.sleep(2000);

        }
    }
}
