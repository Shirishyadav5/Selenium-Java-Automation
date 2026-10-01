package POPUPs.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Demo1_child_Browser
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(3000);
//      click on Home Button
        driver.findElement(By.xpath("//input[@name='home']")).click();

        driver.navigate().back();
        Thread.sleep(3000);
//        click on new tab
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Thread.sleep(3000);
        
//        get child window id
        Set<String> ids = driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<>(ids);

//        switch to child window
        driver.switchTo().window(al.get(1));

//        click on training
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
        Thread.sleep(3000);
//        Switch to main window
        driver.switchTo().window(al.get(0));

//        click on new window
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Thread.sleep(5000);
//        get child window2 id
        Set<String> ids1 = driver.getWindowHandles();
        ArrayList<String> al1=new ArrayList<>(ids1);

//        switch to new window / child window 2
        driver.switchTo().window(al1.get(2));
        Thread.sleep(3000);
        driver.close();



    }
}
