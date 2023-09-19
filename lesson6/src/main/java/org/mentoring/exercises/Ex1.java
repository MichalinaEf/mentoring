package org.mentoring.exercises;

public class Ex1 {

    public static void ex1(){
        System.out.println("Treść:");
        System.out.println("Wymień i omów główne założenia programowania obiektowego - OOP. ");
        System.out.println("Odpowiedź:");
        System.out.println(
                "1. Abstrakcja - jest procesem, który dostarcza różne funkcjonalności użytkownikowi " +
                        "\npoprzez ukrywanie przed nimi szczegółów jej implementacji." +
                        "\nKlasa abstrakcyjna, to klasa, której nie można utworzyć instancji – " +
                        "\nMożna po niej dziedziczyć i dzięki temu dostarczyć metod zdefiniowanych i/lub abstrakcyjnych. " +
                        "\nDeklaruję się ją za pomocą słowa kluczowego abstract a można ją dziedziczyć poprzez użycie extends.\n" +
                        "Może, ale nie musi zawierać metody abstrakcyjne (metody bez ciała) – muszą one zostać " +
                        "\nzdefiniowane w klasach potomnych.\n" +
                        "Klasa abstrakcyjna nie może być finalna (tak samo, jak metoda abstrakcyjna)\n" +
                        "Możliwe jest dodanie w klasie abstrakcyjnej konstruktora bez lub parametryzowanego\n" +
                        "– jeżeli go nie utworzysz, klasa zawsze będzie miała konstruktor domyślny bezparametrowy." +
                "\n" +
                "\n2. Dziedziczenie - java pozwala na dziedziczenie metod oraz atrybutów z jednej klasy do drugiej " +
                "\nnp. Samochód dziedziczy po Pojazd." +
                "\n - Podklasa / klasa pochodna (dziecko) – klasa, która dziedziczy od innej " +
                "\n - Nadklasa / klasa bazowa / superklasa (rodzic) – klasa po której dziedziczymy\n" +
                "\nMożna dziedziczyć tylko po jednej klasie – Java nie wspiera wielodziedziczenia " +
                "\n(Wyjątek stanowią metody domyślne w interfejsach). " +
                        "Zaletami dziedziczenia jest to, że przejmujemy dane i zachowanie klasy bazowej," +
                        "możliwość powtórnego wykorzystania kodu oraz lepsze odzwierciedlenie rzeczywistości " +
                "\n" +
                "\n3. Enkapsulacja - Jednym z głównych celów programowania obiektowego jest podział kodu naszego programu " +
                "\nna mniejsze fragmenty opakowane w osobne klasy oraz poszczególne metody. " +
                "\nDzięki takiemu zapisowi kod jest dużo łatwiejszy w utrzymaniu w porównaniu do takiego, " +
                "\nw którym wszystko byłoby zapisane np. w jednej metodzie main. " +
                "\nCzęsto w kontekście programowania obiektowego pojawia się słowo enkapsulacja lub hermetyzacja. " +
                "\nTerminy te oznaczają to samo, czyli ukrywanie złożoności naszego systemu (szczegółów implementacji) " +
                "\nwykorzystując m.in. specyfikatory dostępu bardziej restrykcyjne niż public." +
                "\npolega na ukryciu informacji (szczegółów implementacji), które nie powinny być widoczne poza klasą " +
                "\nlub modułem. Celem jest ograniczanie bezpośredniego dostępu do poszczególnych komponentów naszej " +
                "\nimplementacji, czyli między innymi na ukrywaniu metod i atrybutów dla klas zewnętrznych. " +
                "\nHermetyzacja może być używana do ukrywania zarówno członków danych, " +
                "\njak i metod związanych z instancją klasy lub obiektu." +
                "\n" +
                "\n4. Polimorfizm - Zdolność do przyjmowania wielu form. Mechanizm ten umożliwia wykonywanie różnych " +
                        "\noperacji na różnych obiektach przy użyciu tego samego kodu. " +
                        "\nJest bardzo mocno związany z dziedziczeniem, klasami abstrakcyjnymi oraz interfejsami. " +
                        "\nPolimorfizm pomaga w ponownym wykorzystaniu kodu.\n");
    }
}
