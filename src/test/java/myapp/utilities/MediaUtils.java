package myapp.utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MediaUtils {

    //------------- Screenshot of Entire Page --------------------
    public static void takeScreenshotOfTheEntirePage() throws IOException {
    //        1. TakeScreenShot class with getScreenShotAs method to capture the screenshot
        File image = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
    //        2. Create a path to save the image
    //        Create a date for giving dynamic name otherwise the screenshots overrides
        String now = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());//getting local date in this format
    //                     CURRENT PROJECT FOLDER         foldername   subfoldername imagename
        String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+now+"image.png";
    //        3. Save the image in the path as a file
        FileUtils.copyFile(image,new File(path));
    //        FileUtils.copyFile(FILE,FILE PATH); COPY FILE TO THAT FILE PATH
    }

    //----------------- Screenshot of Specific Elements ------------------

    //this method accepts an elements and saves the screenshot of that element in the test-output folder
    public static void takeScreenshotOfThisElement(WebElement element) throws IOException {
        File image = element.getScreenshotAs(OutputType.FILE);
        String now = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/ElementScreenshot/"+now+"image.png";
        FileUtils.copyFile(image,new File(path));
    }

    //------------------ Screenshot of Image and Returns Path of That Image -------------
      //  RETURN TYPE : static String
     // return new File(path).getAbsolutePath();
    public static String takeScreenshotOfTheEntirePageAsString() {
        //        1. TakeScreenShot class with getScreenShotAs method to capture the screenshot
        File image = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        //        2. Create a path to save the image
        //        Create a date for giving dynamic name otherwise the screenshots overrides
        String now = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());//getting local date in this format
        //                     CURRENT PROJECT FOLDER    foldername   subfoldername imagename
        String path = System.getProperty("user.dir")+"/test-output/Reports/Screenshots/"+now+"image.png";
        //        3. Save the image in the path as a file
        try {
            FileUtils.copyFile(image,new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //        GETTING THE ABSOLUTE PATH OF THE IMAGE PATH THAT IS STRING
        return new File(path).getAbsolutePath();
    }
}