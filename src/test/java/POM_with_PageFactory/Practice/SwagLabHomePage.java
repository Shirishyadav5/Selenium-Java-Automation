package POM_with_PageFactory.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage
{   //data member/variable should be access level private using @FindBy annotation
    @FindBy(xpath = "//button[text()='Open Menu']") private WebElement menu;
    @FindBy(xpath = "//a[text()='Logout']") private WebElement logout;


//    2. Initialize within the constructor with access level public
    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

//    3. utilize within the method with access level public
    public void clickOnMenu()
    {
        menu.click();
    }

    public void clickOnLogout()
    {
        logout.click();
    }



}
