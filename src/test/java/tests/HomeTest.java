package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

import static org.testng.Assert.assertTrue;

public class HomeTest extends BaseTest {
    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeClass()
    public void setUpPage() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginButtonIsDisplayed() {
        homePage.productsTitleIsDisplayed();
        homePage.goToLoginPage();
        assertTrue(loginPage.loginBtnIsDisplayed(), "Login button should be displayed on launch");
    }
}
