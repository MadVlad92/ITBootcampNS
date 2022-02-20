package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginForm;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalTime;

public class TestLogin{

    private WebDriver wd;
    Faker faker;

    @DataProvider(name = "testEmail")
    public Object[][] testEmail() {
        faker = new Faker();
        faker.witcher().monster();

        return new Object[][] {
                {"email@gmail.com", faker.name().firstName(), faker.witcher().monster()},
                {"email@hotmail.com", faker.name().firstName(), faker.witcher().monster()},
                {"email@yahoo.com", faker.name().firstName(), faker.witcher().monster()},
                {"123123123123123123", faker.name().firstName(), faker.witcher().monster()},
                {"", ""}

        };
    }

    @Test(dataProvider = "testEmail")
    public void testLoginEmail(String email, String firstName, String monster) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\marko.stankovic\\itbootcamp\\materijali\\webdrivers\\chrome\\chromedriver.exe");

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wd.get("https://demoqa.com/automation-practice-form");
        wd.manage().window().maximize();

        LoginForm loginFormPage = new LoginForm(wd);

        loginFormPage.enterFirstName(firstName);
        loginFormPage.enterLastName(monster);
        loginFormPage.enterEmail(email); //email@gmail.com, email@hotmail.com, email@yahoo.com
        loginFormPage.clickOnMaleRadio();
        loginFormPage.enterMobile("123123123123");
        //loginFormPage.enterDob("20 Jan 2021");
        loginFormPage.enterSubjects("subject");
        loginFormPage.clickOnReading();
        loginFormPage.chooseFile("C:\\Users\\marko.stankovic\\itbootcamp\\materijali\\java-prezentacije\\QAITbootcampNS2021\\nedelja7\\file.txt");
        loginFormPage.enterAddress("Adresa 12");
        //loginFormPage.clickOnStateDropdown();
        //loginFormPage.clickState();
        //loginFormPage.clickOnCity();
        loginFormPage.clickSubmit();

        String text = loginFormPage.getModalText();
        Assert.assertEquals(text, "Thanks for submitting the form", "The text should be correct");
        wd.close();
    }

    public static void main(String[] args) {
        Object o = new Object();
        //o.contains();

        String x = (String) o; // explicitna konverzija tipa podataka
        x.contains("");

        Integer y = (Integer) o;
    }


    @Test
    public void jsExecutor() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\marko.stankovic\\itbootcamp\\materijali\\webdrivers\\chrome\\chromedriver.exe");

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wd.get("https://demoqa.com/automation-practice-form");
        wd.manage().window().maximize();

        JavascriptExecutor jse2 = (JavascriptExecutor) wd;
        jse2.executeScript("console.log('ZDRAVO')");
        Thread.sleep(5000);

    }


    @Test(dataProvider = "mojObezbedjivacPodataka")
    public void testDataProvider(String ime, String prezime, int brojDresa) {
        System.out.println("NAPRED ZVEZDA");
        System.out.println("Igrac " + ime + " " + prezime + " " + brojDresa);
    }

    @DataProvider(name = "mojObezbedjivacPodataka")
    public Object[][] mojiPodaci() {
        Object[][] mojiPodaci = new Object[][] {
                {"Milan", "Pavkov", 13}, //niz[0]
                {"Milan", "Borjan", 1}, //niz[1]
                {"Gejlor", "Kanga", 10} //niz[1]

        };

//        Object[][] mojiPodaci = new Object[3][3]; ovo je ekvivalento ovom gore
//        mojiPodaci[0][0] = "Milan";
//        mojiPodaci[0][1] = "Pavkov";
//        //mojiPodaci[0][2] = "13";
//
//        mojiPodaci[1][0] = "Milan";
//        mojiPodaci[1][1] = "Borjan";
//        mojiPodaci[1][2] = "1";
//
//        mojiPodaci[2][0] = "Gejlor";
//        mojiPodaci[2][1] = "Kanga";
//        mojiPodaci[2][2] = "10";



        return mojiPodaci;
    }

}
