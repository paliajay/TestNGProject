package myapp.practices;

import myapp.pages.RequestFormPage;
import myapp.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Form_Addition {
        /*
           Given
                Go to url : https://phptravels.com/demo/
           When
                Fill the form
           And
                Click on 'SUBMIT'
           Then
                Assert that the form has been sent
    */

    @Test
    public void test01() throws InterruptedException {

//        Go to url : https://phptravels.com/demo/
        Driver.getDriver().get("https://phptravels.com/demo/");

//        Fill the form
        RequestFormPage requestFormPage = new RequestFormPage();
        requestFormPage.first_name.sendKeys("John");
        requestFormPage.last_name.sendKeys("Doe");
        requestFormPage.business_name.sendKeys("QA");
        requestFormPage.email.sendKeys("john@doe.com");

        //Handle the math result
        Thread.sleep(1000);//For the synchronization issue
        int number1 = Integer.parseInt(requestFormPage.numb1.getText());

        Thread.sleep(1000);//For the synchronization issue
        int number2 = Integer.parseInt(requestFormPage.numb2.getText());

        String result = String.valueOf(number1 + number2);
        requestFormPage.resultInput.sendKeys(result);

//        Click on 'SUBMIT'
        requestFormPage.submitButton.click();

//        Assert that the form has been sent
        Thread.sleep(1000);//For the synchronization issue
        String successMessage = requestFormPage.successMessage.getText();
        assertTrue(successMessage.contains("We have sent your demo"));

        Driver.closeDriver();

    }
}
