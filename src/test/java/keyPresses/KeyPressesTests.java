package keyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;
import static org.testng.Assert.*;


public class KeyPressesTests extends BaseTests {
    @Test
    public void firstKeyPressesTest(){
        KeyPressesPage keyPressesPage =homePage.clickonKeyPressesPage();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE");
    }
}
