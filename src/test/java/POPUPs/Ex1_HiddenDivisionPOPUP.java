package POPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_HiddenDivisionPOPUP
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mobikwik.com/");

        driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();

        driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("987654352");





    }
}
