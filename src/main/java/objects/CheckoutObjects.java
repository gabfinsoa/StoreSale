package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CheckoutObjects extends Utils {

    public CheckoutObjects(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "j_username")
    public static WebElement  checkoutUserNameEditText;

    @FindBy(id = "j_password")
    public static WebElement checkoutPasswordEditText;

    @FindBy(id = "submit-login-btn")
    public static WebElement checkoutContinuarButton;

    @FindBy(xpath = ".//li[2]/label")
    public static WebElement checkoutEntregaPelaLojaTypeLabel;

    @FindBy(xpath = ".//li[2]/label")
    public static WebElement checkoutAnacapriEntregaPelaLojaTypeLabel;

    @FindBy(xpath = ".//li[1]/label")
    public static WebElement checkoutRetireNaLojaTypeLabel;

    @FindBy(id = "finish-address-btn")
    public static WebElement checkoutContinuarAddressButton;

    @FindBy(id = "credit-card")
    public static WebElement checkoutCreditCartSelectButton;

    @FindBy(id = "cardNumber0")
    public static WebElement checkoutCreditCartNumberEditText;

    @FindBy(id = "nameOnCard0")
    public static WebElement checkoutCreditCartNameEditText;

    @FindBy(id = "expiryMonth0")
    public static WebElement checkoutCreditCartExpiryMonthEditText;

    @FindBy(id = "expiryYear0")
    public static WebElement checkoutCreditCartExpiryYearEditText;

    @FindBy(id = "securityCode0")
    public static WebElement checkoutCreditCartSecurityCodeEditText;

    @FindBy(id = "cardCpf0")
    public static WebElement checkoutCreditCartCpfNumberEditText;

    @FindBy(id = "submit-credit-card-method-btn-0")
    public static WebElement checkoutContinuarCreditCartButton;

    @FindBy(id = "finish-order-btn")
    public static WebElement checkoutFinishOrderCreditCartButton;



}
