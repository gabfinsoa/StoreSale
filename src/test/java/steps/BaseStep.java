package steps;

import cucumber.api.Scenario;
import cucumber.api.java8.Pt;
import org.openqa.selenium.JavascriptExecutor;
//import utils.Browser;
import utils.Utils;

public class BaseStep implements Pt {
//    static boolean isMobile = Utils.getMode().equals("Mobile");
    static boolean isArezzo = Utils.getBrand().equals("Arezzo");
//    static boolean isArezzoMobile = isArezzo && isMobile;
    static boolean isAlexandreBirman = Utils.getBrand().equals("AlexandreBirman");
    static boolean isAnacapri = Utils.getBrand().equals("Anacapri");
//    static boolean isArezzo = Utils.getBrand().equals("Arezzo");
    static boolean isFiever = Utils.getBrand().equals("Fiever");
    static boolean isOutstore = Utils.getBrand().equals("Outstore");
    static boolean isOwme = Utils.getBrand().equals("Owme");
    static boolean isSchutz = Utils.getBrand().equals("Schutz");


    public BaseStep() {
        Before((Scenario scenario) -> {
            System.setProperty("webdriver.chrome.driver", Utils.webdriverLocation());
            System.out.println("Base URL: " + Utils.getBaseUrl());
            System.out.println("Brand: " + Utils.getBrand());
            System.out.println("Mode: " + Utils.getMode());
            System.out.println("Env: " + Utils.getEnv());
//            try {
//                Browser.loadPage(Utils.getBaseUrl());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if(isArezzoMobile){
//                closeBanner();
//            }
        });

//        After((scenario) -> {
//            System.out.println("Cenário teste: " + scenario.getName());
//            System.out.println("Status teste: " + scenario.getStatus().toUpperCase());
//            System.out.println("---------------------------------------------------------------------------------------------------");
//            if(scenario.isFailed()) {
//                Browser.saveScreenshot();
//            }
//            if(scenario.getSourceTagNames().contains("@emptycart")){
//                CarrinhoPage.esvaziarCarrinho();
//            }
//            if(scenario.getSourceTagNames().contains("@logout")){
//                MinhaContaPage.deslogarDaMinhaConta();
//            }
//            if(scenario.isFailed()) {
//                Browser.attachScreenshotAndClose();
//            }
//        });
    }

//    public void closeBanner(){
//        Element.staticWait(1000);
//        ((JavascriptExecutor) Browser.driver).executeScript("$('#branch-banner-iframe').contents().find('.branch-banner-close').click()");
//    }

}
