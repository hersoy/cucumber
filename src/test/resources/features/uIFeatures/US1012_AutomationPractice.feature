Feature: US1012 kullanici register yapabilmeli
 @auto
  Scenario: TC17 kullanici uygun datalarla register olabilmeli

    Given kullanici "automationUrl" sayfasinda
    And kullanici link butonuna tiklar
    And kullanici Create and account bolumune email adresi girer
    And kullanici Create an Account butonuna basar
    And kullanici kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici Register butonuna basar
    Then kullanici hesap olustugunu dogrular
