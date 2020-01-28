package actions;

import objects.CartObjects;
import org.openqa.selenium.WebDriver;

public class CartActions extends CartObjects {
    public CartActions(WebDriver driver) {
        super(driver);
    }

    public void doBuyCartButtonActions() throws InterruptedException {
        Thread.sleep(2000);
        waitElement(cartBuyButton);
        clickElement(cartBuyButton);
    }

    public void doAnacapriBuyButtonActions() throws InterruptedException {
        Thread.sleep(2000);
        waitElement(cartAnacapriBuyButton);
        clickElement(cartAnacapriBuyButton);
    }

    public void doDeleteItemCartButtonActions(){
        clickElement(cartDeleteItemCartButton);
    }


}
