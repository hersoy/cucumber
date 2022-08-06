package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationStepDefinition {

    AutomationPage automationPage=new AutomationPage();
    Faker faker=new Faker();
    @Given("kullanici link butonuna tiklar")
    public void kullanici_link_butonuna_tiklar() {
        automationPage.singInButton.click();

    }
    @Given("kullanici Create and account bolumune email adresi girer")
    public void kullanici_create_and_account_bölümüne_email_adresi_girer() {
        automationPage.emailTextBox.sendKeys(faker.internet().emailAddress());

    }
    @Given("kullanici Create an Account butonuna basar")
    public void kullanici_create_an_account_butonuna_basar() {
        automationPage.createAccountButton.click();

    }
    @Given("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullanici_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(automationPage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("Ocak")
                .sendKeys(Keys.TAB)
                .sendKeys("2001")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys("Alaska")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("United Stated")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys("Alaska").perform();

    }
    @Given("kullanici Register butonuna basar")
    public void kullanici_register_butonuna_basar() {
    automationPage.registerButton.click();

    }
    @Then("kullanici hesap olustugunu dogrular")
    public void kullanici_hesap_olustugunu_dogrular() {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());

    }


}
