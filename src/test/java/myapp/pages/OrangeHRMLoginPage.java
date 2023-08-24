package myapp.pages;
import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
    /*
        1. Constructor with PageFactory.initElements(driver,this); to instantiate the element
            (done for each class only once)
        2. Locate elements using @FindBy annotation

        This page classes are also known as 'PAGE REPOSITORY' or 'OBJECT REPOSITORY'
     */

    public OrangeHRMLoginPage(){
        //instantiate the page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // WebElement username = Driver.getDriver().findElement(By.name("username")); //is now -->
    // @FindBy(name = "username") = public WebElement username; ==> MUST be public to be visible

    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
}