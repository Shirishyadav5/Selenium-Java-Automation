package Customized_ListBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_SelectOption_AUS
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(4000);

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Actions act=new Actions(driver);
        act.click(country).perform();

        for (int i=1; i<=5; i++)
        {
            act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(300);
        }
        act.sendKeys(Keys.ENTER).perform();






    }

}
