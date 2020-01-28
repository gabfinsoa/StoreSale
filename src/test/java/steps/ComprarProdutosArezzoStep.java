package steps;

import base.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static objects.CheckoutObjects.*;


public class ComprarProdutosArezzoStep {


    @Given("^I navigate to the \"([^\"]*)\" page$")
    public void iNavigateToThePage(String urlGoogle) throws Throwable {
        System.out.println(urlGoogle);
//        Capabilities.openRemarcado30();
//        Capabilities.openFullPrice();
    }

    @Given("^I select the number \"([^\"]*)\"$")
    public void iSelectTheNumber(String numero) throws Throwable {
        if (getBrand().equals("Arezzo")){
            System.out.println(numero);
            if (numero.equals("39")){
                InitPdp.pdpSelectGrade39Button();
            }
            else {
                InitPdp.pdpSelectGrade33_4Button();
            }
        }else{
            InitPdp.pdpAnacapriSelectGrade39Button();
        }
    }

    @And("^I click the buy button$")
    public void iClickTheBuyButton() {
        if (getBrand().equals("Arezzo")){
            InitPdp.pdpBuyItem();
        }else {
            InitPdp.pdpAnacapriBuyItemButton();
        }

    }

    @And("^I click the buy Discount button$")
    public void iClickTheBuyDiscountButton() {
        InitPdp.pdpBuyDiscountItem();
    }

    @And("^I click the buy button on cart$")
    public void iClickTheBuyButtonOnCart() throws InterruptedException {
        if (getBrand().equals("Arezzo")){
            InitCart.cartBuyItem();
        }else {
            InitCart.cartAnacapriBuyItem();
        }
    }

    @And("^I insert the Store Sale ([^\"]*) and ([^\"]*)$")
    public void iInsertTheStoreSaleUsername(String userNameCheckout, String passwordCheckout) throws InterruptedException {

//        System.out.println("The NEW username is: " + userNameCheckout);

        InitCheckout.doSendUsernameEmailCheckout();
        checkoutUserNameEditText.clear();
        checkoutUserNameEditText.sendKeys(userNameCheckout);
        checkoutPasswordEditText.clear();
        checkoutPasswordEditText.sendKeys(passwordCheckout);

    }

    @When("^I click the continue button$")
    public void iClickTheContinueButton() {
        InitCheckout.doClickDataLoginCheckout();
    }

    @And("^I select Entrega pela Loja method$")
    public void iSelectEntregaPelaLojaMethod() {
        if (getBrand().equals("Arezzo")){
            InitCheckout.doClickMethodSelectEntregaPelaLoja();
        }else {
            InitCheckout.doAnacapriClickMethodSelectEntregaPelaLoja();
        }

    }

    @And("^I select Retire na Loja method$")
    public void iSelectRetireNaLojaMethod() {
        InitCheckout.doClickMethodSelectRetireNaLoja();
    }

    @And("^I click the continue address button$")
    public void iClickTheContinueAddressButton() {
        InitCheckout.doClickContinueAddressButton();
    }

    @And("^I select Credit Cart pay method$")
    public void iSelectCreditCartPayMethod() {
        InitCheckout.doClickCreditCartSelectButton();
    }

    @And("^I insert the Credit Cart number$")
    public void iInsertTheCreditCartNumber() {
        InitCheckout.doCreditCartNumberEditText();
    }

    @And("^I insert the Nome do Titular$")
    public void iInsertTheNomeDoTitular() {
        InitCheckout.doCreditCartNameEditText();
    }

    @And("^I insert the Validade Mes$")
    public void iInsertTheValidadeMes() {
        InitCheckout.doCreditCartExpiryMonthEditText();
    }

    @And("^I insert the Validade Ano$")
    public void iInsertTheValidadeAno() {
        InitCheckout.doCreditCartExpiryYearEditText();
    }

    @And("^I insert the Codigo de Seguranca$")
    public void iInsertTheCodigoDeSeguranca() {
        InitCheckout.doCreditCartSecurityCodeEditText();
    }

    @And("^I insert the CPF do Titular$")
    public void iInsertTheCPFDoTitular() {
        InitCheckout.doCreditCartCpfNumberEditText();
    }

    @And("^I click the continue Credit Cart button$")
    public void iClickTheContinueCreditCartButton() {
        InitCheckout.doCreditCartContinuarButton();
    }

    @And("^I click the Finish Order button$")
    public void iClickTheFinishOrderButton() throws InterruptedException {
        InitCheckout.doCreditCartFinishOrderButton();
    }

    @Then("^I get the Order Number in the Order Confirmation page$")
    public void iGetTheOrderNumberInTheOrderConfirmationPage() {
        if (getBrand().equals("Arezzo")){
            InitOrderConfirmation.doGetOrderNumberOrderConfirmationLabel();
        }else {
            InitOrderConfirmation.doAnacapriGetOrderNumberOrderConfirmationLabel();
        }
    }

    @And("^I go to homegape$")
    public void iGoToHomegape() {
        if (getBrand().equals("Arezzo")) {
            InitOrderConfirmation.doGoToHomepageOrderConfirmationLabel();
        } else {
            InitOrderConfirmation.doAnacapriGoToHomepageOrderConfirmationLabel();
        }
    }

    @And("^I click on exit my account$")
    public void iClickOnExitMyAccount() {
        if (getBrand().equals("Arezzo")){
            InitHomepage.doClickExitButtonHomepage();
        }else {
            InitHomepage.doAnacapriClickExitButtonHomepage();
        }
    }


    @And("^I access the Store Sale url$")
    public void iAccessTheStoreSaleUrl() {
        InitStoreSaleHomepage.doGetStoreSaleUrlBase();
    }

    @And("^I insert the Store Sale User$")
    public void iInsertTheStoreSaleUser() {
        InitStoreSaleHomepage.doSendLoginEmailStoreSaleHomePageLogin();
        InitStoreSaleHomepage.doSendLoginPasswordStoreSaleHomePageLogin();
    }

    @And("^I click the Entrar button on Home Page$")
    public void iClickTheEntrarButtonOnHomePage() {
        InitStoreSaleHomepage.doClickLoginStoreSaleHomePageLogin();
    }
}
