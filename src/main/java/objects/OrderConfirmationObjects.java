package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class OrderConfirmationObjects extends Utils {

    public OrderConfirmationObjects(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

//    @FindBy(xpath = ".//*[@class='arz-order-title']")
//    public static WebElement orderConfirmationOrderNumberLabel;

    @FindBy(xpath = ".//html/body/div[2]/div[1]/div[1]/h2")
    public static WebElement orderConfirmationOrderNumberLabel;

    @FindBy(xpath = "./html/body/div[2]/section/div/div[1]/div[1]/h3")
    public static WebElement orderAnacapriConfirmationOrderNumberLabel;

    @FindBy(xpath = ".//html/body/header/h1/a/img")
    public static WebElement orderConfirmationGoToHomepageLabel;

    @FindBy(xpath = "./html/body/header/div[2]/div/h1/a/img")
    public static WebElement orderConfirmationAnacapriGoToHomepageLabel;
}
