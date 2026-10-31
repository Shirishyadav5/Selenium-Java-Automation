package S3_IMP_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_Calender2_MakeMyTripDatePicker
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/flights/");
        Thread.sleep(4000);

//        close login popup

        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        Thread.sleep(4000);
//        click on departure date
        driver.findElement(By.xpath("//label[@for='departure']")).click();
        Thread.sleep(4000);

        String targetMonth = "February 2027";
        String targetDay = "2";

        // Loop until target month appears
        while (true)
        {
            String month = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
            if (month.contains(targetMonth))
            {
                break;
            }
            else
            {
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            }
            Thread.sleep(3000);

        }
        Thread.sleep(3000);
            //click on target date
            driver.findElement(By.xpath("(//div[@class='DayPicker-Week']//p[text()='"+ targetDay +"'])[1]")).click();






    }
}
