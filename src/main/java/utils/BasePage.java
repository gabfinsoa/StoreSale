package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class BasePage extends Element {

    static boolean isMobile = Utils.getMode().equals("Mobile");
    static boolean isDesktop = Utils.getMode().equals("Desktop");
    static boolean isAlexandreBirman = Utils.getBrand().equals("AlexandreBirman");
    static boolean isAnacapri = Utils.getBrand().equals("Anacapri");
    static boolean isArezzo = Utils.getBrand().equals("Arezzo");
    static boolean isFiever = Utils.getBrand().equals("Fiever");
    static boolean isOutstore = Utils.getBrand().equals("Outstore");
    static boolean isOwme = Utils.getBrand().equals("Owme");
    static boolean isSchutz = Utils.getBrand().equals("Schutz");
    static boolean isVans = Utils.getBrand().equals("Vans");
    static boolean isAlexandreBirmanDesktop = isAlexandreBirman && isDesktop;
    static boolean isAnacapriDesktop = isAnacapri && isDesktop;
    static boolean isArezzoDesktop = isArezzo && isDesktop;
    static boolean isFieverDesktop = isFiever && isDesktop;
    static boolean isOutstoreDesktop = isOutstore && isDesktop;
    static boolean isOwmeDesktop = isOwme && isDesktop;
    static boolean isSchutzDesktop = isSchutz && isDesktop;
    static boolean isVansDesktop = isVans && isDesktop;
    static boolean isAlexandreBirmanMobile = isAlexandreBirman && isMobile;
    static boolean isAnacapriMobile = isAnacapri && isMobile;
    static boolean isArezzoMobile = isArezzo && isMobile;
    static boolean isFieverMobile = isFiever && isMobile;
    static boolean isOutstoreMobile = isOutstore && isMobile;
    static boolean isOwmeMobile = isOwme && isMobile;
    static boolean isSchutzMobile = isSchutz && isMobile;
    static boolean isVansMobile = isVans && isMobile;
    static final String SENHA = "teste1234";


    protected static void fillInput(String text, BaseGeneric generic) {
        waitElement(generic);
        element(generic).clear();
        element(generic).sendKeys(text);
    }

    protected static void fillPassword(BaseGeneric generic) {
        fillPassword(generic, SENHA);
    }

    protected static void fillPassword(BaseGeneric generic, String password) {
        waitElement(generic);
        element(generic).clear();
        element(generic).sendKeys(password);
    }

    protected static List<String> formatarFrete(List<WebElement> fretes) {
        List<String> fretesFormatados = new ArrayList<>();
        String rawText;
        String formattedText;
        for (WebElement frete : fretes) {
            rawText = frete.getText();
            formattedText = rawText.replace(" ", "").replace("\n", "").toUpperCase();
            fretesFormatados.add(formattedText);
        }
        return fretesFormatados;
    }

    protected static void click(BaseGeneric generic) {
        waitForElementVisible(generic);
        isClickable(generic);
        WebElement element = element(generic);
        try {
            if (isMobile) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});",
                        element);
                staticWait(500);
                element.click();
            } else {
                staticWait(500);
                element.click();
            }
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});",
                    element);
            staticWait(500);
            element.click();
        }
        staticWait(1000);
    }

    protected static String getText(BaseGeneric generic) {
        waitElement(generic);
        String text = "";
        text = element(generic).getText();
        return text;
    }

    protected static boolean verifyText(String texto, BaseGeneric generic) {
        waitElement(generic);
        boolean text = false;
        text = element(generic).getText().contains(texto);
        if (text) {
            return true;
        }
        return text;
    }

    protected static void changeToNewWindow() {
        String window = Browser.getCurrentDriver().getWindowHandle();
        for (String handle : Browser.getCurrentDriver().getWindowHandles()) {
            if (!handle.equals(window))
                Browser.getCurrentDriver().switchTo().window(handle);
        }
    }

    protected static void closeTabs() {
        String window = Browser.getCurrentDriver().getWindowHandle();
        for (String handle : Browser.getCurrentDriver().getWindowHandles()) {
            if (handle.equals(window))
                close();
        }
    }

    protected static String limparValorNaString(String valorNaoFormatado) {
        return valorNaoFormatado.replace("cada", "").replace("CADA", "").substring(valorNaoFormatado.indexOf('$') + 1).replace(" ", "").replace(".", "").replace(",", ".");
    }

    protected static double converterStringValorParaDouble(String valorNaoFormatado) {
        return Double.parseDouble(limparValorNaString(valorNaoFormatado));
    }

    protected static double formatarDoubleParaDuasCasasDecimais(Double valorNaoFormatado) {
        DecimalFormat df = new DecimalFormat("0.00");
        String valorFormatado = df.format(valorNaoFormatado).replace(",", ".");
        return new Double(valorFormatado);
    }

    protected static void clickAtTheBottomOfElement(BaseGeneric generic) {
        waitElement(generic);
        WebElement el = element(generic);
        Actions act = new Actions(Browser.getCurrentDriver());
        act.moveToElement(el, 0, (el.getSize().getHeight() - 3)).click().build().perform();
    }

    public static void scrollElementIntoView(BaseGeneric generic) {
        waitElement(generic);
        WebElement el = element(generic);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});",
                el);
    }

    //Se receber valor "R$ 15,65" ou "R$15,65" retorna "1565",retona sempre numero sem pontos,virgulas e espaços
    protected static String getNumericValueText(String texto) {
        return texto.replaceAll("[^0-9]", "").trim();
    }

    protected static String getNumeroComPontuacao(String texto) {
        return texto.replaceAll("[a-zA-Z]", "")
                .replace(" ", "")
                .replace("\n", "")
                .replace(",", ".")
                .replace(":", "").trim();
        }

    //Limpa a string para apenas números e verifica se contêm o valor(texto) passado
    protected static boolean verifyTextNumber(String texto, BaseGeneric generic) {
        waitElement(generic);
        String teste = getText(generic).replaceAll("[^0-9]", "").trim();
        return teste.contains(texto);
    }

    //recebe a string com os valore de R$ 1.099,00 R$ 999,00 das promoções e pega o ultimo valor para o assert
    protected static String getPreco(String valor, boolean maior) {
        String[] valores = valor.split("R");
        if (valores.length == 3) {
            if (maior) {
                return valores[1];
            } else {
                return valores[2];
            }

        } else {
            return valor;
        }
    }

    protected static String getTipoFrete(String frete) {
        String tipoFrete = "";
        String[] fretePartes = frete.split("-");
        for (String part : fretePartes) {
            if (!part.contains("$") && !part.contains("GRÁTIS") && !part.contains("DIASÚTEIS")) {
                tipoFrete = part;
            }
        }
        return tipoFrete;
    }

    protected static int getValorFrete(String frete) {
        int valorFrete = 0;
        String[] fretePartes = frete.split("-");
        for (String part : fretePartes) {
            if (part.contains("$")) {
                valorFrete = Integer.parseInt(getNumericValueText(part));
            }
        }
        return valorFrete;
    }

    protected static void performEnter() {
        Actions act = new Actions(Browser.getCurrentDriver());
        act.sendKeys(Keys.ENTER).perform();
    }

    public static boolean hasElement(BaseGeneric generic) {
        return element(generic) != null;
    }

    protected static void mouseover(BaseGeneric generic){
        waitElement(generic);
        WebElement element = element(generic);
        Actions action = new Actions(getCurrentDriver());
        action.moveToElement(element).build().perform();

    }

}