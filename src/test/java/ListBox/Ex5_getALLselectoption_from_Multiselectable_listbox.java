package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex5_getALLselectoption_from_Multiselectable_listbox
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement color=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s=new Select(color);
        s.selectByIndex(3);
        s.selectByVisibleText("Red");
        s.selectByValue("red");

       List<WebElement> options=s.getAllSelectedOptions();
        for (WebElement s1:options)
        {
            System.out.println(s1.getText());
        }





    }
}
