package myapp.tests.hw_tests;

import myapp.pageshw.RentalCarHomePage;
import myapp.pageshw.RentalCarLoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class HW01_03_Bad_Credentials {
    /*
        Name: US413123_Bad_Credentials
        URL: https://www.bluerentalcars.com/
        Login screen error messages
        Description:
            User should see error message when user tries to login with incorrect credentials
        Acceptance Criteria:
            As admin or customer, I should be able to see error message,
            when I provide a correct email address BUT incorrect password in a pop up window
        Admin email: jack1@gmail.com
        Admin password: 12345
        Error Message: Bad credentials
     */

    @Test
    public void badCredentialsTest(){
        //Get the URL from configuration.properties
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcars_url"));
        //Create rental car page and login objects
        RentalCarHomePage rentalCarHomePage = new RentalCarHomePage();
        RentalCarLoginPage rentalCarLoginPage = new RentalCarLoginPage();
        //Click on the Login button
        rentalCarHomePage.login.click();
        //Enter correct email and incorrect password
        rentalCarLoginPage.emailAddress.sendKeys("jack1@gmail.com");
        rentalCarLoginPage.password.sendKeys("1234");
        rentalCarLoginPage.loginButton.click();
        //Verify this error message: Bad credentials
        WaitUtils.waitForVisibility(rentalCarLoginPage.errorPopup, 5);
        assertEquals("Bad credentials", rentalCarLoginPage.errorPopup.getText());
    }
}
