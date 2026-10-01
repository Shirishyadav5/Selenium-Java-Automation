package Capture_Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex2_Capture_Screenshot_of_complete_Webpage
{
    static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("D:\\Automation JAVA\\Code\\Screenshot\\webpage.png");

        FileHandler.copy(src,dest);

    }
}
