package actions;

import objects.PdpProductOptionsObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Browser;

public class PdpProductOptionsActions extends PdpProductOptionsObjects {

    public PdpProductOptionsActions(WebDriver driver) {
        super(driver);
    }

    public void doBuyPdpButton(){
        waitElement(pdpBuyButton);
        clickElement(pdpBuyButton);
    }

    public void doBuyDiscountButton(){
        waitElement(pdpBuyButtonDiscount);
        clickElement(pdpBuyButtonDiscount);
    }

    public void doSelectGrade33_4Button(){
        waitElement(pdpGrade33_4Button);
        clickElement(pdpGrade33_4Button);
    }

    public void doSelectGrade39Button(){
        waitElement(pdpGrade39Button);
//        sendKeysElement(pdpStopPage,"Keys.ESCAPE");
        clickElement(pdpGrade39Button);
    }

    public void doAnacapriSelectGrade39ButtonActions(){
        waitElement(pdpAnacapriGrade39Button);
//        sendKeysElement(pdpStopPage,"Keys.ESCAPE");
        clickElement(pdpAnacapriGrade39Button);
    }

    public void doAnacapriBuyButtonActions(){
//        waitElement(pdpAnacapriCloseAdvisor);
//        if (Exists(pdpAnacapriCloseAdvisor))
//        {
////            waitElement(pdpAnacapriCloseAdvisor);
//            clickElement(pdpAnacapriCloseAdvisor);
//        }

        waitElement(pdpAnacapriBuyButton);
        clickElement(pdpAnacapriBuyButton);
    }
}
