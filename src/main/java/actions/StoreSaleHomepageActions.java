package actions;

import objects.StoreSaleHomepageObjects;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class StoreSaleHomepageActions extends StoreSaleHomepageObjects {
    public StoreSaleHomepageActions(WebDriver driver) {
        super(driver);
    }

    public void doGetStoreSaleUrlBaseAction(){
        String urlStoreSale = Utils.getBaseUrlStoreSale();
        System.out.println("SITE: "+urlStoreSale);
        driver.get(urlStoreSale);

    }

    public void doSendLoginEmailStoreSaleHomePageLoginAction(){
        waitElement(storeSaleHomePageLoginEmailEditText);
        sendKeysElement(storeSaleHomePageLoginEmailEditText,"100_dashboards@store.com");
    }

    public void doSendLoginPasswordStoreSaleHomePageLoginAction(){
        waitElement(storeSaleHomePageLoginPasswordEditText);
        sendKeysElement(storeSaleHomePageLoginPasswordEditText,"123456");
    }

    public void doClickLoginStoreSaleHomePageLoginAction(){
        waitElement(storeSaleHomePageLoginEntrarButton);
        clickElement(storeSaleHomePageLoginEntrarButton);
    }

}
