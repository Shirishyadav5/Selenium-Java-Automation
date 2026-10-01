package ListBox.Assignment_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex1listBox
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select s=new Select(country);
//        s.selectByIndex(0);
            s.selectByValue("canada");
            s.selectByIndex(2);
            s.selectByIndex(4);

        boolean result = s.isMultiple();
        System.out.println(result);

        WebElement selectedoption = s.getFirstSelectedOption();
        System.out.println(selectedoption.getText());

        List<WebElement> getselectedoptions = s.getAllSelectedOptions();
        for (WebElement option:getselectedoptions)
        {
            String text=option.getText();
            System.out.println(text);
        }

        System.out.println("---------------------");
        List<WebElement> options = s.getOptions();
        for (WebElement option:options)
        {
            System.out.println(option.getText());
        }



    }
}
