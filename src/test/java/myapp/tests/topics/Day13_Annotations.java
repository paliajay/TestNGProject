package myapp.tests.topics;

import myapp.pages.OrangeHRMLoginPage;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.testng.TestNG;
import org.testng.annotations.*;

public class Day13_Annotations {
    /*
        @Test : creates test case
        @Before and @After : there are 5 Before and 5 After annotations
        Running Hierarchy : suite > test > group > class > method
        @Ignore : Skips / Ignores the test cases
        @Test(enable=false) : disables the test cases
        @Test(priority=priority number) : prioritizes test cases - means it will work before default
        priorities. Because default priority is 0. If you make the priority less it will work first.
        By default, TestNG runs in alphabetical order-NOT FROM TOP TO BOTTOM
        Default priority(is no priority is specified) = 0.
        So order with priorities is always starts form the smallest priority number

        System.err.println("Test2"); --> err.println instead of out.println will colour the printed
        line
        @BeforeSuite runs before all tests in this suite.
        @BeforeTest runs before any test method belonging to the classes
        @BeforeGroups runs before grups
        @BeforeClass runs before the first test method in the current class
        @BeforeMethod runs before EACH test method.
     */


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method...");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class...");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before groups...");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test...");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite...");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method...");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class...");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("After groups...");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test...");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite...");
    }

    @Test(priority = 2, groups = "minor-regression-1")
    public void test1(){
        System.out.println("Test1");
    }

    @Test(enabled = false) //disabling
    public void test2(){
        System.out.println("Test2");
    }

    @Test(priority = 1)
    public void test3(){
        System.out.println("Test3");
    }

    @Test (groups = "Lion")
    public void test4(){
        System.out.println("Test4");
    }

    @Test(groups = "minor-regression-1")
    public void test5(){
        System.out.println("Test5");
    }

    @Test @Ignore //igroing
    public void test6(){
        System.out.println("Test5");
    }
}
