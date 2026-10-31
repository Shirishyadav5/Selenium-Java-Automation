package S3_IMP_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_Calender1
{
    static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();
        Thread.sleep(3000);

//        click on calender
        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
        Thread.sleep(3000);
//        select year
        WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select s=new Select(year);
        s.selectByVisibleText("2028");
        Thread.sleep(3000);
//        select month
        WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select selectmonth=new Select(month);
        selectmonth.selectByVisibleText("September");
        Thread.sleep(3000);
//        select Date
        int day=17;
        driver.findElement(By.xpath("//div[text()='"+ day +"']")).click();
        Thread.sleep(3000);

    }
}
