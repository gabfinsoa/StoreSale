package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class PdpProductOptionsObjects extends Utils {

    public PdpProductOptionsObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = ".//div[15]/form/div/button/span")
    public static WebElement pdpBuyButton;

    @FindBy(xpath = "./html/body/div[3]/div[2]/div/div[1]/div[2]/div[9]/form/div[1]/button/span")
    public static WebElement pdpBuyButtonDiscount;


    @FindBy(xpath = ".//*[@class='arz-product-right']/div[6]/ul/li/a/span")
    public static WebElement pdpGrade33_4Button;

    @FindBy(xpath = ".//*[@class='arz-product-right']/div[10]/ul/li[7]/a/span")
    public static WebElement pdpGrade39Button;

    @FindBy(xpath = "./html/body/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[1]/div/ul/li[7]/label")
    public static WebElement pdpAnacapriGrade39Button;

    @FindBy(id = "btn-add-to-cart")
    public static WebElement pdpAnacapriBuyButton;

    @FindBy(xpath = "./html/body/div[2]/div[3]/a")
    public static WebElement pdpAnacapriCloseAdvisor;



}
