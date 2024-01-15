package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void successfulLogin(){
        LoginPage loginPage =homePage.clickonLoginPage();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage=loginPage.clickOnSubmitButton();
        String text=securePage.getAlertText();
        assertTrue(text.contains("You logged into a secure area!"));


    }
}
