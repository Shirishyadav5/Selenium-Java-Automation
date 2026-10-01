package WebTable.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1getvaluemB

{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);

        String memory = driver.findElement(By.xpath("(//td[text()='Internet Explorer']//parent::tr/td[contains(text(),'MB')])[2]")).getText();
        System.out.println(memory);





    }
}
