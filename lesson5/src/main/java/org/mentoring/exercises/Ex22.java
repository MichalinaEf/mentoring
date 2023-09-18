package org.mentoring.exercises;

public class Ex22 {

    public static void ex22(){
        System.out.println("Treść:");
        System.out.println("Jakie wyróżniamy inne rodzaje Mapy, Setów (oprócz HashSet, HashMap) \n");
        System.out.println("Odpowiedź:");
        System.out.println("Mapy służą głównie do wygodnego wyszukiwania wartości po ich kluczach. " +
                "Mapy to osobny interfejs w Javie. " +
                "\nRodzaje map: " +
                "\nMap " +
                "\n       <- HashTable "+
                "\n       <- HashMap <- LinkedHashMap"+
                "\n       <- SortedMap <- NavigableMap <- TreeMap"+
                "\n najczęściej wykorzystywana, to HashMap, elementy w niej są w przypadkowej i nieposortowanej kolejności," +
                "\n LinkedHashMap - ten rodzaj map, w odróżnieniu od HashMap zachowuje kolejność dodawanych elementów," +
                "\n TreeMap - w odróżnieniu od HashMap obiekty są w niej sortowane zgodnie z naturalnym porządkiem kluczy lub zgodnie z komparatorem przekazanym w konstruktorze" +
                "\n HashTable - przestarzała wersja HashMapy, nie możemy przechowywać ani wartości, ani kluczy, które są nullami. W kolejnych wersjach Javy planowane jest oznaczenie tej klasy jako @Deprecated, aby wskazać, że nie powinno się jej już używać.\n" +
                "\n" +
                "\nZbiory (Set) jest interfejsem implementującym interfejs Collection, wg definicji jest to nieuporządkowany zestaw różnych obiektów" +
                "\nCollection " +
                "\n             <-Set" +
                "\n                    <-HashSet <-LinkedHashSet" +
                "\n                    <- SortedSet <- NavigableSet <- TreeSet" +
                "\nHashSet jest zbiorem nieuporządkowanym i nieposortowanym, nie posiada też nawet specjalnych metod takich jak first(), czy last(), " +
                "\nbo nie mamy żadnej gwarancji co do kolejności w jakiej przechowywane są obiekty. Jedyną, ale dużą jego zaletą jest to, " +
                "\nże operacje dodawania, usuwania i wyszukiwania są w niej bardzo szybkie. Zbiór typu HashSet pozwala także na umieszczenie wartości null." +
                "\nLinkedHashSet w odróżnieniu od HashSet posiadają wewnętrzną reprezentację w postaci listy wiązanej," +
                "\n dzięki czemu dodając kolejne elementy do zbioru są one w tej kolejności zachowane i można później w ten sposób po nich iterować." +
                "\nTreeSet są to zbiory uporządkowane. Dodawane elemnty są automatycznie ustawione w naturalnym porządku" +
                "\n(lub zdefiniowanym przez komparator)"
        );

    }
}
