Feature: US1010 herokuapp Delete testi


  Scenario: TC15 herokuapp'tan delete butonu calismali
    Given kullanici "herokuappUrl" sayfasinda
    And add Element butonuna basar
    Then Delete butonuna gorunur oluncaya kadar bekler
    Then Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basar
    Then Delete butonunun gorunmedigini test eder
    And sayfayi kapatir


