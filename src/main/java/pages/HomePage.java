package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By loginPlusSignup = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a/i");

    public LoginAndsignupPage clickOnLoginAndSignupPage(){
        driver.findElement(loginPlusSignup).click();
        return new LoginAndsignupPage(driver);
    }


}



