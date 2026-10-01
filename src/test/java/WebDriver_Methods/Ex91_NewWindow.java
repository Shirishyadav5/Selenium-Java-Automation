package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex91_NewWindow
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.switchTo().newWindow(WindowType.WINDOW);
    }
}
