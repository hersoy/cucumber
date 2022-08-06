package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinition {
    Workbook workbook;

    @Given("kullanici excel dosyasini kullanilabilir hale getirir")
    public void kullanici_excel_dosyasini_kullanilabilir_hale_getirir() throws IOException {
        String dosyaYolu="src/test/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
         workbook= WorkbookFactory.create(fis);
    }
    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreyi_yazdirir(Integer satir, Integer sutun) {
        String istenenHucreYazisi=workbook
                .getSheet("sayfa1")
                .getRow(satir-1)
                .createCell(sutun-1)
                .toString();
        System.out.println(satir+" .nci satir "+sutun+". sutundaki bilgi :"+istenenHucreYazisi);
    }
    @Then("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskenti_jakarta_olan_ulke_ismini_yazdirir() {
        int satirSayisi=workbook.getSheet("sayfa1").getLastRowNum();
        for (int i = 0; i <satirSayisi ; i++) {

        if(workbook.getSheet("sayfa1").getRow(i).getCell(1).toString().equals("Jakarta"));{

            }
            System.out.println("Baskenti Jakarta olan ulke : "+
                    workbook.getSheet("sayfa1").getRow(i).getCell(0));
         }

    }
    @Then("Ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer ulkeSayisi) {
        int actualUlkeSayisi=workbook.getSheet("sayfa1").getLastRowNum();
        Assert.assertTrue(ulkeSayisi==actualUlkeSayisi);

    }
    @Then("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer fizikiKullanilanUlkeSayisi) {
        int actualFizikiUlkeSayisi=workbook.getSheet("sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(fizikiKullanilanUlkeSayisi==actualFizikiUlkeSayisi);
    }


}
