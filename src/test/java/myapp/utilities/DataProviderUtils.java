package myapp.utilities;
import org.testng.annotations.DataProvider;

public class DataProviderUtils {
    @DataProvider
    public Object[][] customerCredentials(){
        Object [][] customerInfo={
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}
        };
        return customerInfo;
    }

    //Getting data from EXCEL - this data will be used in the test cases
    @DataProvider
    public Object[][] excelCustomerCredentials(){
        String path = "./resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelUtils excelUtils = new ExcelUtils(path,sheetName);
        Object [][] customerInfo = excelUtils.getDataArrayWithoutFirstRow();
        return customerInfo;
    }
}