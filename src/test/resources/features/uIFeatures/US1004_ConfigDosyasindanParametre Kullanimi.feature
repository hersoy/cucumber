Feature: US1004 kullanici parametre ile configuration file'ile kullanabilmeli


Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" sayfasinda
    Then kullanici 3 saniye bekler
    And url'nin "Ramazon" icerdigini test eder
    Then sayfayi kapatir
