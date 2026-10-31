package S3_IMP_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7_JavaScriptExecutor1_clickOnElement
{
    static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement start = driver.findElement(By.xpath("//button[@class='start']"));

        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",start);


    }
}
