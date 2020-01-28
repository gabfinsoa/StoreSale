package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class StoreSaleHomepageObjects extends Utils {
    public StoreSaleHomepageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

//    @FindBy(xpath = "./html/body/div[3]/div[2]/div/div[1]/div[2]/div[9]/form/div[1]/button/span")
//    public static WebElement pdpBuyButtonDiscount;

    @FindBy(id = "j_username")
    public static WebElement storeSaleHomePageLoginEmailEditText;

    @FindBy(id = "j_password")
    public static WebElement storeSaleHomePageLoginPasswordEditText;

    @FindBy(xpath = "./html/body/div[1]/div/div/div/form/div[3]/button")
    public static WebElement storeSaleHomePageLoginEntrarButton;

}
