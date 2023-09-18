package org.mentoring.exercises;

import java.util.HashMap;
import java.util.Map;

public class Ex16 {

    public static void ex16(){
        System.out.println("Treść:");
        System.out.println("Utwórz mapę, która reprezentować będzie zestaw pięciu unikalnych imion " +
                "wraz z przypisanym do nich numerem PESEL (przechowywanym w formie Stringa). " +
                "Następnie:\n" +
                "- Sprawdź, czy w mapie znajduje się imię Anna. \n" +
                "- Wydrukuj stosowny komunikat, w zależności od tego, czy imię jest obecne w mapie.\n" +
                "- Sprawdź, czy w mapie znajduje się w wartość, która rozpoczyna się znakiem: “9”. " +
                "Wykorzystaj m.in metodę .startsWith()\n" +
                "- Usuń 2 dowolne pary klucz : wartość z mapy\n" +
                "Zweryfikuj rozmiar mapy i wyświetl komunikat “The map’s size is correct.”, " +
                "jeśli rozmiar listy będzie wynosił 3. \n" +
                "Spróbuj pobrać z mapy wartość spod klucza “Euzebiusz”. " +
                "Jeśli taki klucz nie znajduje się w Twojej mapie, to niech operacja pobierania klucza zwróci tekst: " +
                "“No such name!”.\n" +
                "Sprawdź, czy mapa jest pusta. Jeśli tak - wyświetl komunikat: “Nothing to do here!”, " +
                "a jeśli zawiera jakiekolwiek elementy - wyświetl informację o jej rozmiarze.\n");
        System.out.println("Odpowiedź:");
        ex16Solution();
    }

    private static void ex16Solution() {

        Map<String,String> people = new HashMap<>();
        //String pesel; key
        //String name; value
        people.put("Karolina","8809266748");
        people.put("Jan","78102178034");
        people.put("Michalina","91072456893");
        people.put("Patryk","93032966889");
        people.put("Anna","56123045678");

        System.out.println(people);

        String name = "Anna";
        String number = "9";
        findName(people, name);  
        findPesel(people,number);
        people.remove("Karolina");
        people.remove("Anna");
        mapSize(people);
        findName(people,"Euzebiusz");
        contentOfTheMap(people);
        people.clear();
        contentOfTheMap(people);


    }

    private static void contentOfTheMap(Map<String, String> people) {
        if(people.isEmpty()){
            System.out.println("Nothing to do here!");
        } else
            System.out.println("Size of the map: " + people.size());
    }

    private static void mapSize(Map<String, String> people) {
        if(people.size() == 3)
            System.out.println("The map’s size is correct.");
        else
            System.out.println("Something went wrong, the size is equal: " + people.size());
    }

    private static void findPesel(Map<String, String> people, String number) {
        int valueStartsWithNumebr = 0;
        for (String value: people.values()) {
            if (value.startsWith(number)) {
                valueStartsWithNumebr++;
            }
        }

            if (valueStartsWithNumebr>0){
                System.out.println("There is a person born in the " + number + "0's");
            }
            else
                System.out.println("There is no person born in the " + number + "0's");


    }

    private static void findName(Map<String, String> people, String name) {
        if(people.containsKey(name))
            System.out.println("There is a person named \""+ name+ "\" in the map");
        else
            System.out.println("No such name \"" + name + "\"!");
    }


}
