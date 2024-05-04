package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.ByteBuffer;

public class CompleteData{

    WebDriver driver;
    WebDriverWait wait;
    public CompleteData(WebDriver driver) {
      this.driver = driver;
    }

    private final By SignValidationMsg = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b");

    private final By MrGenderselection = By.id("id_gender1");

    private final By NameField = By.xpath("//*[@id=\"name\"]");

    private final By Password = By.id("password");

    private final By DateOfBirthdayDay = By.id("uniform-days");

    private final By DateOfBirthdayMonth = By.id("uniform-months");

    private final By DateOfBirthdayYear = By.id("uniform-years");

    private final By SignupForNewsLetter = By.id("newsletter");

    private final By ReceiveSpecialOffersFromOurPartners = By.id("optin");

    private final By FirstName = By.id("first_name");


    private final By LastName = By.id("last_name");


    private final By Company = By.id("company");


    private final By Address = By.id("address1");

    private final By Country = By.id("country");

    private final By State = By.id("state");

    private final By City = By.id("city");

    private final By Zipcode = By.id("zipcode");

    private final By MobileNumber = By.id("mobile_number");

    private final By CreatUser = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");

    public String getValidationMessage(){
        return driver.findElement(SignValidationMsg).getText();
    }

    public void selectTitle(){
        driver.findElement(MrGenderselection).click();
    }

    public void enterPassword(){
        driver.findElement(Password).sendKeys("Password");
    }

}


