package myapp.tests.listeners;
import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

//@Listeners(myapp.utilities.ListenersUtil.class)
public class Day17_Listeners1 {
    /*
        We can link Test Class and ListenerUtils in 2 ways:
         a. @Listeners annotation in the Test Class
            -> @Listeners(myapp.utilities.ListenersUtil.class)
         b. <listeners> tag in the xml file (recommended)
  */
    @Test
    public void test1(){
        System.out.println("PASS");
        assertTrue(true);
    }
    @Test
    public void test2(){
        System.out.println("FAIL");
        assertTrue(false);
    }
    @Test
    public void test3(){
        System.out.println("SKIPPED");
        throw new SkipException("Skipping On Purpose");
    }
    @Test
    public void test4(){
        System.out.println("FAIL - THROW EXCEPTION");
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().findElement(By.id("wrong-id"));//throws no such element exception
    }
}
