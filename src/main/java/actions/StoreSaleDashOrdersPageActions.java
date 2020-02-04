package actions;

import objects.StoreSaleDashOrdersPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Awaiter;
import utils.BaseGeneric;
import utils.Generic;
import utils.ScreenMappings;

import static utils.BasePage.hasElement;
import static utils.BasePage.scrollElementIntoView;

public class StoreSaleDashOrdersPageActions extends StoreSaleDashOrdersPageObjects {
    public StoreSaleDashOrdersPageActions(WebDriver driver) {
        super(driver);
    }

    static Generic mapaDeElementos = new ScreenMappings<actions.pageobjects.StoreSaleDashOrdersPageActions>().getJson("StoreSaleStorePage");

//    static utils.Generic mapaDeElementos = new ScreenMappings<utils.Generic>().getJson("StoreSaleStorePage");
    public static String doGetStoreSaleDashOrderNumberActions(){
        String orderConfirmationOrderNumberLabel = OrderConfirmationActions.varOrderConfirmation;
        String pedido = orderConfirmationOrderNumberLabel.replace("DETALHES DO PEDIDO Nº ","");

        return pedido;
    }

    public void receboUmPedidoParaConfirmar() {
        Awaiter.doNothing().withTimeoutOf(300).until(() -> achouUmPedido());
    }

    private boolean achouUmPedido() {
        return hasElement(mapaDeElementos.getOrderRow().withParameters(getOrder()));
//        return hasElement((BaseGeneric) driver.findElement(By.xpath(".//*[contains(text(),'"+pedido+"')]")));

    }

    private static String getOrder() {
        String pedido = doGetStoreSaleDashOrderNumberActions();
        return pedido;
    }

    public void aceitarPedido() {
        scrollElementIntoView(mapaDeElementos.getOrderRow().withParameters(getOrder()));
        clickElement((WebElement) mapaDeElementos.getOrderRow().withParameters(getOrder()));
        clickElement((WebElement) mapaDeElementos.getAtenderPedidoSimBt());
    }


}
