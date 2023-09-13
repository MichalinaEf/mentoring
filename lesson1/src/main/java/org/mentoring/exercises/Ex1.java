package org.mentoring.exercises;

public class Ex1 {

    public static void ex1(){
        System.out.println("Treść: ");
        System.out.println("Odpowiedz na pytanie, czy Java jest językiem kompilowanym czy interpretowanym?");

        System.out.println("Odpowiedź:");
        System.out.println("Mówi się, że Java jest zarówno językiem kompilowanym, jak i interpretowanym. " +
                "Na ten moment zdaj sobie jedynie sprawę z tego, iż takie cechy języka oznaczają, " +
                "że kod pisany przez programistę w Javie jest najpierw zamieniany do postaci kodu bajtowego " +
                "(proces kompilacji), a następnie taki bytecode jest uruchamiany na tzw. JVM (Java Virtual Machine). "+
                "Wówczas maszyna ta interpretuje kod i go wykonuje." +
                "Kompilację przeprowadzamy za pomocą kompilatora. Pakiet JDK zawiera odpowiedni kompilator - javac " +
                "(ang. java compiler).\n");
    }


}
