package actions;

import objects.OrderConfirmationObjects;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationActions extends OrderConfirmationObjects {
    public OrderConfirmationActions(WebDriver driver){
        super(driver);
    }

    public String varOrderConfirmation = "";


    public void doGetOrderNumberOrderConfirmationLabelAction(){
        waitElement(orderConfirmationOrderNumberLabel);
        varOrderConfirmation = getText(orderConfirmationOrderNumberLabel);
        System.out.println(varOrderConfirmation);

    }

    public void doAnacapriGetOrderNumberOrderConfirmationLabelAction(){
        waitElement(orderAnacapriConfirmationOrderNumberLabel);
        varOrderConfirmation = getText(orderAnacapriConfirmationOrderNumberLabel);
        System.out.println(varOrderConfirmation);
    }

    public void doGoToHomepageOrderConfirmationLabelAction(){
        clickElement(orderConfirmationGoToHomepageLabel);
    }

    public void doAnacapriGoToHomepageOrderConfirmationLabelAction(){
        clickElement(orderConfirmationAnacapriGoToHomepageLabel);
    }
}
