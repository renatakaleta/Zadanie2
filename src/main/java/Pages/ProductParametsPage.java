package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductParametsPage {
    public ProductParametsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        sizeSelector = new Select(driver.findElement(By.id("group_1")));
    }

    @FindBy(id = "group_1")
    Select sizeSelector;
    @FindBy(id = "quantity_wanted")
    WebElement quantityInputBox;

    @FindBy(css =".btn.btn-primary.add-to-cart")
    WebElement addToCartBtn;

    public void choseProductParamets() {
        sizeSelector.selectByValue("2");
        quantityInputBox.sendKeys(Keys.DELETE, "5");
        addToCartBtn.click();


    }
}

