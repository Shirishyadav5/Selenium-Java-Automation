package CSS_SELECTORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_MatchWithSuffixPrefix
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.cssSelector("[placeholder^='Enter N']")).sendKeys("abc");
        driver.findElement(By.cssSelector("[placeholder$='Name']")).sendKeys("abc");






    }
}
