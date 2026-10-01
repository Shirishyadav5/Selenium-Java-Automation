package Dynamic_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_getratingsfromlaptopdell
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn26'])[1]")).sendKeys("Redmi");

        driver.findElement(By.xpath("(//button[@class='XFwMiH'])[1]")).click();
        Thread.sleep(3000);
        String retings = driver.findElement(By.xpath("((//div[@class='jIjQ8S'])[1]//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println(retings);



    }
}
