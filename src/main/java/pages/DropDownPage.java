package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    WebDriver driver;
    By dropDown= By.id("dropdown");
    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    public void selectByText(String option){
        findDropDownList().selectByVisibleText(option);
    }
    public List< String> getAllSelectedOptions(){
        List<WebElement> list =findDropDownList().getAllSelectedOptions();
        return list.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDropDownList(){
        return new Select(driver.findElement(dropDown));
    }
}
