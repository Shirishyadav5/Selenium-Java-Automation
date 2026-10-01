package POPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPOPUP1
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

//        switch to Alert POPUP
        String text = driver.switchTo().alert().getText();
        System.out.println(text);

        Thread.sleep(4000);
//        click On cancle button on alert popup
//        driver.switchTo().alert().dismiss();

//        click on ok button on alert popup
        driver.switchTo().alert().accept();

        Thread.sleep(2000);
//        click on ok button
        driver.switchTo().alert().accept();

        //Enter input in alert popup
//        driver.switchTo().alert().sendKeys("kldkndd");
    }
}
