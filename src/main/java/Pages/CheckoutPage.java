package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver,this);}
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a")
    WebElement proceesCheckoutBtn;

    @FindBy(css = ".btn.btn-primary")
    WebElement goToCheckoutBtn;

    @FindBy(name = "confirm-addresses")
    WebElement confirmAdressBtn;


    @FindBy(name = "confirmDeliveryOption")
    WebElement confirmDeliveryBtn;

    @FindBy(id = "payment-option-1")
    WebElement payByCheckBtn;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    WebElement agreeBox;

    @FindBy(css = "#payment-confirmation [type=submit]")
    WebElement placeOrderBtn;

    public void CheckoutProcess(){
        proceesCheckoutBtn.click();
        goToCheckoutBtn.click();
        confirmAdressBtn.click();
        confirmDeliveryBtn.click();
        payByCheckBtn.click();
        agreeBox.click();
        placeOrderBtn.click();




    }
}
