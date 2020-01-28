package base;

import actions.StoreSaleHomepageActions;
import capabilities.Capabilities;

public class InitStoreSaleHomepage {
    public static Capabilities caps = new Capabilities();
    public static StoreSaleHomepageActions storeSaleHomepageActions = new StoreSaleHomepageActions(caps.driver);

    public static void doGetStoreSaleUrlBase(){
        storeSaleHomepageActions.doGetStoreSaleUrlBaseAction();
    }

    public static void doSendLoginEmailStoreSaleHomePageLogin(){
        storeSaleHomepageActions.doSendLoginEmailStoreSaleHomePageLoginAction();
    }

    public static void doSendLoginPasswordStoreSaleHomePageLogin(){
        storeSaleHomepageActions.doSendLoginPasswordStoreSaleHomePageLoginAction();
    }

    public static void doClickLoginStoreSaleHomePageLogin(){
        storeSaleHomepageActions.doClickLoginStoreSaleHomePageLoginAction();
    }



}
