package org.mentoring.exercises;

public class Ex3 {
    public static void ex3(){
        System.out.println("Treść: ");
        System.out.println("Czym jest: JRE, JVM, JDK oraz jakie są różnice pomiędzy nimi?");

        System.out.println("Odpowiedź:");
        System.out.println("- JRE: Java Runtime Environment – środowisko uruchomieniowe dla programów " +
                "napisanych w języku Java jak również innych języków JVM. JRE składa się z wirtualnej maszyny Javy, " +
                "klas podstawowych oraz plików pomocniczych" +
                "\n- JDK: Java Development Kit - Pakiet oprogramowania, " +
                "za pomocą którego można tworzyć aplikacje oparte na języku Java. Dostarcza wszystkie potrzebne " +
                "narzędzia do uruchamiania kodu (kompilator + JRE, czyli m.in JVM)." +
                "\n- JVM: Java Virtual Machine - Java Virtual Machine to absolutna podstawa działania " +
                "wszelkiego rodzaju programów i aplikacji napisanych w Javie. " +
                "Program ten to zestaw poleceń służący do wykonywania poleceń na wirtualnej maszynie. " +
                "Java Virtual Machine w trakcie funkcjonowania programu interpretuje polecenia, " +
                "a następnie tłumaczy je na instrukcje niższego poziomu. " +
                "JVM konwertuje kod bajtowy Javy na kod maszynowy. Java Virtual Machine to część środowiska " +
                "Java Runtime Environment (JRE). \n");
    }


}
