package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class HomepageObjects extends Utils {


    public HomepageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = ".//html/body/header[1]/section/ul/li[3]/a")
    public static WebElement homepageExitButton;

    @FindBy(xpath = "./html/body/header/div[3]/div[2]/a/img")
    public static WebElement homepageAnacapriOpenMyAccountButton;

    @FindBy(xpath = "./html/body/div[2]/section/div/div[2]/div[1]/ul/li[9]/a")
    public static WebElement homepageAnacapriMyAccountExitButton;

}
