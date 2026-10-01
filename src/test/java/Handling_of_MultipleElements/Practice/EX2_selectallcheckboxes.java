package Handling_of_MultipleElements.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EX2_selectallcheckboxes
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> alldays = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        for (WebElement day:alldays)
//        {
//            day.click();
//        }
        for (int i=0; i<=alldays.size()-6; i++)
        {
            alldays.get(i).click();
            Thread.sleep(3000);
        }
        int size = alldays.size() - 6;
        System.out.println(size);


    }
}
