import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class dodajSmestaj {
    @FindBy(xpath = "//input[@id='naziv']")
    WebElement naziv;
    @FindBy(xpath = "//input[@id='adresa']")
    WebElement adresa;
    @FindBy(xpath = "//input[@id='cena']")
    WebElement cena;
    @FindBy(xpath = "//input[@id='slika']")
    WebElement slika;
    @FindBy(xpath = "//body/app-root[1]/div[1]/div[1]/div[1]/form-dodaj-smestaj[1]/form[1]/div[5]/button[1]")
    WebElement submit;


    public dodajSmestaj(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }
    public void nazivSmestaja (){
        naziv.click();
        naziv.sendKeys("Dominator");

    }
    public void adresaSmestaja(){
        adresa.sendKeys("Defqon 1");

    }
    public void cenaSmestaja () {
        cena.sendKeys("5000");
    }
    public void slikaSmestaja() {
        slika.sendKeys("https://q-xx.bstatic.com/xdata/images/hotel/max1024x768/109500882.jpg?k=75733d51131da7c882e5eac270cf28cf10b1f4499e62af8a8efab3dd8b82deec&o=");
    }
    public void submitButton (){
        submit.click();
    }
}