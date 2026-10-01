package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Ex4_FluentWait
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        FluentWait wait=new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5));    //specify the timeout of the wait
        wait.pollingEvery(Duration.ofSeconds(1/2));     //specify polling time
        wait.ignoring(NoSuchElementException.class);    //specify what exceptions to ignor

        WebElement alert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
        wait.until(ExpectedConditions.elementToBeClickable(alert));
        alert.click();

        wait.until(ExpectedConditions.alertIsPresent());    //This is how we specify the condition to wait on.
        driver.switchTo().alert();






    }
}
