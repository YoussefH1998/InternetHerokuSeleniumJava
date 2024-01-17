package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    WebDriver driver;
    By slider= By.cssSelector("input[type='range']");
    By sliderValue=By.id("range");
    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }
    public void MoveSliderRight(int clicks){
        for (int i=0;i<clicks;i++)
            driver.findElement(slider).sendKeys(Keys.RIGHT);
    }
    public void MoveSliderLeft(int clicks){
        for (int i=0;i<clicks;i++)
            driver.findElement(slider).sendKeys(Keys.LEFT);
    }
    public int getCurrentValue(){
           return Integer.parseInt(driver.findElement(sliderValue).getText());
    }
}
