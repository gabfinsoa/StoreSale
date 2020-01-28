package actions;

import objects.InitialSearchBarObjects;
import org.openqa.selenium.WebDriver;

public class InitialSearchBarActions extends InitialSearchBarObjects {

    public InitialSearchBarActions(WebDriver driver) {
        super(driver);
    }

    public void doSearch(){
//        clickElement(searchBar);
        sendKeysElement(searchBar,"pesquisa");
    }
}
