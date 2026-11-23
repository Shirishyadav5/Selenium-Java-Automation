package CSS_SELECTORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_AnyAttribute
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

//        driver.findElement(By.cssSelector("input[id='name']")).sendKeys("abc");
//        driver.findElement(By.cssSelector("*[id='name']")).sendKeys("abc");
        driver.findElement(By.cssSelector("[id='name']")).sendKeys("abc");

    }
}
