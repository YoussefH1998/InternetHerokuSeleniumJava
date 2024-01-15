package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickonLoginPage(){
        clickOnLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickonDropDownPage(){
        clickOnLink("Dropdown");
        return new DropDownPage(driver);
    }
    public void clickOnLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
}
