Feature: US1011 web tablasundaki istenen sutunu yazdirma
  @guru
  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" sayfasinda
    And kullanici 3 saniye bekler
    And cookies sorulursa kabul eder
    And "Prev Close (Rs)", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir