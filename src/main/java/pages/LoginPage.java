package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By userName= By.id("username");
    private By Password=By.id("password");
    private By loginButton=By.cssSelector("button[type='submit']");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }
    public void setPassword (String password){
        driver.findElement(Password).sendKeys(password);
    }
    public SecurePage clickOnSubmitButton(){
        driver.findElement(loginButton).click();
        return new SecurePage(driver);
    }
}
