package POPUPs.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);

//      click on Prompt alert
        driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();

//        switch to alert popup
        Alert alt=driver.switchTo().alert();

//        Enter name in the prompt alert field
        alt.sendKeys("shirish");

//        click on ok button
        alt.accept();









    }
}
