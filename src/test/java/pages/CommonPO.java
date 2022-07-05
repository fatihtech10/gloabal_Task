package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CommonPO {

    public CommonPO() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "layered_id_attribute_group_1")
    public WebElement sizeS;

    @FindBy(id = "layered_id_attribute_group_3")
    public WebElement sizeL;

    @FindBy(id = "layered_id_attribute_group_2")
    public WebElement sizeM;

    @FindBy(id = "layered_id_attribute_group_13")
    public WebElement colorOrange;

    @FindBy(id = "layered_id_attribute_group_14")
    public WebElement colorBlue;

    @FindBy(id ="layered_id_attribute_group_7")
    public WebElement colorBeige;

    @FindBy(xpath = "//a[@class=\"product-name\" and @itemprop=\"url\"]")
    public List<WebElement> productToAdd;

    @FindBy(xpath = "//*[@title='Add to cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//a[@title=\"View my shopping cart\"]")
    public WebElement shoppingCartBtn;

    @FindBy(css =".cross")
    public WebElement closeBtn;

    @FindBy(id = "total_price_container")
    public WebElement totalPriceContainer;
}

