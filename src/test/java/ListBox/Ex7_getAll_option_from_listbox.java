package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex7_getAll_option_from_listbox
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s=new Select(colors);
        List<WebElement> alloptions=s.getOptions();
        for (WebElement s1:alloptions)
        {
            System.out.println(s1.getText());
        }









    }
}
