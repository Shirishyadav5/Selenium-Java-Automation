package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9_isDisplayed
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);

        boolean result=false;
        try
        {

            result = driver.findElement(By.xpath("(//a[text()='ewrt'])[1]")).isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("NosuchElement is Handled");
        }
        System.out.println(result);
        if (result)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("Element is not present");
        }


    }
}
