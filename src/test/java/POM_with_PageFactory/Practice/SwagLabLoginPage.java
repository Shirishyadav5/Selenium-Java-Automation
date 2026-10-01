package POM_with_PageFactory.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{

//    Data member should declare with globally access level private using @FindBy Annotation
    @FindBy(xpath = "//input[@id='user-name']") private WebElement un;
    @FindBy(xpath = "//input[@id='password']") private WebElement pwd;
    @FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
    @FindBy(xpath = "//div[text()='Swag Labs']") private WebElement logoText;

//    Initialize within the constructor with access level public
    public SwagLabLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
//    utilize within the method with access level public
    public void enterUN(String UNValue)
    {
        un.sendKeys(UNValue);
    }
    public void enterPWD(String PWDvalue)
    {
        pwd.sendKeys(PWDvalue);
    }
    public void clickonloginBtn()
    {
        loginBtn.click();
    }
    public String verifyLogoText()
    {
        String LogoText = logoText.getText();
        return LogoText;
    }













}
