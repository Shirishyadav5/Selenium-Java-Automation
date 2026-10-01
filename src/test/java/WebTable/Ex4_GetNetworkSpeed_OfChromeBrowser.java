package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_GetNetworkSpeed_OfChromeBrowser
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String text = driver.findElement(By.xpath("//td[text()='Chrome']//parent::tr/td[contains(text(),'Mbps')]")).getText();
        System.out.println(text);


        WebElement CPU = driver.findElement(By.xpath("//td[text()='Firefox']//parent::tr/td[contains(text(),'%')]"));
        String text2 = CPU.getText();
        System.out.println(text2);
    }
}
