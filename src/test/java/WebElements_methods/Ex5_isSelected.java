package WebElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_isSelected
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        boolean result=driver.findElement(By.xpath("//input[@id='saturday']")).isSelected();
        System.out.println(result);

        if (result)
        {
            System.out.println("checkbox is selected");
        }
        else
        {
            System.out.println("checkbox is de-selected");
        }
    }
}
