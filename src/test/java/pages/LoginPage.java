package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By getLoginBtn = AppiumBy.id("loginBtn");

    public boolean loginBtnIsDisplayed() {
        WebElement loginBtn = driver.findElement(getLoginBtn);
        return loginBtn.isDisplayed();
    }

}
