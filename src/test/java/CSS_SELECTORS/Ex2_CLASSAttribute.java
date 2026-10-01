package CSS_SELECTORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_CLASSAttribute
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.cssSelector("button.start")).click();
        driver.findElement(By.cssSelector("*.start")).click();
        driver.findElement(By.cssSelector(".start")).click();






    }
}
