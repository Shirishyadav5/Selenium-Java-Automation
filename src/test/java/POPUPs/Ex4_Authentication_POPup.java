package POPUPs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_Authentication_POPup
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/basic_auth");
//        driver.get("https://the-internet.herokuapp.com/basic_auth");
//        url=  https://UN:PWD@remianingURL
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
