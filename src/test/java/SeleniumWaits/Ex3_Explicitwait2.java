package SeleniumWaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex3_Explicitwait2
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement start = driver.findElement(By.xpath("//button[@class='start']"));
        wait.until(ExpectedConditions.elementToBeClickable(start));
        start.click();

        WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement alert = driver.findElement(By.xpath("//button[@id='alertBtn']"));
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='alertBtn']")));
        alert.click();

        WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(3));
        wait2.until(ExpectedConditions.alertIsPresent());
        Alert alt = driver.switchTo().alert();
        alt.accept();



    }
}
