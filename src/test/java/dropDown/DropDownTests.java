package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectedOption(){
        DropDownPage dropDownPage=homePage.clickonDropDownPage();
        String option="Option 2";
        dropDownPage.selectByText(option);
        assertEquals(dropDownPage.getAllSelectedOptions().size(),1,"Incorrect number of selected options");
        assertTrue(dropDownPage.getAllSelectedOptions().contains(option),"Wrong Option is Selected");
    }

}
