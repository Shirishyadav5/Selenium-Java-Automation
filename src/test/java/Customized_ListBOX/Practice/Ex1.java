package Customized_ListBOX.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

//        1 identify customized list box and store it in variable
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

//        create an object of Actions class which accept webdriver object as a input
        Actions act=new Actions(driver);

//        actions class methods
        act.click(country).perform();
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.ENTER).perform();





    }
}
