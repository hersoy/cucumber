
Feature: US1002 Kullanici ortak adimlari Backgraund ile calistirir

  Background: ortak adim
    Given kullanici amazon ana sayfasinda

    Scenario: TC04 amazon nutella arama
      And kullanici Nutella icim arama yapar
      Then sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir

  @paralel1
    Scenario: TC05 amazon java arama
      And kullanici Java icim arama yapar
      Then sonuclarin Java icerdigini test eder
      And sayfayi kapatir