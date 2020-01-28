package base;

import actions.CartActions;
import capabilities.Capabilities;

public class InitCart {

    public static Capabilities caps = new Capabilities();
    static CartActions cartActions = new CartActions(caps.driver);

    public static void cartDeleteItem(){
        cartActions.doDeleteItemCartButtonActions();
    }

    public static void cartBuyItem() throws InterruptedException {
        cartActions.doBuyCartButtonActions();
    }

    public static void cartAnacapriBuyItem() throws InterruptedException{
        cartActions.doAnacapriBuyButtonActions();
    }


}
