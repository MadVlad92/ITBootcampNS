package pages.file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.PropReader;
import pages.compareProducts;

import java.io.IOException;
import java.time.Duration;

public class testCompareProducts {

    private WebDriver wd;

    @BeforeClass
    public void init() throws IOException {
        System.setProperty("Chromedriver.chrome.driver",
                "\"D:\\QA\\SELENIUM\\chromedriver.exe\"");
        PropReader.fetchProperty("WEBDRIVER.CHROME.PATH");

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterClass
    public void zatvoriWebDriver() {
        wd.close();
    }

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
    public void compareProductsHappyPath() throws InterruptedException {
        System.out.println("Go to https://gigatron.rs/");
        wd.get("https://gigatron.rs/");
        wd.manage().window().maximize();

        Assert.assertEquals(wd.getCurrentUrl(), "https://gigatron.rs/",
                "The current url should be equal to https://gigatron.rs/");

        compareProducts compareProducts = new compareProducts(wd);

        System.out.println("Click on three stripes");
        compareProducts.setClickTreeLines();

        System.out.println("Click on 'Mobilni uredjaji i oprema' ");
        compareProducts.mobTeliUredjaji();

        System.out.println("Click on 'Mobilni telefoni'");
        compareProducts.mobTelefoni();

        System.out.println("CLick on 'Poco' from - Phones selection");
        compareProducts.pocoFone();


        System.out.println("Choose F2 and F3 for comparison.");
        compareProducts.chose2Poco();
        Thread.sleep(2000);

        System.out.println("Click on opposite arrows in upper right corner.");
        compareProducts.oppositeArrows();
        Thread.sleep(2000);

        System.out.println("Click on box - UPOREDI");
        compareProducts.uporediTelefone();
        Thread.sleep(2000);


    }
}