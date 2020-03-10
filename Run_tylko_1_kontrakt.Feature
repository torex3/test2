Feature: APi Fra only one contract


    @regression
    Scenario: Tworzenie prospektu i kontraktu
       Given utworzenie prospektu
       When Status prospekt
       Then obsługa kontraktu status