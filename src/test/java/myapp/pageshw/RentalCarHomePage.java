package myapp.pageshw;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalCarHomePage {

    //Initializing the page constructor with PageFactory.initElements()
    public RentalCarHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Login")
    public WebElement login;
    @FindBy(name = "car")
    public WebElement carListDropDown;
    @FindBy(name = "pickUpLocation")
    public WebElement pickUpLocation;
    @FindBy(name = "dropOfLocation")
    public WebElement dropOffLocation;
    @FindBy(name = "pickUpDate")
    public WebElement pickUpDate;
    @FindBy(name = "pickUpTime")
    public WebElement pickUpTime;
    @FindBy(name = "dropOffDate")
    public WebElement dropOffDate;
    @FindBy(name = "dropOffTime")
    public WebElement dropOffTime;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueReservationButton;
}
