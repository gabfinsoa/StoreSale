package base;

import actions.StoreSaleDashOrdersPageActions;
import actions.StoreSaleDashboardOrdersPageActions;
import capabilities.Capabilities;

public class InitStoreSaleDashOrdersPage {
    public static Capabilities caps = new Capabilities();
//    public static StoreSaleDashOrdersPageActions StoreSaleDashOrdersPageActions = new StoreSaleDashOrdersPageActions(caps.driver);
    public static StoreSaleDashOrdersPageActions StoreSaleDashOrdersPageActionsActions = new StoreSaleDashOrdersPageActions(caps.driver);
    public static StoreSaleDashboardOrdersPageActions StoreSaleDashboardOrdersPageActions = new StoreSaleDashboardOrdersPageActions((caps.driver));

    public static void doGetStoreSaleDashOrderNumber(){
        StoreSaleDashboardOrdersPageActions.doGetStoreSaleDashOrderNumberActions_new();
    }

    public static void doGetFindStoreSaleOrderNumber(){
        StoreSaleDashboardOrdersPageActions.doGetStoreSaleLocateOrder_new();
    }

//    public static void doGetStoreSaleDashOrderNumber(){
//        StoreSaleDashOrdersPageActionsActions.doGetStoreSaleDashOrderNumberActions();
//    }
//
//     public static void doGetFindStoreSaleOrderNumber(){
//        StoreSaleDashOrdersPageActionsActions.receboUmPedidoParaConfirmar();
//    }
//
//    public static void doGetConfirmOrder(){
//        StoreSaleDashOrdersPageActionsActions.aceitarPedido();
//    }



}
