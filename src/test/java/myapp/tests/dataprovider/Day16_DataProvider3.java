package myapp.tests.dataprovider;
import myapp.pages.RentalHomePage;
import myapp.pages.RentalLoginPage;
import myapp.utilities.BrowserUtils;
import myapp.utilities.DataProviderUtils;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.testng.annotations.Test;

public class Day16_DataProvider3 {
    RentalHomePage rentalHomePage;
    RentalLoginPage rentalLoginPage;

    @Test(dataProvider = "excelCustomerCredentials",dataProviderClass = DataProviderUtils.class )
    public void customerLogin(String userName,String password){
        Driver.getDriver().get("https://www.bluerentalcars.com/");
        rentalHomePage= new RentalHomePage();
        rentalLoginPage=new RentalLoginPage();
        rentalHomePage.loginLink.click();
        WaitUtils.waitFor(2);
        rentalLoginPage.username.sendKeys(userName);
        rentalLoginPage.password.sendKeys(password);
        WaitUtils.waitFor(2);
        rentalLoginPage.loginButton.click();
        WaitUtils.waitFor(2);
        BrowserUtils.verifyElementDisplayed(rentalHomePage.userID);
        //        click on user id
        rentalHomePage.userID.click();
        WaitUtils.waitFor(2);
        //        click on logout
        rentalHomePage.logOut.click();
        WaitUtils.waitFor(2);
        //        click on OK
        rentalHomePage.OK.click();
        WaitUtils.waitFor(2);
        //        then verify logout is successful
        BrowserUtils.verifyElementDisplayed(rentalHomePage.loginLink);//OR
        BrowserUtils.verifyElementNotDisplayed(rentalHomePage.OK);
        WaitUtils.waitFor(2);
        Driver.closeDriver();
    }
}