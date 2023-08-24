package myapp.utilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtils {
    //ACTIONS_RIGHT CLICK
    public static void rightClickOnElementActions(WebElement element) {
        new Actions(Driver.getDriver()).contextClick(element).perform();
    }
    //ACTIONS_DOUBLE CLICK
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }
    //ACTIONS_HOVER_OVER
    public static void hoverOverOnElementActions(WebElement element) {
        //        Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).moveToElement(element).perform();
    }
    //ACTIONS_SCROLL_DOWN
    public static void scrollDownActions() {
        //        Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();
    }
    //ACTIONS_SCROLL_UP
    public static void scrollUpActions() {
        //Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_UP).perform();
    }
    //ACTIONS_SCROLL_RIGHT
    public static void scrollRightActions(){
        new Actions(Driver.getDriver()).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).perform();
    }
    //ACTIONS_SCROLL_LEFT
    public static void scrollLeftActions(){
        new Actions(Driver.getDriver()).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).perform();
    }
    //ACTIONS_DRAG_AND_DROP
    public static void dragAndDropActions(WebElement source, WebElement target) {
        //Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).dragAndDrop(source,target).perform();
    }
    //ACTIONS_DRAG_AND_DROP_BY
    public static void dragAndDropActions(WebElement source, int x, int y) {
        //Actions actions = new Actions(driver);
        new Actions(Driver.getDriver()).dragAndDropBy(source,x,y).perform();
    }
}