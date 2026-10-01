package Handling_of_MultipleElements;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex3_getAll_LinkURLfromWebpage
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        List<WebElement> alllink = driver.findElements(By.xpath("//a"));

        for (WebElement singlelink:alllink)
        {
             String url = singlelink.getAttribute("href");
            System.out.println(url);
        }




    }
}
