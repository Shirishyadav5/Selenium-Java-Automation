package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_SwitchToNestedFrame2
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://autotestsandbox.com/examples/nested-iframes");
//        Switch to Outer frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Outer nested frame']")));

//        Switch to inner frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Inner']")));

       String text1=driver.findElement(By.xpath("//p[text()='Inner iframe content']")).getText();

        System.out.println(text1);





    }

}
