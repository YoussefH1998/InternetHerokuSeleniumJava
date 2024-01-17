package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    WebDriver driver;
    By textBox= By.id("target");
    By result= By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterText(String string){
        driver.findElement(textBox).sendKeys(string);
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
