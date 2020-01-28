package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class InitialSearchBarObjects extends Utils {

    public InitialSearchBarObjects(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = ".//*[@class='a4bIc']/input")
    public static WebElement searchBar;
}
