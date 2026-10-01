package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_getTitle
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        String title=driver.getTitle();
        System.out.println(title);

        System.out.println("-----------------");

        System.out.println(driver.getTitle());
    }
}
