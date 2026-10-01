package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex93_setposition
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Point position=driver.manage().window().getPosition();
        System.out.println(position);
        Point p=new Point(300,400);
        driver.manage().window().setPosition(p);
    }
}
