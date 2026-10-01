package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
//    1. Data member/Variable should be declared globally with access level private using @findBy Annotation

       @FindBy(xpath = "//input[@id='user-name']") private WebElement un;  //private WebElement un=driver.findElement(By.xpath(""))
       @FindBy(xpath = "//input[@id='password']") private WebElement pwd;  //private WebElement pwd=driver.findElement(By.xpath(""))
       @FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;  //private WebElement loginBtn=driver.findElement(By.xpath(""))
       @FindBy(xpath = "//h3[text()='Epic sadface: Username and password do not match any user in this service']") private WebElement errorMsg;
//    2. Initialize within a constructor with access level public using pageFactory class

       public SwagLabLoginPage(WebDriver driver)
       {
              PageFactory.initElements(driver, this);
       }

//    3. Utilize within a method with access level public

       public void enterUN(String UNValue)
       {
              un.sendKeys(UNValue);
       }

       public void enterPWD(String PWDValue)
       {
              pwd.sendKeys(PWDValue);
       }

       public void clickOnLoginBtn()
       {
              loginBtn.click();
       }

       public String getErrorMsg()
       {
           String acterrorMsg = errorMsg.getText();
           return acterrorMsg;
       }





}
