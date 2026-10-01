package SeleniumWaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Ex5_FluentWait2
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        FluentWait wait=new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5));  //Specify the timeout of the wait
        wait.pollingEvery(Duration.ofSeconds(1/2));   //Specify polling time
        WebElement confirmalert = driver.findElement(By.xpath("//button[@id='confirmBtn']"));
        wait.until(ExpectedConditions.elementToBeClickable(confirmalert));
        confirmalert.click();

        FluentWait wait1=new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(20));  //Specify the timeout of the wait
        wait.pollingEvery(Duration.ofSeconds(2));   //Specify polling time
        wait1.until(ExpectedConditions.alertIsPresent());
        Alert alt = driver.switchTo().alert();
        alt.dismiss();












    }
}
