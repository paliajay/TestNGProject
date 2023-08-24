package myapp.tests.hw_tests;

import myapp.pageshw.RentalCarHomePage;
import myapp.pageshw.RentalCarLoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HW01_04_LoginScreenError {
    /*
        Name: Login screen error messages
        URL: https://www.bluerentalcars.com/
        Description:
            User should see error message when an invalid email is entered
        Acceptance Criteria:
            As admin or customer, I should be able to see error message, when I do not provide
            a complete valid email address in email address box
        Error Message: email must be a valid email
        Invalid Email Format: aldfa@ws.
        Password: 1234
        When I enter a valid email domain, then I should not see the error message
        https://email-verify.my-addr.com/list-of-most-popular-email-domains.php
        Collapse
     */
    RentalCarHomePage rentalCarHomePage;
    RentalCarLoginPage rentalCarLoginPage;

    @Test
    public void invalidEmailFormatTest(){
        //Get the URL https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcars_url"));
        //Create rental home page and login object
        rentalCarHomePage = new RentalCarHomePage();
        rentalCarLoginPage = new RentalCarLoginPage();
        //Click on Login
        rentalCarHomePage.login.click();
        //Enter invalid email
        rentalCarLoginPage.emailAddress.sendKeys("aldfa@ws.");
        //Verify the error message: email must be a valid email
        assertEquals("email must be a valid email", rentalCarLoginPage.invalidEmailFormatMessage.getText());
    }
}
