package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex92_SetSize
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Dimension size=driver.manage().window().getSize();
        System.out.println(size);
        
        Dimension d=new Dimension(100,100);
        driver.manage().window().setSize(d);
    }
}
