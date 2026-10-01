package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SwagLabLoginTest
{
    static void main(String[] args) throws InterruptedException
    {
        TC1_LoginToAPP_With_ValidDetails();
        TC2_LoginToAPP_With_InValidDetails();

    }

    public static void TC1_LoginToAPP_With_ValidDetails() throws InterruptedException
    {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        SwagLabLoginPage login =new SwagLabLoginPage(driver);
        login.enterUN("standard_user");
        Thread.sleep(2000);
        login.enterPWD("secret_sauce");
        Thread.sleep(2000);
        login.clickOnLoginBtn();
        Thread.sleep(2000);
        
        SwagLabHomePage home=new SwagLabHomePage(driver);
        String actLogoText = home.verifyLogoText();
        String expLogoText="Swag Labs";

        if (actLogoText.equals(expLogoText))
        {
            System.out.println("TC Pass");
        }
        else
        {
            System.out.println("TC Fail");
        }
        Thread.sleep(2000);
        driver.quit();
    }

    public static void TC2_LoginToAPP_With_InValidDetails() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        SwagLabLoginPage login=new SwagLabLoginPage(driver);
        login.enterUN("abc");
        Thread.sleep(2000);
        login.enterPWD("xyz");
        Thread.sleep(2000);
        login.clickOnLoginBtn();
        Thread.sleep(2000);

        String actloginfailederrorMsg = login.getErrorMsg();
        String exploginfailederrorMsg="Epic sadface: Username and password do not match any user in this service";
        if (actloginfailederrorMsg.equals(exploginfailederrorMsg))
        {
            System.out.println("TC pass");
        }
        else
        {
            System.out.println("TC fail");
        }

    }


}
