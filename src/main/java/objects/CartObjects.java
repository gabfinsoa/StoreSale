package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CartObjects extends Utils {
    public CartObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

//    @FindBy(xpath = ".//*[@class='cart-resume__actions']/button/span")
//    public static WebElement cartBuyButton;


    @FindBy(xpath = ".//html/body/main/section[1]/section[2]/div/div/button/span")
    public static WebElement cartBuyButton;

    @FindBy(xpath = ".//*[@class='icon-close-black']")
    public static WebElement cartDeleteItemCartButton;

//    @FindBy(xpath = "./html/body/div[2]/section/div/section[2]/div/div[2]/button")
//    public static WebElement cartAnacapriBuyButton;

    @FindBy(xpath = "./html/body/div[5]/section/div/section[2]/div/div[2]/button")
    public static WebElement cartAnacapriBuyButton;



}
