package WebTable.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class getcolumnsize
{
    static void main() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> colums = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        System.out.println(colums.size());

//        get specific data from column
        String name = driver.findElement(By.xpath("(//table[@name='BookTable']//tr)[4]/td[2]")).getText();
        System.out.println(name);
    }
}
