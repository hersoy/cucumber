Feature: test api

  @RoomGet
  Scenario: RoomPost api with GET request / Room api testi

    Given kullanici roomlar icin get request yapar
    And kullanici gelen room datayi deserialize eder
    Then kullanici room datasini validate eder
