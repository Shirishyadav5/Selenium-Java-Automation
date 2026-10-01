package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_SwwitchTo_mainPage_from_Iframe
{
    static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
//        Switch to frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));

        driver.findElement(By.xpath("//button[contains(text(),' Date and Time.')]")).click();

//        Switch to main Page from Iframe
        driver.switchTo().parentFrame();        // switch frame to immediate parent frame/main
        driver.switchTo().defaultContent();     // switch iframe any child frame to main Page

        driver.findElement(By.xpath("//a[@id='menuButton']")).click();

    }
}
