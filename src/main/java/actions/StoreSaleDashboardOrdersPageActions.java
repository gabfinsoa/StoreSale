package actions;

import objects.StoreSaleDashOrdersPageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Awaiter;
import utils.BaseGeneric;
import utils.Generic;
import utils.ScreenMappings;

import java.util.concurrent.TimeUnit;

import static utils.BasePage.hasElement;
import static utils.BasePage.scrollElementIntoView;
import static utils.Element.waitForElementVisible;

public class StoreSaleDashboardOrdersPageActions extends StoreSaleDashOrdersPageObjects {
    public StoreSaleDashboardOrdersPageActions(WebDriver driver) {
        super(driver);
    }

    public String doGetStoreSaleDashOrderNumberActions_new(){
        String orderConfirmationOrderNumberLabel = OrderConfirmationActions.varOrderConfirmation;
        String pedido = orderConfirmationOrderNumberLabel.replace("DETALHES DO PEDIDO Nº ","");

        return pedido;
    }

    public void CreateSalesOrder()
    {
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.pollingEvery(1, TimeUnit.SECONDS);
        String pedido = doGetStoreSaleDashOrderNumberActions_new();
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[contains(text(),'"+ pedido +"')]"))));
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()[contains(.,'"+ pedido +"')]]"))));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@class=’sts-grid-body’]//div[contains(text(),"+pedido+")]"))));

        System.out.println("Encontrou:  "+pedido);
//        String css = driver.findElement(By.xpath("//*[text()[contains(.,'"+ pedido +"')]]")).getCssValue("data-order-id");
        String css = driver.findElement(By.xpath("//*[@class=’sts-grid-body’]//div[contains(text(),"+pedido+")]")).getCssValue("data-order-id");
        System.out.println("CSS:  "+css);
        clickElement(storeSaleLocateOrderArezzo);
    }

//    public void CreateSalesOrder()
//    {
//        Wait wait = new FluentWait(driver)
//                .withTimeout(60, TimeUnit.SECONDS)
//                .pollingEvery(2, TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class)
//                .ignoring(StaleElementReferenceException.class);
//    }


    public void doGetStoreSaleLocateOrder_new(){
        CreateSalesOrder();


    }




}
