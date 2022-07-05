package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li/a[@title='Dresses']")
    public WebElement dressesBtn;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li/a[@title=\"T-shirts\"]")
    public WebElement t_shirtsBtn;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li/ul/li/a[@title='Evening Dresses']")
    public WebElement eveningDressBtn;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li/ul/li/a[@title='Summer Dresses']")
    public WebElement summerDressBtn;
}
