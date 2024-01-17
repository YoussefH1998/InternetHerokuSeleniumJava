package alerts;

import base.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AlertsPage;
import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {
    AlertsPage alertsPage;
    @BeforeClass
    public void navigateToAlertsPage(){
        alertsPage=homePage.clickonAlertsPage();

    }
    @Test
    public void firstAlertTest(){
        alertsPage.clickOnFirstAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResultText(),"You successfully clicked an alert");
    }

    @Test
    public void secondAlertTest(){
        alertsPage.clickOnSecondAlert();
        alertsPage.dismissAlert();
        assertEquals(alertsPage.getResultText(),"You clicked: Cancel");
    }
    @Test
    public void thirdAlertTest(){
        alertsPage.clickOnThirdAlert();;
        alertsPage.enterAlertText("ABC");
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResultText(), "You entered: ABC");
    }


}
