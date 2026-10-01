package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex7_getsize_of_alloptions
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));

        Select s=new Select(colors);

        List<WebElement> options = s.getOptions();
        int size = options.size();
        System.out.println(size);


        System.out.println("---------");
        System.out.println(s.getOptions().size());

        }







    }

