package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
    private AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By getProductsTitle = By.xpath(" //android.widget.TextView[@text='Products']");
    private By getViewMenuButton = AppiumBy.accessibilityId("View menu");
    private By getLoginMenu = By.xpath("//android.widget.TextView[@text='Log In']");

    public boolean productsTitleIsDisplayed() {
        WebElement productsTitle = driver.findElement(getProductsTitle);
        return productsTitle.isDisplayed();
    }

    public void goToLoginPage() {
        WebElement viewMenuButton = driver.findElement(getViewMenuButton);
        viewMenuButton.click();
        WebElement loginMenu = driver.findElement(getLoginMenu);
        loginMenu.click();
    }
}
