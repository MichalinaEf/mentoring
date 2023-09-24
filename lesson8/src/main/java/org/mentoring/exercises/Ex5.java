package org.mentoring.exercises;

public class Ex5 {

    public static void ex5(){
        System.out.println("Treść:");
        System.out.println("Czym są klasy finalne i jakie ograniczenie kładą one na programiście?\n" +
                "Czym są pola finalne i jakie ograniczenie kładą one na programiście?\n" +
                "Czym są metody finalne i jakie ograniczenie kładą one na programiście?\n");
        System.out.println("Odpowiedź:");
        System.out.println("" +
                "1. Klasy finalne:\n" +
                "To klasy, których nie można modyfikować i po których nie można tym samym dziedziczyć.\n" +
                "To może być przydatne w przypadku klasy, która reprezentuje pewną niezmienność \n" +
                "lub fundamentalny komponent, który nie powinien być naruszany. \n" +
                "2. Pola finalne:\n" +
                "pole oznaczone jako final to pole, które nie może zmieniać swojej wartości po raz pierwszy przypisanej do niego\n" +
                "Jeśli pole jest publiczne, final pozwala na udostępnienie dostępu do stałych wartości, \n" +
                "jednocześnie zabezpieczając je przed zmianami przez inne klasy.\n" +
                " Oznacza to, że pole to będzie zachowywać się jak stała w kontekście obiektu klasy, w której się znajduje. \n" +
                "Pola final często są używane do przechowywania stałych lub niezmiennych danych, \n" +
                "takich jak stałe matematyczne, identyfikatory obiektów itp" +
                "3. Metody finalne:\n" +
                "Metod finalny nie można przesłonić \"override\" w podklasach\n" +
                "Ograniczenia wynikające z użycia metod final to głównie brak możliwości przesłonięcia " +
                "\nich w klasach pochodnych oraz konieczność zachowania niezmienności ich implementacji. " +
                "\nMetody final są używane tam, gdzie pewne zachowanie powinno pozostać stałe i niezmienne, " +
                "\nniezależnie od dziedziczenia.");
    }
}
