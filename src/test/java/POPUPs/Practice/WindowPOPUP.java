package POPUPs.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class WindowPOPUP
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(3000);

//      Click on new window
        driver.findElement(By.xpath("//input[@value='New Window']")).click();
        Thread.sleep(3000);

//        get child window
        Set<String> allids = driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<>(allids);

//      switch to child window
        driver.switchTo().window(al.get(1));
        Thread.sleep(3000);

        driver.close();


        driver.switchTo().window(al.get(0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        Set<String> allids1 = driver.getWindowHandles();
        ArrayList<String> al1=new ArrayList<>(allids1);

//        switch to child window 2
        driver.switchTo().window(al1.get(1));
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
        driver.close();

        driver.switchTo().window(al.get(0));
        driver.close();









    }
}
