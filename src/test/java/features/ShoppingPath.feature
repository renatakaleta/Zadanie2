Feature: Poprawna sciezka zakupowa
  Scenario Outline: Wybranie produktu jako zalogowany uzytkownik oraz wybor platnosci
    Given Uzytkownik znajduje sie na stronie do logowania aplikacji
    When Uzytkownik wpisuje poprawny adres "<email>" oraz "<haslo>" po czym zatwierdza logowanie
    And Uzytkownik przenosi sie do dzialu Clothes oraz wybiera Hummingbird Printed Sweater
    And Uzytkownik dodaje do koszyka 5 sztuk rozmiaru M
    And Uzytkownik przechodzi do checkoutu, potwiedza adres, sposob odbioru, platnosci i potwierdza zamowienie
    Then Wykonuje screena z potwierdzeniem zamowienia i kwota
    Examples:
      |email|haslo|
      |bardzolosowedane@wp.pl|bardzolosowehaslo123!|