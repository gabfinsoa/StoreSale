package base;

import actions.OrderConfirmationActions;
import capabilities.Capabilities;

public class InitOrderConfirmation {

    public static Capabilities caps = new Capabilities();
    static OrderConfirmationActions orderConfirmationActions = new OrderConfirmationActions(caps.driver);

    public static void doGetOrderNumberOrderConfirmationLabel() {
        orderConfirmationActions.doGetOrderNumberOrderConfirmationLabelAction();
    }

    public static void doAnacapriGetOrderNumberOrderConfirmationLabel(){
        orderConfirmationActions.doAnacapriGetOrderNumberOrderConfirmationLabelAction();
    }

    public static void doGoToHomepageOrderConfirmationLabel(){
        orderConfirmationActions.doGoToHomepageOrderConfirmationLabelAction();
    }

    public static void doAnacapriGoToHomepageOrderConfirmationLabel(){
        orderConfirmationActions.doAnacapriGoToHomepageOrderConfirmationLabelAction();
    }

}
