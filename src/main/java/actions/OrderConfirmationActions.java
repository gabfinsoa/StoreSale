package actions;

import objects.OrderConfirmationObjects;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OrderConfirmationActions extends OrderConfirmationObjects {
    public OrderConfirmationActions(WebDriver driver){
        super(driver);
    }

    public static String varOrderConfirmation = "";


    public String doGetOrderNumberOrderConfirmationLabelAction(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        waitElement(orderConfirmationOrderNumberLabel);
        varOrderConfirmation = getText(orderConfirmationOrderNumberLabel);
        System.out.println(varOrderConfirmation);
        return varOrderConfirmation;

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
