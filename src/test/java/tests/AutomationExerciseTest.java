package tests;

import base.SeleniumBase;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;


public class AutomationExerciseTest extends SeleniumBase {
    AutomationExercisePage automationExercisePage;

    @Test(priority = 0)
    public void test1() {
        automationExercisePage = new AutomationExercisePage(driver);
        automationExercisePage.checkTitle("Automation Exercise");
        automationExercisePage.clickOnSignUp();
        automationExercisePage.verifyNewUser("New User Signup!");
        automationExercisePage.inputName1("Tatev");
        automationExercisePage.inputEmail("aaa@gmail.com");
        automationExercisePage.clickSignUpButton();
        automationExercisePage.verifyEnterInform("ENTER ACCOUNT INFORMATION");
        automationExercisePage.chooseGender();
        automationExercisePage.inputName2("Tatev");
        automationExercisePage.inputPassword("admin");
        automationExercisePage.selectDays();
        automationExercisePage.selectMonths();
        automationExercisePage.selectYears();
        automationExercisePage.checkNewsletter();
        automationExercisePage.checkOffers();
        automationExercisePage.inputFirstName("Tatev");
        automationExercisePage.inputLastName("Tadevosyan");
        automationExercisePage.inputCompany("ACA");
        automationExercisePage.inputAddress1("address1");
        automationExercisePage.inputAddress2("address2");
        automationExercisePage.selectCountry();
        automationExercisePage.inputState("Texas");
        automationExercisePage.inputCity("Ostin");
        automationExercisePage.inputZipcode("2305");
        automationExercisePage.inputMobileNumber("+37494100643");
        automationExercisePage.clickCreateAccount();
        automationExercisePage.checkIfAccountIsCreated("ACCOUNT CREATED!");
        automationExercisePage.clickContinue();
        automationExercisePage.checkLoggedIn("Tatev");
        automationExercisePage.deleteUser();
    }
}
