package Steps;

import Pages.AuthenticationPage;
import Pages.CheckoutPage;
import Pages.ClothesPage;
import Pages.ProductParametsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class ShoppingPathSteps {

    public static WebDriver driver;
    public String url = "https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account";

    @Given("Uzytkownik znajduje sie na stronie do logowania aplikacji")
    public void setApp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
    }
    @When("Uzytkownik wpisuje poprawny adres {string} oraz {string} po czym zatwierdza logowanie")
    public void logIntoApp(String email, String haslo) {
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.LogIntoApp(email, haslo);
    }
    @And("Uzytkownik przenosi sie do dzialu Clothes oraz wybiera Hummingbird Printed Sweater")
        public void goToSelectedItem(){
            ClothesPage clothesPage = new ClothesPage(driver);
            clothesPage.goToSelectedItem();

        }
        @And("Uzytkownik dodaje do koszyka 5 sztuk rozmiaru M")
        public void choseProductParamets() {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            ProductParametsPage productParametsPage = new ProductParametsPage(driver);
            productParametsPage.choseProductParamets();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        }
        @And("Uzytkownik przechodzi do checkoutu, potwiedza adres, sposob odbioru, platnosci i potwierdza zamowienie")
        public void CheckoutProcess(){
          CheckoutPage checkoutPage = new CheckoutPage(driver);
          checkoutPage.CheckoutProcess();
        }
        @Then("Wykonuje screena z potwierdzeniem zamowienia i kwota")
        public void Screen(){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String path = "./target/screenshots/" + scrFile.getName();
            scrFile.renameTo(new File(path));
        }



}
