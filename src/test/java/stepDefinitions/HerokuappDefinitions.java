package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPages;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HerokuappDefinitions {

    HerokuappPages herokuappPages=new HerokuappPages();

    @Given("add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPages.addButonu.click();

    }
    @Then("Delete butonuna gorunur oluncaya kadar bekler")
    public void delete_butonuna_gorunur_oluncaya_kadar_bekler() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(herokuappPages.deleteButonu));
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPages.deleteButonu.isDisplayed());

    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuappPages.deleteButonu.click();

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        Assert.assertTrue(herokuappPages.deleteElementsList.isEmpty());

        }

    }


