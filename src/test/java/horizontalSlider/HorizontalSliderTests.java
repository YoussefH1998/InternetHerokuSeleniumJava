package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testHorizontalSliderMovingRight(){
        int value=4;
        HorizontalSliderPage horizontalSliderPage=homePage.clickonHorizontalSliderPage();
        horizontalSliderPage.MoveSliderRight(value*2);
        assertEquals(horizontalSliderPage.getCurrentValue(),value);



    }
}
