package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9_isEnabled1
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        boolean result=driver.findElement(By.xpath("//button[text()='Request OTP']")).isEnabled();

        System.out.println(result);
        if (result)
        {
            System.out.println("button is Enabled");
        }
        else
        {
            System.out.println("button is disabled");
        }



    }
}
