package Handling_of_MultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex4_selectAllCheckboxes
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Automation%20JAVA/Code/Seleniumjava/HTML_Files/Checkboxeslink.html");

        List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        
        for (WebElement checkbox : allcheckboxes) 
        {
             checkbox.click();
             Thread.sleep(1000);
        }










    }
}
