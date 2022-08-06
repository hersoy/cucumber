package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {
    public HMCPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement login;

    @FindBy(xpath ="//input[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath ="//input[@id='Password']")
    public WebElement password;

    @FindBy(id="btnSubmit")
    public WebElement LoginGiris;

    @FindBy(xpath = "(//*[text()='ListOfUsers'])[2]")
    public WebElement sonucYazıElementi;

    public WebElement hotelList;
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@name='Code']")
    public WebElement codeKutusu;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButonu;

    @FindBy(xpath = "//select[@class='form-control input-lg required']")
    public WebElement ddm;

}

