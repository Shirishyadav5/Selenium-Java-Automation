package Customized_ListBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_SelectOption
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(5000);

//        identify customized list box and store it in ref variable
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

//        create an object of Action class with webdriver object as a input
        Actions act=new Actions(driver);

//        click on customized list box
        act.click(country).perform();
        Thread.sleep(3000);
//        use keys to Arrow down
        act.sendKeys(Keys.ARROW_DOWN).perform(); Thread.sleep(3000);
        act.sendKeys(Keys.ARROW_UP).perform();  Thread.sleep(3000);
        act.sendKeys(Keys.ENTER).perform();








    }
}
