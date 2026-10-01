package Handling_of_MultipleElements.Practice;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1getalllinks
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> alllinks = driver.findElements(By.xpath("//a"));

        for (WebElement link:alllinks)
        {
            String text = link.getText();
            System.out.println(text);

        }
        System.out.println("-------SIZE---------");
        System.out.println(alllinks.size());

        System.out.println("------URLS-----------");
        for (WebElement url:alllinks)
        {
             String address = url.getAttribute("href");
            System.out.println(address);


        }








    }
}
