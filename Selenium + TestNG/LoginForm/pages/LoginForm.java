package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginForm {
    private WebDriver wd;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement email;

    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement male;

    @FindBy(xpath = "//input[@id='userNumber']")
    WebElement mobile;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    WebElement dob;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    WebElement subjects;

    @FindBy(xpath = "//label[contains(text(),'Reading')]")
    WebElement hobbiesReading;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    WebElement file;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement address;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]")
    WebElement stateDropdown;

    @FindBy(xpath = "//div[contains(text(),'Uttar Pradesh')]")
    WebElement state;

    @FindBy(xpath = "//div[contains(text(),'Merrut')]")
    WebElement city;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;

    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    WebElement modal;

    public LoginForm(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        this.email.sendKeys(email);
    }

    public void clickOnMaleRadio() {
        male.click();
    }

    public void enterMobile(String num) {
        mobile.sendKeys(num);
    }

    public void enterDob(String dob) {
        this.dob.clear();
        this.dob.sendKeys(dob);
    }

    public void enterSubjects(String subject) {
        this.subjects.sendKeys(subject);
    }

    public void clickOnReading() {
        hobbiesReading.click();
    }

    public void chooseFile(String pathToFile) {
        file.sendKeys(pathToFile);
    }

    public void enterAddress(String adrs) {
        address.sendKeys(adrs);
    }

    public void clickOnStateDropdown() {
        stateDropdown.click();
    }

    public void clickState() {


        submit.click();
    }

    public void clickOnCity() {
        city.click();
    }

    public void clickSubmit() {
        JavascriptExecutor jse2 = (JavascriptExecutor) wd;
        jse2.executeScript("arguments[0].scrollIntoView()", submit);
        submit.click();
    }

    public String getModalText() {
        WebElement mod = new WebDriverWait(this.wd, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='example-modal-sizes-title-lg']")));
        return mod.getText();
    }



    public List<WebElement> getHobbies() {
        return this.wd.findElements(By.className("custom-control-input"));
    }



    public void login(String firstName) {
        this.enterFirstName("");
    }

    public void login(String firstName, String lastName) {
        this.enterFirstName("");
    }
}
