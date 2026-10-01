package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_isMultiple1
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s=new Select(colors);
        boolean result=s.isMultiple();
        System.out.println(result);

        if (result)
        {
            System.out.println("List Box is Multi-selectable");
        }
        else
        {
            System.out.println("List Box is Single-Selectable");
        }


    }
}
