package myapp.tests.smoketest.excelatautomation;
import myapp.pages.RentalHomePage;
import myapp.pages.RentalLoginPage;
import myapp.utilities.BrowserUtils;
import myapp.utilities.Driver;
import myapp.utilities.ExcelUtils;
import myapp.utilities.WaitUtils;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Map;

public class Day16_ExcelAutomation {
    ExcelUtils excelUtils;
    List<Map<String,String>> dataList;
    RentalLoginPage rentalLoginPage;
    RentalHomePage rentalHomePage;

    @Test
    public void appLoginTest(){
        String path = "./resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        excelUtils= new ExcelUtils(path,sheetName);
        dataList=excelUtils.getDataList();
        System.out.println(dataList);
        for (Map<String ,String> eachData : dataList){
            Driver.getDriver().get("https://www.bluerentalcars.com/");
            //instantiate rental home page and login page
            rentalHomePage= new RentalHomePage();
            rentalLoginPage=new RentalLoginPage();
            rentalHomePage.loginLink.click();
            WaitUtils.waitFor(2);
            System.out.println(eachData);
            rentalLoginPage.username.sendKeys(eachData.get("username"));
            rentalLoginPage.password.sendKeys(eachData.get("password"));
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
}