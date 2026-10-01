package WebTable.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class GetROWSIZE
{
    static void main()
    {
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("start-maximized");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> allrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int size1 = allrows.size();
        System.out.println(size1);

    }
}
