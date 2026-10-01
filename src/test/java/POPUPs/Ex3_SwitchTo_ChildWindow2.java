package POPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchTo_ChildWindow2
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(4000);

//        click on New tab
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Thread.sleep(4000);

//        get child window ID
        Set<String> allIDs = driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<>(allIDs);   //[mainpageid(0), childwindow(1)]
//        Switch to child window
        driver.switchTo().window(al.get(1));
//        click on Training
        driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
        Thread.sleep(4000);
//        switch to main page
        driver.switchTo().window(al.get(0));
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Thread.sleep(4000);
        //      get child window 2 and Switch to child window 2
        Set<String> allIDs1 = driver.getWindowHandles();
        ArrayList<String> al1=new ArrayList<>(allIDs1);

        driver.switchTo().window(al1.get(2));
//        driver.findElement(By.xpath("//span[@title='Smart Phones']")).click();
        Thread.sleep(3000);
        driver.close();








    }
}
