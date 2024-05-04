package SignUp;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CompleteData;
import pages.LoginAndsignupPage;

import static org.testng.Assert.assertTrue;

public class signUpTests extends BaseTests {

    @Test(priority = 1)
    public void SignUp() {

        LoginAndsignupPage loginAndsignupPage = homePage.clickOnLoginAndSignupPage();
        loginAndsignupPage.enterUsername("username");
        loginAndsignupPage.enterEmail("email");
        loginAndsignupPage.submitSignUp();
        CompleteData completeData = loginAndsignupPage.submitSignUp();
        completeData.getValidationMessage();
        String actualResult = completeData.getValidationMessage();
        String expectedResult = "ENTER ACCOUNT INFORMATION";
        assertTrue(actualResult.contains(expectedResult));

    }



}
