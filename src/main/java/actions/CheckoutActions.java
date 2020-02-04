package actions;

import objects.CheckoutObjects;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CheckoutActions extends CheckoutObjects {
    public CheckoutActions(WebDriver driver){
        super(driver);
    }


    public void doSendUsernameEmailCheckoutAction(){
//        checkoutUserNameEditText.sendKeys("gabriel.soares@arezzo.com.br");
        sendKeysElement(checkoutUserNameEditText,"");

    }

    public void doSendPasswordCheckoutAction(){
//        checkoutPasswordEditText.sendKeys("Arezzo123");
        sendKeysElement(checkoutPasswordEditText,"");

    }

    public void doClickDataLoginCheckoutAction(){
        clickElement(checkoutContinuarButton);
    }

    public void doClickLabelEntregaPelaLojaAction(){
        clickElement(checkoutEntregaPelaLojaTypeLabel);
    }

    public void doAnacapriClickLabelEntregaPelaLojaAction(){
        clickElement(checkoutAnacapriEntregaPelaLojaTypeLabel);
    }

    public void doClickLabelRetireNaLojaAction(){
        clickElement(checkoutRetireNaLojaTypeLabel);
    }

    public void doClickContinueAddressButtonAction(){
        clickElement(checkoutContinuarAddressButton);
    }

    public void doClickCreditCartSelectButtonAction(){
        clickElement(checkoutCreditCartSelectButton);
    }

    public void doCreditCartNumberEditTextAction(){
        sendKeysElement(checkoutCreditCartNumberEditText, "4111111111111111");
    }

    public void doCreditCartNameEditTextAction(){
        sendKeysElement(checkoutCreditCartNameEditText, "Titular do Cartao");
    }

    public void doCreditCartExpiryMonthEditTextAction(){
        sendKeysElement(checkoutCreditCartExpiryMonthEditText, "10");
    }

    public void doCreditCartExpiryYearEditTextAction(){
        sendKeysElement(checkoutCreditCartExpiryYearEditText, "2020");
    }

    public void doCreditCartSecurityCodeEditTextAction(){
        sendKeysElement(checkoutCreditCartSecurityCodeEditText, "737");
    }

    public void doCreditCartCpfNumberEditTextAction(){
        sendKeysElement(checkoutCreditCartCpfNumberEditText, "78687089058");
    }

    public void doCreditCartContinuarButtonAction(){
        clickElement(checkoutContinuarCreditCartButton);
    }

    public void doCreditCartFinishOrderButtonAction(){
        waitElement(checkoutFinishOrderCreditCartButton);
        clickElement(checkoutFinishOrderCreditCartButton);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
