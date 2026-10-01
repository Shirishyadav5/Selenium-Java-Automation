package Dynamic_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_getreviewfrommeesho
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.meesho.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("shoes");
        driver.findElement(By.xpath("(//div[@class='sc-iMXEkR jzfcTv'])[1]")).click();

        String reviews = driver.findElement(By.xpath("(//span[@class='sc-dOfePm fTrqZg NewProductCardstyled__RatingCount-sc-6y2tys-22 bzMyLg'])[1]")).getText();

        System.out.println(reviews);

    }
}
