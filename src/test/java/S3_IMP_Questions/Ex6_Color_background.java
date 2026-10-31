package S3_IMP_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import java.awt.*;

public class Ex6_Color_background
{

    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(4000);

        WebElement logo = driver.findElement(By.xpath("//div[@class='_1psv1zeb9 _1psv1ze0 _1psv1ze9x _1psv1ze7o _1psv1ze2u _1psv1ze53 _7dzyg2x _1psv1ze29 _1psv1ze53 _1psv1zee3 _1o6mltlh1 _1o6mltlc0 _1o6mltl1y _1o6mltl6z _1o6mltlk4']"));
        String actRGBColour = logo.getCssValue("background-color");
        System.out.println(actRGBColour);

        String expHexColor="#ffe51f";

//        convert RGB to hex
        String actHexcolor = Color.fromString(actRGBColour).asHex();
        System.out.println(actHexcolor);

        if (actHexcolor.equals(expHexColor))
        {
            System.out.println("Yellow color");
        }
        else
        {
            System.out.println("other color");
        }

    }
}
