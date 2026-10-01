package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2_DeselectOption_from_multiselectableListBox
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

//        identify multipleselectable list box
        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));
//        create object of select class with webelement object as an input
        Select s=new Select(colors);
        s.selectByValue("yellow");
        s.selectByVisibleText("Blue");
        s.selectByIndex(5);
        s.selectByIndex(0);

        Thread.sleep(2000);
        s.deselectByIndex(3);
        s.deselectByIndex(5);
        s.deselectByIndex(1);
    }
}
