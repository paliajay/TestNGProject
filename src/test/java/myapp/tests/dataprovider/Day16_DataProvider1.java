package myapp.tests.dataprovider;
import myapp.utilities.DataProviderUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day16_DataProvider1 {
    //    1. Data source
    //@DataProvide: the advantage is you don't need to use a loop
    @DataProvider
    public Object[][] customerData(){
        Object [][] customerInfo={
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}
        };
        return customerInfo;
    }

    @Test(dataProvider = "customerData", groups = "minor-regression-1")
    public void test1(String username, String password){
        System.out.println("Username : "+username+" | Password : "+password);
    }

    //    2. Data source with using custom name
    @DataProvider(name = "electricCars")
    public Object[][] carInventory(){
        Object[][] carList = {
                {"tesla"},
                {"lucid"},
                {"nio"},
                {"bmw"},
                {"rivian"},
                {"mercedes"}
        };
        return carList;
    }
    @Test(dataProvider = "electricCars", groups = "minor-regression-1" )
    public void test2(String car){
        System.out.println(car);
    }

//    3. Data source using DataProviderUtils class
//    when we get the data from other classes with data provider, give the class name as well
    @Test(dataProvider = "customerCredentials",dataProviderClass = DataProviderUtils.class)
    public void test3(String user,String pass){
        System.out.println(user + " | "+pass);
    }
}
