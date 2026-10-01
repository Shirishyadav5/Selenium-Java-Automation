package Dynamic_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_getRating_ReviewFromFLIPKARTAPP
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);

//        click on close
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);
//        enter mobile name
        driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn26'])[1]")).sendKeys("samsung s26 ultra 5g");
        Thread.sleep(2000);
//        click on search icon
        driver.findElement(By.xpath("(//button[@class='XFwMiH'])[1]")).click();
        Thread.sleep(2000);
//        Get mobile name
        String mobilename = driver.findElement(By.xpath("(//div[@class='jIjQ8S'])[1]//div[@class='RG5Slk']")).getText();
        System.out.println("Mobile Name "+mobilename);

//         get star
        String star = driver.findElement(By.xpath("(//div[@class='jIjQ8S'])[1]//div[@class='MKiFS6']")).getText();
        System.out.println("Star Ratings "+star);
//        get ratings
        String ratings = driver.findElement(By.xpath("((//div[@class='jIjQ8S'])[1]//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println("Rating "+ratings);

//        get reviews
        String reviews = driver.findElement(By.xpath("((//div[@class='jIjQ8S'])[1]//span[@class='PvbNMB']//span)[4]")).getText();
        System.out.println("Review "+reviews);
//      get price
        String price = driver.findElement(By.xpath("(//div[@class='jIjQ8S'])[1]//div[@class='hZ3P6w DeU9vF']")).getText();
        System.out.println("Price "+price);

        //      get % off
        String off = driver.findElement(By.xpath("(//div[@class='jIjQ8S'])[1]//div[@class='HQe8jr']//span")).getText();
        System.out.println("OFFER "+off);

//        Bank offer
        String offer = driver.findElement(By.xpath("((//div[@class='jIjQ8S'])[1]//div[@class='hx1EGN'])[1]")).getText();
        System.out.println("Bank Offer "+offer);

    }
}
