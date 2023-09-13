package org.mentoring.exercises;

public class Ex9 {
    public static void ex9(){
        System.out.println("Treść: ");
        System.out.println("Jakie nowości pojawiły się w Javie wersji 18?");

        System.out.println("Odpowiedź:");
        System.out.println("JEP 400 ustanawia UTF-8 kodowaniem domyślnym, \n" +
                "JEP 408 to narzędzie wiersza poleceń i API do uruchamiania uproszczonego serwera WWW (bez plików dynamicznych), \n" +
                "JEP 413 dodaje znacznik @snippet do dokumentacji JavaDoc, " +
                "co ułatwia umieszczanie przykładowych kodów źródłowych w dokumentacji API,\n" +
                "JEP 416 wprowadza obsługę metod jako podstawowy mechanizm odzwierciedlania " +
                "– dla redukcji kosztów związanych z interfejsami API java.lang.reflect i java.lang.invoke, \n" +
                "JEP 417 (testowo) pozwala lepiej wykorzystywać architekturę procesorów CPU " +
                "– Vector API zapewnia skalowalne rozszerzenia wektorowe,\n" +
                "JEP 418 pozwala metodzie java.net.InetAddress korzystać z identyfikatorów " +
                "innych niż te wbudowane w platformę, poprzez definicję SPI do identyfikacji nazw i adresów hosta, \n" +
                "JEP 419 (testowo) wprowadza Foreign Function and Memory API " +
                "i tym samym umożliwia programistom współpracę z kodem i danymi spoza środowiska uruchomieniowego Java,\n" +
                "JEP 420 (testowo) pozwala na testowanie wyrażeń względem wielu wzorów, " +
                "poprzez dopasowywanie wzorców dla wyrażeń i instrukcji przełączania wraz z rozszerzeniami języka\n");
    }


}
