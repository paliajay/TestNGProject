package myapp.tests.topics;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Day14_Assertions {

    //HARD ASSERTION : if hard assertion fails, then STOP execution for that test case
    //Recommended: because you don't need to wait till all test cases are executed
    @Test
    public void hardAssertion(){
        System.out.println("line 8");
        assertTrue(true);//PASS SO CONTINUE
        System.out.println("line 12");
        assertEquals("apple","orange");//FAILS SO STOP
        System.out.println("line 15");
    }

    //SOFT ASSERTION : if soft assertion fails, then CONTINUE execution for that test case
    @Test
    public void softAssertion(){
        System.out.println("line 19");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true);//PASS SO CONTINUE
        System.out.println("line 23");
        softAssert.assertEquals("apple","orange");//FAIL SO CONTINUE
        System.out.println("line 25");
        softAssert.assertAll("Test Assertion Completed");//assertAll MUST BE USED FOR CORRECT TEST RESULT
        //otherwise you will get false positive, meaning all tests will be shown as passed
    }

    @Test
    public void javaAssertion(){
        /*
            java assertions are hard assertions. if assert fails then STOPS
            We should prefer to use TestNG assertions
            if java assertion fails, then STOP execution for that test case
            you can write the same syntax that you write inside if() to do the test
         */
        System.out.println("line 35");
        assert 3<5; // if(...) assertion TRUE then continue, otherwise throw java.lang.AssertionError
        System.out.println("line 37");
        assert "apple"=="apple";
        assert "apple".toLowerCase().contains("e");
    }
}