package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage
{
//    1. Data member/variable should be declared globally with access level private using @findBy Annotation
   @FindBy(xpath = "//div[text()='Swag Labs']") private WebElement logoText;  //private WebElement logoText=driver.FindElement(By.xpath(""));



//  2. Initialize within the constructor with access level public using pagefactory class

    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

//  3. Utilize within the method with access level public

    public String verifyLogoText()
    {
        String actLogoText = logoText.getText();
        return actLogoText;
    }

}