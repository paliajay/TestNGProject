package myapp.pages;
import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalLoginPage {
    public RentalLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //username
    @FindBy(id = "formBasicEmail")
    public WebElement username;
    //password
    @FindBy(id = "formBasicPassword")
    public WebElement password;
    //loginbutton
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
}