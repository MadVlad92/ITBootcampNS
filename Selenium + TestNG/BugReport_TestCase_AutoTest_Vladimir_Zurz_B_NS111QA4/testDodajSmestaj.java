import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.PropReader;

import java.io.IOException;
import java.time.Duration;

public class testDodajSmestaj {

    private WebDriver wd;

    @BeforeClass
    public void init() throws IOException {
        System.setProperty("Chromedriver.chrome.driver",
                "\"D:\\QA\\SELENIUM\\chromedriver.exe\"");
        PropReader.fetchProperty("DRIVER.CHROME.PATH");

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // @AfterClass
    // public void zatvoriWebDriver() {
    //    System.out.println("Kraj Testa.");
    //    wd.close();
    // }

    /**
     * This test tests contact us happy path.
     * <p>
     * Test steps:
     * 1. Go to https://gigatron.rs
     * 2.Click on three stripes.
     * 3.Click on 'Mobilni uredjaji i oprema'.
     * 4.Click on 'Mobilni telefoni'.
     * 5.CLick on 'Poco' from - Phones selection
     * 6.Choose F2 and F3 for comparison.
     * 7.CLick on two opposite arrows in upper righ corner of screen.
     * 8.Click on box - Uporedi
     * 9.Exit program.
     */
    @Test
    public void dodajSmestaj() {
        System.out.println("Go to https://it-255-dz-06-andjela-bojic3972.vercel.app/");
        wd.get("https://it-255-dz-06-andjela-bojic3972.vercel.app/");
        wd.manage().window().maximize();

        Assert.assertEquals(wd.getCurrentUrl(), "https://it-255-dz-06-andjela-bojic3972.vercel.app/",
                "The current url should be equal to https://it-255-dz-06-andjela-bojic3972.vercel.app/");

        dodajSmestaj dodajSmestaj = new dodajSmestaj(wd);

        dodajSmestaj.nazivSmestaja();
        System.out.println("Assert that message is present");
        Assert.assertEquals("Ime je obavezno",
                "Ime je obavezno");

        dodajSmestaj.adresaSmestaja();
        System.out.println("Assert that message is present");
        Assert.assertEquals("Adresa je obavezna",
                "Adresa je obavezna");

        dodajSmestaj.cenaSmestaja();
        Assert.assertEquals("Cena mora biti broj",
                "Cena mora biti broj");

        dodajSmestaj.slikaSmestaja();
        Assert.assertEquals("Slika mora biti link",
                "Slika mora biti link");

        dodajSmestaj.submitButton();

        System.out.println("Assert that message is present");
        Assert.assertEquals("There is not confirmition window",
                "The message should be equal to 'You sucsesfully added your 'smestaj' ");
    }


}