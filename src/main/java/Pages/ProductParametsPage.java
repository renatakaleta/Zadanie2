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
        SizeSelector = new Select(driver.findElement(By.id("group_1")));
    }

    @FindBy(id = "group_1")
    Select SizeSelector;
    @FindBy(id = "quantity_wanted")
    WebElement QuantityInputBox;

    @FindBy(css =".btn.btn-primary.add-to-cart")
    WebElement AddToCartBtn;

    public void choseProductParamets() {
        SizeSelector.selectByValue("2");
        QuantityInputBox.sendKeys(Keys.DELETE, "5");
        AddToCartBtn.click();


    }
}

