package myapp.tests.hw_tests;

import myapp.pageshw.RentalCarHomePage;
import myapp.pageshw.RentalCarLoginPage;
import myapp.utilities.*;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class HW01_02_NegativeLogin {
    /*
        URL: https://www.bluerentalcars.com/
        Name:  US100208_Negative_Login
        Description:  User should not be able login with incorrect credentials
        Acceptance Criteria:
            As customer, I should not be able to log in the application with
            Incorrect username and incorrect password
        Customer email: fake@bluerentalcars.com
        Customer password: fakepass
        Error: User with email fake@bluerentalcars.com not found
     */

    @Test
        public void negativeLoginTest(){
        //Get URL: https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcars_url"));
        WaitUtils.waitFor(2);
        //Click on the login button
        RentalCarHomePage rentalCarHomePage = new RentalCarHomePage();
        rentalCarHomePage.login.click();

        //Enter email, password and click on login button
        RentalCarLoginPage rentalCarLoginPage = new RentalCarLoginPage();
        rentalCarLoginPage.emailAddress.sendKeys("fake@bluerentalcars.com");
        rentalCarLoginPage.password.sendKeys("fakepass");
        rentalCarLoginPage.loginButton.click();

        //Verify this error message: User with email fake@bluerentalcars.com not found
        //Use explicit wait to handle JS popup
        WaitUtils.waitForVisibility(rentalCarLoginPage.errorPopup, 5);
        assertEquals("User with email fake@bluerentalcars.com not found", rentalCarLoginPage.errorPopup.getText());

        //Alternatively: take a screenshot of the error message
//        WaitUtils.waitFor(1);
//        MediaUtils.takeScreenshotOfTheEntirePageAsString();
    }
}
