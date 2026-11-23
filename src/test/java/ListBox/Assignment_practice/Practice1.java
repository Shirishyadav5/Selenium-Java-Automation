package ListBox.Assignment_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Practice1
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

        Select s=new Select(country);
        s.selectByValue("canada");
        s.selectByVisibleText("United Kingdom");

        Thread.sleep(3000);

        WebElement color = driver.findElement(By.xpath("//select[@id='colors']"));
        Select c=new Select(color);
        c.selectByIndex(2);
        c.selectByIndex(3);
        c.selectByIndex(4);
        c.selectByIndex(5);
        Thread.sleep(2000);
        c.deselectByIndex(4);
//        driver.close();

        boolean listBox = c.isMultiple();
        System.out.println(listBox);

        System.out.println(s.isMultiple());

        WebElement firstoption = c.getFirstSelectedOption();
        System.out.println(firstoption.getText());

        List<WebElement> alloptions = c.getAllSelectedOptions();
        for (WebElement option:alloptions)
        {
            System.out.println(option.getText());
        }

        List<WebElement> options = c.getOptions();

        for (WebElement option:options)
        {
            System.out.println(option.getText());
            System.out.println(option.getSize());
        }






    }
}
