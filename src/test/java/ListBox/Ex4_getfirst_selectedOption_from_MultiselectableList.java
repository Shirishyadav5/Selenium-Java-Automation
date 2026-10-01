package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex4_getfirst_selectedOption_from_MultiselectableList
{
    static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s=new Select(colors);
        s.selectByIndex(3);
        s.selectByIndex(2);
        s.selectByIndex(1);

        String text = s.getFirstSelectedOption().getText();
        System.out.println(text );
        System.out.println("--------");

        WebElement option = s.getFirstSelectedOption();
        String text3=option.getText();
        System.out.println(text3);

        System.out.println("--------");
        System.out.println(s.getFirstSelectedOption().getText());

    }
}
