package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.classfile.instruction.CharacterRange;

public class Ex4_Disable_Notification
{
    static void main() {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--disable-notifications");

        WebDriver driver=new ChromeDriver(co);
        driver.get("https://useinsider.com/");
    }
}
