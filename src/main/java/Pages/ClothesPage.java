package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothesPage {
    public ClothesPage(WebDriver driver) {PageFactory.initElements(driver,this);}

    @FindBy(id = "category-3")
    WebElement clothesBtn;


    @FindBy(css = "h2.h3.product-title")
   WebElement itemBtn;

    public void goToSelectedItem() {

        clothesBtn.click();
        itemBtn.click();
    }
}
