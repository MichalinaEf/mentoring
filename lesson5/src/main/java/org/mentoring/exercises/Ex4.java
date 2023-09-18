package org.mentoring.exercises;

public class Ex4 {

    public static void ex4(){
        System.out.println("Treść:");
        System.out.println("Mamy następującą definicję tablicy:\n" +
                "String[] names = {\"Kacper\", \"John\", \"Szymon\", \"Adam\"};" +
                "\nWskaż niepoprawne operacje przeprowadzone na takiej tablicy:\n" +
                "names[4] = \"Joanna\";\n" +
                "names[-1] = \"Jonathan\";\n" +
                "names[1] = \"Johnny\";\n" +
                "names[2] = 3;\n");
        System.out.println("Odpowiedź:");
        System.out.println("names[4] = \"Joanna\";  //nie ma indeksu 4, tablica ma pojemność 4, należałoby ją na początku powiększyć\n" +
                "names[-1] = \"Jonathan\";  //nie ma ujemnych indeksów\n" +
                "names[2] = 3;  //tablica przechowuje wartości typu String, nie można dodać int n\"");
    }
}
