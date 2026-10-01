package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SwitchTo_frame
{

    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

//      driver.switchTo().frame(0);                           //frame Index
//      driver.switchTo().frame("iframeResult");              //FrameID or Name
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));  //frame WebElement
//        click on date and time
        driver.findElement(By.xpath("//button[contains(text(),'ate and Time.')]")).click();







    }
}
