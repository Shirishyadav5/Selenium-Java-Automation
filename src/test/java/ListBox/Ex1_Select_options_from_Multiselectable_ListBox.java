package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_Select_options_from_Multiselectable_ListBox
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

//        Identify listBox
        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));

//        create object of select class with webelement argument
        Select s=new Select(colors);
//        call select class methods
        s.selectByIndex(1);
        s.selectByValue("red");
        s.selectByVisibleText("Yellow");
        s.selectByContainsVisibleText("Gr");




    }
}
