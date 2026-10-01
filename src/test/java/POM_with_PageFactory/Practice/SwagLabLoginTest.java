package POM_with_PageFactory.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SwagLabLoginTest
{
    static void main(String[] args) throws InterruptedException {
//        TC1_login_withvalicreds();
        TC2_login_withvalicreds_and_Logout();
    }

    public static void TC1_login_withvalicreds() throws InterruptedException
    {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        SwagLabLoginPage login=new SwagLabLoginPage(driver);
        login.enterUN("standard_user");
        Thread.sleep(2000);
        login.enterPWD("secret_sauce");
        Thread.sleep(2000);
        login.clickonloginBtn();
        Thread.sleep(2000);

    }
    public static void TC2_login_withvalicreds_and_Logout() throws InterruptedException
    {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        SwagLabLoginPage login=new SwagLabLoginPage(driver);
        login.enterUN("standard_user");
        Thread.sleep(2000);
        login.enterPWD("secret_sauce");
        Thread.sleep(2000);
        login.clickonloginBtn();
        Thread.sleep(2000);

        SwagLabHomePage home=new SwagLabHomePage(driver);
        home.clickOnMenu();
        Thread.sleep(2000);
        home.clickOnLogout();
        Thread.sleep(2000);

        String actlogoText = login.verifyLogoText();
        String expLogoText = "Swag Labs";
        if (actlogoText.equals(expLogoText))
        {
            System.out.println(" you Logout successfully and you On Login page");
        }
        else
        {
            System.out.println("you wouldn't logout");
        }
    }
}
