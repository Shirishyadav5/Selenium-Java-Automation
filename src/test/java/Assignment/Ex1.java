package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        String acttitle=driver.getTitle();
        String exptitle="Google";
        if (acttitle.equals(exptitle))
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("fail");
        }
        System.out.println(acttitle);
        Thread.sleep(2000);
        driver.get("https://www.instagram.com/?hl=en");
        String Instatitle=driver.getTitle();
        String extitle="Instagram";
        if (Instatitle.equals(extitle))
        {
            System.out.println("Instagram Verify");
        }
        else
        {
            System.out.println("Fail");
        }
        System.out.println(Instatitle);
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();


    }
}
