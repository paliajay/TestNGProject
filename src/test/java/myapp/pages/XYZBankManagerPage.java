package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class XYZBankManagerPage {

    public XYZBankManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    public WebElement addCustomerButton;

    @FindBy(xpath = "//input[@ng-model='fName']")
    public WebElement firstnameInput;

    @FindBy(xpath = "//input[@ng-model='lName']")
    public WebElement lastnameInput;

    @FindBy(xpath = "//input[@ng-model='postCd']")
    public WebElement postCodeInput;

    @FindBy(xpath = "//button[.='Add Customer']")
    public WebElement addCustomerSubmitButton;

    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    public WebElement openAccountButton;

    @FindBy(id = "userSelect")
    public WebElement customerDropDown;

    @FindBy(id = "currency")
    public WebElement currencyDropDown;

    @FindBy(xpath = "//button[.='Process']")
    public WebElement processButton;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    public WebElement customersButton;

    @FindBy(xpath = "//tbody/tr/td[4]")
    public List<WebElement> accountNumberList;

    @FindBy(xpath = "//button[.='Delete']")
    public List<WebElement> deleteButtonsList;
}
