package org.mentoring.exercises;

import org.mentoring.exercises.exercise5.Debenture;
import org.mentoring.exercises.exercise5.Securities;
import org.mentoring.exercises.exercise5.Stock;
import org.mentoring.exercises.exercise5.Wallet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ex5 {

    public static void ex5(){
        System.out.println("Treść:");
        System.out.println("Zdefiniuj abstrakcyjną klasę modelującą papiery wartościowe. Klasa powinna posiadać:\n" +
                "\n" +
                "prywatne pole typu BigDecimal - wartość;\n" +
                "prywatne pole typu int - id;\n" +
                "potrzebne accesory (gettery i settery);\n" +
                "konstruktor;\n" +
                "publiczną abstrakcyjną bezargumentową metodę step;\n" +
                "\n" +
                "Następnie zaimplementuj dwie klasy dziedziczące po papierach wartościowych:\n" +
                "obligacja (Debenture)\n" +
                "posiadającą pole oprocentowanie oraz implementacje metody step (w każdym kroku dodajemy odsetki do wartości);\n" +
                "\n" +
                "\n" +
                "akcja (Stock)\n" +
                "implementacje metody step (ceny akcji mogą zwiększyć się o 10% lub zmniejszyć się o 10%. Korzystając z klasy Random zaproponuj losowanie wybierające wzrost lub spadek ceny).\n" +
                "\n" +
                "Napisz klasę reprezentującą portfel papierów wartościowych. Klasa składa się z:\n" +
                "Prywatnej kolekcji papierów wartościowych,\n" +
                "Konstruktora, dostającego w argumencie powyższą kolekcję,\n" +
                "Publicznej bezargumentowej metody step - wykonującej krok dla każdego instrumentu w portfelu,\n" +
                "Publicznej bezargumentowej metody zwracającej wartości całego portfela.\n" +
                "\n" +
                "Utwórz obiekt klasy portfel, a następnie wyświetl jego koszt po jednym kroku.\n");
        System.out.println("Odpowiedź:");

        Securities debenture1 = new Debenture(BigDecimal.valueOf(5000),1,BigDecimal.valueOf(200));
        Securities debenture2 = new Debenture(BigDecimal.valueOf(3000),2,BigDecimal.valueOf(300));
        Securities debenture3 = new Debenture(BigDecimal.valueOf(10000),3,BigDecimal.valueOf(800));
        Securities stock1 = new Stock(BigDecimal.valueOf(1000),4);
        Securities stock2 = new Stock(BigDecimal.valueOf(2000),5);
        Securities stock3 = new Stock(BigDecimal.valueOf(8000),5);

        List<Securities>securitiesList = new ArrayList<>();
        securitiesList.add(debenture1);
        securitiesList.add(debenture2);
        securitiesList.add(debenture3);
        securitiesList.add(stock1);
        securitiesList.add(stock2);
        securitiesList.add(stock3);

        Wallet wallet = new Wallet(securitiesList);
        wallet.step();
        wallet.walletValue();




    }
}
