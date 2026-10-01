package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex2_Explicitwait
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));

        WebElement start = driver.findElement(By.xpath("//button[@class='start']"));
        wait.until(ExpectedConditions.elementToBeClickable(start));
        start.click();

        WebElement alert = driver.findElement(By.xpath("//button[@id='alertBtn']"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='alertBtn']")));
        alert.click();

        wait.until(ExpectedConditions.alertIsPresent());


    }
}
