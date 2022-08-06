Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "dataTablesUrl" sayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    Then kullanici 1 saniye bekler
    And soyisim bolumune "<lastName>" yazar
    Then kullanici 1 saniye bekler
    And position bolumune "<position>" yazar
    Then kullanici 1 saniye bekler
    And ofis bolumune "<office>" yazar
    Then kullanici 1 saniye bekler
    And extension bolumune "<extension>" yazar
    Then kullanici 1 saniye bekler
    And startDate bolumune "<startDate>" yazar
    Then kullanici 1 saniye bekler
    And salary bolumune "<salary>" yazar
    Then kullanici 1 saniye bekler
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then kullanici 1 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu test eder
    Then kullanici 1 saniye bekler
    And sayfayi kapatir

    Examples:
      |firstname|lastName|position|office|extension|startDate|salary|
      |Alim     |Alim    |qa      |ankara|UI       |2021-10-11|10000|
      |Berk     |Can     |tester  |ankara|api      |2022-05-05|11000|
      |Huseyin  |Kacmaz  |BA      |berlin|-        |2022-07-10|40000|
      |Fatih    |Sahin   |PO      |berlin|-        |2022-03-12|45000|
      |Ahmet    |Kaya    |Tester  |ankara|database |2022-06-06|11000|