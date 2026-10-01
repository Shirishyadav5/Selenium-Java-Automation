package CSS_SELECTORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_IDAttribute
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.cssSelector("input#name")).sendKeys("abc");
        driver.findElement(By.cssSelector("*#name")).sendKeys("abc");
        driver.findElement(By.cssSelector("#name")).sendKeys("abc");









    }
}
