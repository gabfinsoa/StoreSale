package actions;

import objects.HomepageObjects;
import org.openqa.selenium.WebDriver;

public class HomepageActions extends HomepageObjects {
    public HomepageActions(WebDriver driver){
        super(driver);
    }


    public void doClickExitButtonHomepageActions(){
        waitElement(homepageExitButton);
        clickElement(homepageExitButton);
    }

    public void doAnacapriClickExitButtonHomepageActions(){
        waitElement(homepageAnacapriOpenMyAccountButton);
        clickElement(homepageAnacapriOpenMyAccountButton);
        waitElement(homepageAnacapriMyAccountExitButton);
        clickElement(homepageAnacapriMyAccountExitButton);
    }

//    public void doAnacapriClick

}
