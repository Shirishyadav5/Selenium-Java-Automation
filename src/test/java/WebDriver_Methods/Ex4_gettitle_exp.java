package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_gettitle_exp
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String acttitle=driver.getTitle();
        String exptitle="Facebook";

        if (acttitle.equals(exptitle))
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("fail");
        }




    }
}
