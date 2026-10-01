package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_GetRowsize_InTable
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> allrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int size = allrows.size();
        System.out.println(size);

        int size1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(size1);

        System.out.println(driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size());
    }
}
