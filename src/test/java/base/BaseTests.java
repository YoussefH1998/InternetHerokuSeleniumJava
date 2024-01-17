package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import static org.testng.Assert.*;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
        assertEquals(driver.getTitle(),"The Internet");
    }

    @AfterClass
    public  void cleanup(){
        driver.quit();

    }
    public static void main(String [] args){

    }
}
