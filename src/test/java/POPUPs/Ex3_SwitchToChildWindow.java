package POPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchToChildWindow
{

    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(3000);
//        Click on new Tab
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

//        get child window ID
        Set<String> allIDs = driver.getWindowHandles();     //[mainpageID, ChildwindowID]
        ArrayList<String> al=new ArrayList(allIDs);         //[mainpageID(0), childwindowID(0)]
        String childwindowID = al.get(1);

        Thread.sleep(3000);
//        switch to child window
        driver.switchTo().window(childwindowID);
//        click on Training link from child window
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();









    }
}
