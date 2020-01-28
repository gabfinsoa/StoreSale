package base;

import actions.CheckoutActions;
import actions.HomepageActions;
import capabilities.Capabilities;

public class InitHomepage {
    public static Capabilities caps = new Capabilities();
    static HomepageActions homepageActions = new HomepageActions(caps.driver);

    public static void doClickExitButtonHomepage(){
        homepageActions.doClickExitButtonHomepageActions();
    }

    public static void doAnacapriClickExitButtonHomepage(){
        homepageActions.doAnacapriClickExitButtonHomepageActions();
    }


}
