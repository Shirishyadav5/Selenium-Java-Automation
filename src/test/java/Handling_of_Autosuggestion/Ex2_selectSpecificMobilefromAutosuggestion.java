package Handling_of_Autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_selectSpecificMobilefromAutosuggestion
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);

//        Enter mobile name
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
            Thread.sleep(3000);
        List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
        String expText="redmi turbo 5";
        for (WebElement option:alloptions)
        {
            String acttext = option.getText();
            if (acttext.equals(expText))
            {
                option.click();
                break;
            }
        }










    }
}
