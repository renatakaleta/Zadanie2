package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver,this);}
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a")
    WebElement ProceesCheckoutBtn;

    @FindBy(css = ".btn.btn-primary")
    WebElement GoToCheckoutBtn;

    @FindBy(name = "confirm-addresses")
    WebElement ConfirmAdressBtn;


    @FindBy(name = "confirmDeliveryOption")
    WebElement ConfirmDeliveryBtn;

    @FindBy(id = "payment-option-1")
    WebElement PayByCheckBtn;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    WebElement AgreeBox;

    @FindBy(css = "#payment-confirmation [type=submit]")
    WebElement PlaceOrderBtn;

    public void CheckoutProcess(){
        ProceesCheckoutBtn.click();
        GoToCheckoutBtn.click();
        ConfirmAdressBtn.click();
        ConfirmDeliveryBtn.click();
        PayByCheckBtn.click();
        AgreeBox.click();
        PlaceOrderBtn.click();




    }
}
