package myapp.tests.topics;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.testng.annotations.Test;

public class Day14_ConfigPropertiesTest {

    @Test
    public void configPropertiesTest(){
        https://www.amazon.com ---->>>> ConfigReader.getProperty("amazon_url")
//        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        String amazonTitle = Driver.getDriver().getTitle();
        String amazonURL = Driver.getDriver().getCurrentUrl();
        System.out.println("Title : "+amazonTitle);
        System.out.println("URL : "+amazonURL);
        Driver.closeDriver();
    }
}