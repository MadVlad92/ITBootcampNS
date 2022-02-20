package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class compareProducts {


    @FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='content']/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement clickTreeLines;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='content']/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")
    WebElement mobUiO;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='content']/div[@id='app-container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement clickMobTelefoni;
    @FindBy(xpath = "//span[contains(text(),'Poco')]")
    WebElement clickPoco;
    @FindBy(xpath = "//span[@id='compare-366351']")
    WebElement chooseF2;
    @FindBy(xpath = "//span[@id='compare-415957']")
    WebElement chooseF3;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]")
    WebElement oppArrows;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='content']/div[@id='app-container']/div[1]/div[1]/div[2]/a[1]")
    WebElement clickUporedi;


    public compareProducts(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setClickTreeLines() {
        clickTreeLines.click();
    }

    public void mobTeliUredjaji() {
        mobUiO.click();

    }

    public void mobTelefoni() {
        clickMobTelefoni.click();
    }

    public void pocoFone() {
        clickPoco.click();
    }

    public void chose2Poco() {
        chooseF2.click();
        chooseF3.click();


    }

    public void oppositeArrows() {
        oppArrows.click();
    }

    public void uporediTelefone() {
        clickUporedi.click();
    }
}



