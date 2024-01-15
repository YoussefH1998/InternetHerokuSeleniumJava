package login;

import base.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
     LoginPage loginPage;
     @BeforeClass
     public void loginTestSetUp(){
         loginPage =homePage.clickonLoginPage();
     }
    @Test
    public void invalidUsername(){
        //user enters invalid username and valid password

        loginPage.setUserName("Dan");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickOnSubmitButton();
        String warningText= loginPage.getWarningText();
        assertTrue(warningText.contains("Your username is invalid!"));
    }
    @Test
    public void invalidPassword(){
       // LoginPage loginPage =homePage.clickonLoginPage();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("1234");
        loginPage.clickOnSubmitButton();
        String warningText= loginPage.getWarningText();
        assertTrue(warningText.contains("Your password is invalid!"));
    }

    @Test
    public void successfulLogin(){
       // LoginPage loginPage =homePage.clickonLoginPage();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage=loginPage.clickOnSubmitButton();
        String text=securePage.getAlertText();
        assertTrue(text.contains("You logged into a secure area!"));
    }
}
