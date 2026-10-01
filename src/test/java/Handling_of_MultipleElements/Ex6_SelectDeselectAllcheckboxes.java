package Handling_of_MultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex6_SelectDeselectAllcheckboxes
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Automation%20JAVA/Code/Seleniumjava/HTML_Files/Checkboxeslink.html");

        List<WebElement> allcheckboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(WebElement checkbox : allcheckboxs)
        {
            checkbox.click();
            Thread.sleep(1000);

        }
        Thread.sleep(3000);

//        Deselect Options
//        for (WebElement checkbox1:allcheckboxs)
//        {
//            checkbox1.click();
//            Thread.sleep(1000);
//        }

        for (int i=allcheckboxs.size()-1; i>=0; i--)
        {
            WebElement checkbox1 = allcheckboxs.get(i);
            checkbox1.click();
            Thread.sleep(1000);
        }



    }
}
