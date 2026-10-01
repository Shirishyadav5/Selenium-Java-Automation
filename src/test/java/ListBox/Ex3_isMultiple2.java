package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_isMultiple2
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

//        identify listbox
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select s=new Select(country);
        boolean result = s.isMultiple();
        System.out.println(result);

        if (result)
        {
            System.out.println("List box is multi-selectable");
        }
        else
        {
            System.out.println("List box is Single-selectable");
        }










    }
}
