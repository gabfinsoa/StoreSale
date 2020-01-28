package utils;

import com.google.gson.Gson;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Utils {

    public WebDriver driver;
    public FluentWait fluentWaitElement;

    public Utils(WebDriver driver) {
        this.driver = driver;
        this.fluentWaitElement = new FluentWait(driver).withTimeout(java.time.Duration.ofSeconds(6))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
                .ignoring(TimeoutException.class);
    }

    public static String getBrand() {
        String brand = "";
        if (System.getProperty("brand") == null){
            System.out.println("Empresa não adicionada: Ex.: -Dcompany=Arezzo ");
        }else{
            brand = System.getProperty("brand");
        }
        return brand;
    }

    public static String getMode() {
        String mode = "";
        if (System.getProperty("mode") == null) {
            System.out.println("Mode não adicionado: Ex.: -Dmode=Desktop ");
        } else {
            mode = System.getProperty("mode");
        }
        return mode;
    }

    public static String getEnv() {
        String env = "";
        if (System.getProperty("env") == null){
            System.out.println("Env não adicionada: Ex.: -Denv=hml ");
        }else{
            env = System.getProperty("env");
        }
        return env;
    }

    public static String getBaseUrl() {
        StringBuilder fileName = new StringBuilder();
        fileName.append("src/test/resources/baseUrl.json");
        String jsonBaseUrl = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName.toString()))) {
            Gson gson = new Gson();
            Map<String, Object> element = gson.fromJson(bufferedReader, Map.class);
            jsonBaseUrl = ((Map<String, String>)((Map<String, Object>)element.get(getBrand())).get(getEnv())).get("url");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonBaseUrl;
    }

    public static String getBaseUrlStoreSale() {
        StringBuilder fileName = new StringBuilder();
        fileName.append("src/test/resources/baseUrlStoreSale.json");
        String jsonBaseUrlStoreSale = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName.toString()))) {
            Gson gson = new Gson();
            Map<String, Object> element = gson.fromJson(bufferedReader, Map.class);
            jsonBaseUrlStoreSale = ((Map<String, String>)((Map<String, Object>)element.get(getBrand())).get(getEnv())).get("url");
//            jsonUserStoreSnnnale = (((Map<String, Object>)((Map<String, Object>)element.get(getBrand())).get(getEnv())).get("loja")).toString();
            System.out.println("UUURRRLLL: "+jsonBaseUrlStoreSale);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonBaseUrlStoreSale;
    }


    public static List<String> getProduct(String param) {

        StringBuilder fileName = new StringBuilder();
        fileName.append("src/test/resources/product.json");
        List<String> sku = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName.toString()))) {
            Gson gson = new Gson();
            Map<String, Object> element = gson.fromJson(bufferedReader, Map.class);
            sku.addAll(((Map<String, List<String>>)((Map<String, Object>)((Map<String, Object>)element.get(param)).get(getBrand())).get(getEnv())).get("sku"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sku;
    }

    public static List<String> getProductEan(String brand, String param) {
        StringBuilder fileName = new StringBuilder();
        fileName.append("src/test/resources/product.json");
        List<String> ean = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName.toString()))) {
            Gson gson = new Gson();
            Map<String, Object> element = gson.fromJson(bufferedReader, Map.class);
            return (ArrayList<String>)((Map<String, Object>)((Map<String, Object>)((Map<String, Object>) element.get(param)).get(brand)).get(getEnv())).get("ean");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



    public static String webdriverLocation() {
        return "driver/chromedriver.exe";
    }

    public void waitElement(WebElement elemento){
        fluentWaitElement.until(ExpectedConditions.visibilityOf(elemento));
    }

    public void clickElement(WebElement elemento){
        waitElement(elemento);
        elemento.click();
    }

    public void submitElement(WebElement elemento){
        waitElement(elemento);
        elemento.submit();
    }

    public void sendKeysElement(WebElement elemento, String texto){
        waitElement(elemento);
        elemento.sendKeys(texto);
    }

    public void sleep(WebElement elemento) throws InterruptedException {
        Thread.sleep(2000);
    }

    public String getText(WebElement elemento){
        waitElement(elemento);
        String getTextReturn = elemento.getText();
        return getTextReturn;
    }

    public String getAttribute(WebElement elemento, String atributo){
        waitElement(elemento);
        String getAttributeReturn = elemento.getAttribute(atributo);
        return getAttributeReturn;
    }

    public boolean Exists(WebElement element)
    {
        if (element == null){
            return false;
        }
//        clickElement(element);
        return true;
    }

}
