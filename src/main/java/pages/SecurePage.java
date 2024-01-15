package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    private WebDriver driver;
    private By alertText= By.xpath("//div[@id='flash']");
    SecurePage(WebDriver driver){
        this.driver=driver;
    }
    public String getAlertText(){
        return driver.findElement(alertText).getText();
    }
}
