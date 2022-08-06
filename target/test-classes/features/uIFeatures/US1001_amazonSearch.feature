@tumu
Feature: Us1001 Kullanici Amazon Sayfasinda Arama Yapar

  @nutella
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon ana sayfasinda
    Then kullanici Nutella icim arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

    @java @ikisi @sirali
  Scenario: TC02 kullanici amazonda Java aratir
      Given kullanici amazon ana sayfasinda
      Then kullanici Java icim arama yapar
      Then sonuclarin Java icerdigini test eder
      And sayfayi kapatir

    @iphone @ikisi
  Scenario: TC03 kullanici iphone aratir
      When kullanici amazon anasayfasinda
      And kullanici iphone icin arama yapar
      Then sonuclarin iphone icerdigini test eder
      And sayfayi kapatir
