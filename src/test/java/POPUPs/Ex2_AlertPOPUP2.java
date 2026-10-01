package POPUPs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPOPUP2
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

//        Switch to alert POPUP
        Alert alt = driver.switchTo().alert();

//        get text present on alert popup
        String text = alt.getText();
        System.out.println(text);
//        click on cancel button
//        alt.dismiss();

//        click on ok button
        alt.accept();
        Thread.sleep(3000);

        alt.accept();






    }
}
