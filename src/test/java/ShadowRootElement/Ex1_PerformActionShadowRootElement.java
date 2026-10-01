package ShadowRootElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_PerformActionShadowRootElement
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://watir.com/examples/shadow_dom.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("shadow_host")).getShadowRoot().findElement(By.cssSelector("input[type='text']")).sendKeys("abc");

//
//        driver.findElement(By.xpath("shadow_host")).getShadowRoot().
//                findElement(By.cssSelector("input[type='text']")).sendKeys("abc");








    }

}
