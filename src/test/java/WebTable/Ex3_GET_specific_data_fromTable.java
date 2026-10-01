package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_GET_specific_data_fromTable
{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[3]"));
        String text1 = text.getText();
        System.out.println(text1);


        WebElement specificname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]"));
        String text2 = specificname.getText();
        System.out.println(text2);








    }
}
