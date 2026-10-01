package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_getcolumnsizeIN_WEBTABLE
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> colsize = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
        int column = colsize.size();
        System.out.println(column);

        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]/td")).size();
        System.out.println(columns);











    }
}
