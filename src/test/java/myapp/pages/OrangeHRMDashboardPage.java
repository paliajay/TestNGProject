package myapp.pages;
import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMDashboardPage {
    public OrangeHRMDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
    public WebElement profile;

    @FindBy(linkText = "Logout")
    public WebElement logOut;
}