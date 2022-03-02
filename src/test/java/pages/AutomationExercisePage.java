package pages;


import base.SeleniumBase;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class AutomationExercisePage extends SeleniumBase {
    WebDriver driver;

    @FindBy(css = "a[href='/login']")
    WebElement signUpBtn;

    @FindBy(css = "#form > div > div > div:nth-child(3) > div > h2")
    WebElement newUser;

    @FindBy(name = "name")
    WebElement name;

    @FindBy(css = "input[data-qa='signup-email']")
    WebElement email;

    @FindBy(css = "button[data-qa='signup-button']")
    WebElement signUpButton;

    @FindBy(css = "h2[class='title text-center']")
    WebElement enterInform;

    @FindBy(id = "id_gender2")
    WebElement gender;

    @FindBy(id = "name")
    WebElement inputName;

    @FindBy(id = "password")
    WebElement pass;

    @FindBy(id = "days")
    WebElement days;

    @FindBy(id = "months")
    WebElement months;

    @FindBy(id = "years")
    WebElement years;

    @FindBy(xpath = "//*[@id='newsletter']")
    WebElement newsletter;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/form/div[7]/label")
    WebElement offers;

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "address1")
    WebElement address1;

    @FindBy(id = "address2")
    WebElement address2;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "state")
    WebElement state;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "zipcode")
    WebElement zipcode;

    @FindBy(id = "mobile_number")
    WebElement mobileNumber;

    @FindBy(css = "button[data-qa='create-account']")
    WebElement createAccountBtn;

    @FindBy(css = "h2[data-qa='account-created']")
    WebElement accountCreated;

    @FindBy(css = "a[class='btn btn-primary']")
    WebElement continueBtn;

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[9]/a/b")
    WebElement user;

    @FindBy(css = "a[href='/delete_account']")
    WebElement deleteUser;

    public AutomationExercisePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkTitle(String title) {
        Assert.assertEquals(driver.getTitle(), title, "Title not match!!!");
    }

    public void clickOnSignUp() {
        signUpBtn.click();
    }

    public void verifyNewUser(String text) {
        Assert.assertEquals(newUser.getText(), text, "Error!");
    }

    public void inputName1(String name1) {
        name.sendKeys(name1);
    }

    public void inputEmail(String email_) {
        email.sendKeys(email_);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void verifyEnterInform(String enter) {
        Assert.assertEquals(enterInform.getText(), enter, "Error!");
    }

    public void chooseGender() {
        gender.click();
    }

    public void inputName2(String name2) {
        inputName.clear();
        inputName.sendKeys(name2);
    }

    public void inputPassword(String password) {
        pass.sendKeys(password);
    }

    public void selectDays() {
        Select select = new Select(days);
        select.selectByVisibleText("24");
    }

    public void selectMonths() {
        Select select = new Select(months);
        select.selectByVisibleText("November");
    }

    public void selectYears() {
        Select select = new Select(years);
        select.selectByVisibleText("1997");
    }

    public void checkNewsletter() {
        try {
            if (newsletter.isSelected() == false) {
                newsletter.click();
            }
        } catch (ElementNotInteractableException e) {
            e.getStackTrace();
        }

    }

    public void checkOffers() {
        try {
            if (offers.isSelected() == false) {
                offers.click();
            }
        } catch (ElementNotInteractableException e) {
            e.getStackTrace();
        }
    }

    public void inputFirstName(String fName) {
        firstName.sendKeys(fName);
    }

    public void inputLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void inputCompany(String comp) {
        company.sendKeys(comp);
    }

    public void inputAddress1(String address1_) {
        address1.sendKeys(address1_);
    }

    public void inputAddress2(String address2_) {
        address2.sendKeys(address2_);
    }

    public void selectCountry() {
        Select select = new Select(country);
        select.selectByVisibleText("United States");
    }

    public void inputState(String state_) {
        state.sendKeys(state_);
    }

    public void inputCity(String city_) {
        city.sendKeys(city_);
    }

    public void inputZipcode(String zipcode_) {
        zipcode.sendKeys(zipcode_);
    }

    public void inputMobileNumber(String number) {
        mobileNumber.sendKeys(number);
    }

    public void clickCreateAccount() {
        createAccountBtn.click();
    }

    public void checkIfAccountIsCreated(String enter) {
        Assert.assertEquals(accountCreated.getText(), enter, "Error!");

    }

    public void clickContinue() {
        continueBtn.click();
    }

    public void checkLoggedIn(String enter) {
        Assert.assertEquals(user.getText(), enter, "Error!");

    }

    public void deleteUser() {
        deleteUser.click();
    }

}
