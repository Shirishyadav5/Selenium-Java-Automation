package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex1_Implicitwait
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Thread.sleep(2000);
//        click on close option
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();

//        Enter mobile name in input field
        driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn26'])[1]")).sendKeys("redmi note");

//        click on search icon
        driver.findElement(By.xpath("(//button[@class='XFwMiH'])[1]")).click();

//        get mobile price
        String price = driver.findElement(By.xpath("(//div[@class='jIjQ8S'])[1]//div[@class='hZ3P6w DeU9vF']")).getText();
        System.out.println(price);


    }
}
