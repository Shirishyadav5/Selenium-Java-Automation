package POPUPs.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(4000);
//        click on simple alert
        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
Thread.sleep(3000);
//        switch to alert popup
        Alert alt = driver.switchTo().alert();
//        get text present on alert popup
        String text=alt.getText();
        System.out.println(text);

//        click on ok button
        alt.accept();

    }
}
