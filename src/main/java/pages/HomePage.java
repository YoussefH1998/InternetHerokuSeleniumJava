package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    By FormAuthentication= By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickonLoginPage(){
        driver.findElement(FormAuthentication).click();
        return new LoginPage(driver);
    }
}
