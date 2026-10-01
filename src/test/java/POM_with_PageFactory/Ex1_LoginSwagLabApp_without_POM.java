package POM_with_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Ex1_LoginSwagLabApp_without_POM
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Enter username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//        Enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//        Click on login button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

//        verify logo text
        String actlogotext = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
        String explogotext = "Swag Labs";

        if (actlogotext.equals(explogotext))
        {
            System.out.println("Tc Pass");
        }
        else
        {
            System.out.println("Tc Fail");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
