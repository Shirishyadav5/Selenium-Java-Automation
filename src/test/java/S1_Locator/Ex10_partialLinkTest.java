package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex10_partialLinkTest
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("file:///D:/Automation%20JAVA/Code/Seleniumjava/HTML_Files/Tagname.html");

        driver.findElement(By.partialLinkText("insta")).click();
    }
}
