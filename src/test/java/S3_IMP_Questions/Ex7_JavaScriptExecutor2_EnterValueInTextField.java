package S3_IMP_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7_JavaScriptExecutor2_EnterValueInTextField
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));

        ((JavascriptExecutor)driver).executeScript("arguments[0].value='abc'",Name);


    }
}
