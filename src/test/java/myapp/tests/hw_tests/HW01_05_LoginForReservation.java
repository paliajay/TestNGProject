package myapp.tests.hw_tests;

import myapp.pageshw.RentalCarHomePage;
import myapp.pageshw.RentalCarLoginPage;
import myapp.utilities.*;
import org.testng.annotations.Test;

public class HW01_05_LoginForReservation {
    /*
        Name: Require user to login for reservation
        URL: https://www.bluerentalcars.com/
        Description:
            User should see a message when user tries to book a car while not logged in
        Acceptance Criteria:
            As customer, I should be able to see error message, when I try to book a car
            while not logged in
        Message: Please first login
        Given user is on the login page
        And tries to book a car
        And click continue reservation
        Then user see the warning message: Please first login
     */

    RentalCarHomePage rentalCarHomePage;

    @Test
    public void loginForReservation(){
        //Get the URL https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcars_url"));
        //Create rental home page and login object
        rentalCarHomePage = new RentalCarHomePage();
        //Select a car from the dropdown list
        BrowserUtils.selectDropdownByValue(rentalCarHomePage.carListDropDown, "Audi Q8");
//        BrowserUtils.sendKeysWithTimeout(rentalCarHomePage.pickUpLocation, "New Jersey Washington", 5);
//        BrowserUtils.sendKeysWithTimeout(rentalCarHomePage.dropOffLocation, "New Jersey Wallington", 5);
//BrowserUtils.sendKeysWithTimeout(rentalCarHomePage.cityPicker, "Iowa Washington", 1);
       // BrowserUtils.sendKeysWithTimeoutClick(rentalCarHomePage.cityPicker, "Iowa Washington");
        //JSUtils.locateElementByJS()
    }
}
