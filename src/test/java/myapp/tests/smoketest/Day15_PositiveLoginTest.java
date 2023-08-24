package myapp.tests.smoketest;
import myapp.pages.RentalHomePage;
import myapp.pages.RentalLoginPage;
import myapp.utilities.*;
import org.testng.annotations.Test;

public class Day15_PositiveLoginTest {
    @Test
    public void US100201_Admin_Login(){
    //        As admin, I should be able to log in the application
    //        https://www.bluerentalcars.com/
    //        Admin email: jack1@gmail.com
    //        Admin password: 12345

      LoggerUtils.info("Admin Login test begins...");
      ExtentReportUtils.createTestReport("Admin Login Test", "smoke test");
    // TEST CASE:
    //go to login page
      ExtentReportUtils.pass("Starting the test case...");
        Driver.getDriver().get("https://www.bluerentalcars.com/");
    //click on login link
        RentalHomePage rentalHomePage = new RentalHomePage();
        ExtentReportUtils.pass("Navigating to the login page...");
        rentalHomePage.loginLink.click();
        WaitUtils.waitFor(2);
    //enter email, pass, click login button
        RentalLoginPage rentalLoginPage = new RentalLoginPage();
        ExtentReportUtils.pass("Entering the admin credentials...");
        rentalLoginPage.username.sendKeys("jack1@gmail.com");
        rentalLoginPage.password.sendKeys("12345");
        ExtentReportUtils.passAndCaptureScreenshot("Credentials entered successfully...clicking on login button");
        rentalLoginPage.loginButton.click();
        WaitUtils.waitFor(2);
    //then verify login is successful
    //Assert.assertTrue(rentalHomePage.userID.isDisplayed());ALTERNATIVELY
        ExtentReportUtils.passAndCaptureScreenshot("login is successful with admin ID: "+rentalHomePage.userID.getText());
        BrowserUtils.verifyElementDisplayed(rentalHomePage.userID);
        ExtentReportUtils.pass("Logging out...");
    //click on user id
        rentalHomePage.userID.click();
        WaitUtils.waitFor(2);
    //click on logout
        rentalHomePage.logOut.click();
        WaitUtils.waitFor(2);
    //click on OK
        rentalHomePage.OK.click();
        WaitUtils.waitFor(2);
        ExtentReportUtils.passAndCaptureScreenshot("Logged out successfully...");
    //then verify logout is successful
        BrowserUtils.verifyElementDisplayed(rentalHomePage.loginLink);//OR
        BrowserUtils.verifyElementNotDisplayed(rentalHomePage.OK);
        WaitUtils.waitFor(2);
        Driver.closeDriver();
      ExtentReportUtils.pass("Test is completed successfully...");
      ExtentReportUtils.flush();
      LoggerUtils.info("Admin Login test successfully completed...");
    }
}