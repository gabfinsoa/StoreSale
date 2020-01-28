package base;

import actions.CheckoutActions;
import capabilities.Capabilities;
import steps.ComprarProdutosArezzoStep;

public class InitCheckout {

    public static Capabilities caps = new Capabilities();
    static CheckoutActions checkoutActions = new CheckoutActions(caps.driver);
    static ComprarProdutosArezzoStep asas = new ComprarProdutosArezzoStep();


    public static void doSendUsernameEmailCheckout(){
        checkoutActions.doSendUsernameEmailCheckoutAction();
    }

    public static void doSendPasswordCheckout(){
        checkoutActions.doSendPasswordCheckoutAction();
    }

    public static void doClickDataLoginCheckout(){
        checkoutActions.doClickDataLoginCheckoutAction();
    }

    public static void doClickMethodSelectEntregaPelaLoja(){
        checkoutActions.doClickLabelEntregaPelaLojaAction();
    }

    public static void doAnacapriClickMethodSelectEntregaPelaLoja(){
        checkoutActions.doAnacapriClickLabelEntregaPelaLojaAction();
    }


    public static void doClickMethodSelectRetireNaLoja(){
        checkoutActions.doClickLabelRetireNaLojaAction();
    }

    public static void doClickContinueAddressButton(){
        checkoutActions.doClickContinueAddressButtonAction();
    }

    public static void doClickCreditCartSelectButton(){
        checkoutActions.doClickCreditCartSelectButtonAction();
    }

    public static void doCreditCartNumberEditText(){
        checkoutActions.doCreditCartNumberEditTextAction();
    }

    public static void doCreditCartNameEditText(){
        checkoutActions.doCreditCartNameEditTextAction();
    }

    public static void doCreditCartExpiryMonthEditText(){
        checkoutActions.doCreditCartExpiryMonthEditTextAction();
    }

    public static void doCreditCartExpiryYearEditText(){
        checkoutActions.doCreditCartExpiryYearEditTextAction();
    }

    public static void doCreditCartSecurityCodeEditText(){
        checkoutActions.doCreditCartSecurityCodeEditTextAction();
    }

    public static void doCreditCartCpfNumberEditText(){
        checkoutActions.doCreditCartCpfNumberEditTextAction();
    }

    public static void doCreditCartContinuarButton(){
        checkoutActions.doCreditCartContinuarButtonAction();
    }

    public static void doCreditCartFinishOrderButton(){
        checkoutActions.doCreditCartFinishOrderButtonAction();
    }

}
