package POPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchToMainPage_from_Childwindow1
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(5000);
//        click on new Tab
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Thread.sleep(5000);
//        get child window ID
        Set<String> allIDs = driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<>(allIDs);

//        Switch to child window ID
        driver.switchTo().window(al.get(1));
//        click on training link
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
        Thread.sleep(5000);

//        switch to main Page
        driver.switchTo().window(al.get(0));
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Thread.sleep(5000);












    }
}
