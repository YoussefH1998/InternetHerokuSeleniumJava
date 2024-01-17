package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    WebDriver driver;
    By jsAlert= By.xpath("//button[contains(text(),'Click for JS Alert')]");
    By jsConfrim= By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    By jsPrompt= By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    By result= By.id("result");


    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void getAlertText(){
        driver.switchTo().alert().dismiss();
    }
    public void enterAlertText(String string){
        driver.switchTo().alert().sendKeys(string);
    }

    public void clickOnFirstAlert(){
        driver.findElement(jsAlert).click();
    }
    public void clickOnSecondAlert(){
        driver.findElement(jsConfrim).click();
    }
    public void clickOnThirdAlert(){
        driver.findElement(jsPrompt).click();
    }
    public String getResultText(){
        return driver.findElement(result).getText();
    }
}
