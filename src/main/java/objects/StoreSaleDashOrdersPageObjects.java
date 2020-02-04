package objects;

import actions.OrderConfirmationActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;
import objects.OrderConfirmationObjects;
import actions.StoreSaleDashOrdersPageActions;

import java.util.List;

import static actions.StoreSaleDashOrdersPageActions.doGetStoreSaleDashOrderNumberActions;

public class StoreSaleDashOrdersPageObjects extends Utils {
    public StoreSaleDashOrdersPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

//    static String orderNumber = StoreSaleDashOrdersPageActions.doGetStoreSaleDashOrderNumberActions();

    static String orderConfirmationOrderNumberLabel = OrderConfirmationActions.varOrderConfirmation;
    static String pedido = orderConfirmationOrderNumberLabel.replace("DETALHES DO PEDIDO Nº ","");
    static String LocateOrder = ".//*[contains(text(),'"+ pedido +"')]";

    @FindBy(xpath = "./html/body/div[3]/div/div/div[2]/h3")
    public static WebElement storeSaleDashUserStoreDashLabel;

    @FindBy(css = ".sts-grid-body-row[data-order-id=%a] button")
    public static WebElement storeSaleLocateOrderArezzo;

//    @FindBy(xpath = LocateOrder)
//    public static WebElement storeSaleLocateOrderArezzo;


}
