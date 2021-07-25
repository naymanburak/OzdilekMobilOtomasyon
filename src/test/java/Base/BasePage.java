package Base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage extends BaseTest{

    private static Logger logger = LogManager.getLogger(BasePage.class);

    WebDriverWait wait = new WebDriverWait(appiumDriver, 60);

    public void waitForSecond(int x) throws InterruptedException {
        Thread.sleep(1000 * x);
        logger.info(x +"saniye beklenildi");
    }

    public void clickById(By id) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(id)).click();
        logger.info(id + "Elemente tıklanildi");
    }

    public void clickByXpath(By xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).click();
        logger.info(xpath+ "Elemente tıklanildi");
    }

    public void check(String check, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(check)));
        Assert.assertEquals(text, appiumDriver.findElementById(check).getText());
        logger.info("Check page");
    }

    public void checkXpath(String check, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(check)));
        Assert.assertEquals(text, appiumDriver.findElementByXPath(check).getText());
        logger.info("Check page");
    }

    public void swipe(int start_x, int start_y, int end_x, int end_y) throws InterruptedException {
        TouchAction action = new TouchAction(appiumDriver);
        for (int a = 0; a <= 50; a++) {
            action.press(new PointOption().withCoordinates(start_x, start_y)).moveTo(new PointOption().withCoordinates(end_x, end_y)).release().perform();
        }
        logger.info("swipe islemi tamamlandi");
    }
}
