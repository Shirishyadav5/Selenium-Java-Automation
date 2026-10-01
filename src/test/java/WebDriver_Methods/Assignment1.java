package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String acttitle=driver.getTitle();
        System.out.println(acttitle);

        String url=driver.getCurrentUrl();
        System.out.println(url);

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().back();

        String googletitle=driver.getTitle();
        String exptitle="Google";
        if (googletitle.equals(exptitle))
        {
            System.out.println("Google page is opened");
        }
        else
        {
            System.out.println("Google page is not opened");
        }
        Thread.sleep(3000);
        Dimension d=new Dimension(200,400);
        driver.manage().window().setSize(d);
        Thread.sleep(2000);

        Point p=new Point(100,500);
        driver.manage().window().setPosition(p);
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.navigate().forward();
        String facebooktitle=driver.getTitle();
        String expfacebooktitle="Facebook";
        if (facebooktitle.equals(expfacebooktitle))
        {
            System.out.println("Facebook page is opened");
        }
        else
        {
            System.out.println("Facebook page is not Opened");
        }

        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();

    }
}
