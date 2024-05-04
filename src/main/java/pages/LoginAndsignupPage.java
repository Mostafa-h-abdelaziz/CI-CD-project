package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginAndsignupPage {

    WebDriver driver;
    WebDriverWait wait;
    public LoginAndsignupPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By closeAd = By.id("dismiss-button");

    private final By signUpToggle = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");

    private final By nameTextFieldOfSignUp = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");

    private final By passwordTextFieldOfSignUp = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");

    private final By signUpButton = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

    public void enterUsername (String username){
        driver.findElement(nameTextFieldOfSignUp).click();
        try {
            wait= new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(nameTextFieldOfSignUp)));
            driver.findElement(nameTextFieldOfSignUp).sendKeys(username);
        }
        catch (org.openqa.selenium.NoSuchFrameException e){
            driver.findElement(closeAd).click();
            wait= new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(closeAd)));
            driver.findElement(closeAd).click();
        }
    }
    public void enterEmail(String email){
        driver.findElement(passwordTextFieldOfSignUp).sendKeys(email);
    }

    public CompleteData submitSignUp(){
        driver.findElement(signUpButton).click();
        return new CompleteData (driver);
    }

    public void validationOfSignupPage(){
        driver.findElement(signUpToggle).getText();
    }
}
