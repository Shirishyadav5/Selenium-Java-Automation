package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9_isEnabled
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

       boolean result=driver.findElement(By.xpath("//button[@class='start']")).isEnabled();
        System.out.println(result);
        if (result)
        {
            System.out.println("start button is enabled");
        }
        else
        {
            System.out.println("Start button is disabel");
        }



    }
}
