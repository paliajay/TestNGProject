package myapp.pageshw;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalCarLoginPage {
    //Initializing the page constructor with PageFactory.initElements()
    public RentalCarLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "formBasicEmail")
    public WebElement emailAddress;
    @FindBy(id = "formBasicPassword")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@role='alert']/div")
    public WebElement errorPopup;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement invalidEmailFormatMessage;
}
