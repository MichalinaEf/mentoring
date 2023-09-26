package org.mentoring.exercises;

public class Ex1 {

    public static void ex1(){
        System.out.println("Treść:");
        System.out.println("Omów, czym jest:\n" +
                "Polimorfizm\n" +
                "Klasa abstrakcyjna\n" +
                "Interfejs (oraz jego różnica względem klasy abstrakcyjnej)\n");
        System.out.println("Odpowiedź:");
        System.out.println("Polimorfizm - jest jedną z fundamentalnych koncepcji programowania obiektowego.\n" +
                "Oznacza zdolność obiektów do reagowania na te same metody w sposób zgody ze swoimi typami.\n" +
                "Czyli, różne obiekty mogą wykonywać te same działania (metody) w sposób dostosowany do swojego włąsnego\n" +
                "zachowania. Istnieją dwa główne rodzaje polimorfizmu w Javie: \n" +
                "- polimorfizm na poziomie interfejsu,\n" +
                "- polimorfizm na poziomie dziedziczenia.\n" +
                "\n" +
                "Klasa Abstrkacyjna:\n" +
                "Klasa definiowana ze słowem kluczowym \"abstract\". Taka klasa może posiadać pola, konstruktory oraz\n" +
                "metody abstrakcyjne (czyli takie, które nie posiadają ciała!) i nieabstrakcyjne. \n" +
                "Nie można instancjonować takiej klasy. Służą one do porządkowania kodu i wskazywania abtrakcji,\n" +
                "o którą opieramy inne klasy, które dziedziczą właśnie po klasie abstrakcyjnej.\n" +
                "\n" +
                "Interfejsy:\n" +
                "można o nich powiedzieć, że są klasami w pełni abstrkacyjnymi. Mogą posiadać jedynie stałe oraz metody\n" +
                "abstrakcyjne. Dodatkowo od Javy 8 wprowadzono usprawnienie, dzięki któremu można w interfejsie\n" +
                "stworzyć metodę ze specyfikatorem default (metodę domyślną) w której można zawrzeć kod (metoda ma ciało).");
    }
}
