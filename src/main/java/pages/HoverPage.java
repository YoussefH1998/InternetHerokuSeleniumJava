package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver;
    By figureCaption=By.className("figcaption");
    public HoverPage(WebDriver driver){
        this.driver=driver;
    }

    public FigureCaption hoverOverFigure(int i){
        Actions actions=new Actions(driver);
        WebElement figure=driver.findElement(By.xpath("//div[@class='figure']["+i+"]"));
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figureCaption));
    }

    public class FigureCaption{
        WebElement figure;
        public FigureCaption(WebElement figure){
            this.figure=figure;
        }
        public String getFigCaptionText(){
            return figure.findElement(By.tagName("h5")).getText();
        }
        public String getFigCaptionLink(){
            return figure.findElement(By.tagName("a")).getAttribute("href");
        }

    }
}
