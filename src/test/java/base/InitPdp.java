package base;

import actions.InitialSearchBarActions;
import actions.PdpProductOptionsActions;
import capabilities.Capabilities;

public class InitPdp {

    public static Capabilities caps = new Capabilities();
    static InitialSearchBarActions init = new InitialSearchBarActions(caps.driver);
    static PdpProductOptionsActions pdpActions = new PdpProductOptionsActions(caps.driver);



    public static void homePageGoogle(){
//        InitialSearchBarActions init = new InitialSearchBarActions(caps.driver);
        init.doSearch();
    }

    public static void pdpBuyItem(){
//        PdpProductOptionsActions init = new PdpProductOptionsActions(caps.driver);
        pdpActions.doBuyPdpButton();
    }

    public static void pdpBuyDiscountItem(){
        pdpActions.doBuyDiscountButton();
    }

    public static void pdpSelectGrade33_4Button(){
        pdpActions.doSelectGrade33_4Button();
    }

    public static void pdpSelectGrade39Button(){
        pdpActions.doSelectGrade39Button();
    }

    public static void pdpAnacapriSelectGrade39Button(){
        pdpActions.doAnacapriSelectGrade39ButtonActions();
    }

    public static void pdpAnacapriBuyItemButton(){
        pdpActions.doAnacapriBuyButtonActions();
    }

}
