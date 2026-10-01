package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SelectOption1_From_SingleSelectableListBox
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

//        1.identify the Listbox
        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));

//        create object of select class with webelement as input
        Select s=new Select(country);

//      call select class methods
        s.selectByVisibleText("Canada");    //String text
//        s.selectByValue("uk");                //String value
//        s.selectByIndex(2);                   //int index


    }

}
