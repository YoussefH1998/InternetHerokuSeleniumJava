package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoverPage;
import static org.testng.Assert.*;


public class HoverTests extends BaseTests {
    private int index=2;
    @Test
    public void hoverandCheckForText(){
       HoverPage hoverPage= homePage.clickonHoverPage();
       var figCaption= hoverPage.hoverOverFigure(index);
       String text=figCaption.getFigCaptionText();
       String link=figCaption.getFigCaptionLink();
       assertTrue(text.contains("user"+index),"Required user is not shown correctly");
        System.out.println(link);
       assertTrue(link.endsWith("/users/"+index),"The link is not correct");
    }

}
