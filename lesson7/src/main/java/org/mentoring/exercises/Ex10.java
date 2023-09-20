package org.mentoring.exercises;

public class Ex10 {

    public static void ex10(){
        System.out.println("Treść:");
        System.out.println("Jaki zostanie przydzielony modyfikator dostępu do pola w klasie, przed którym nie zapiszemy " +
                "\nani słowa protected/private/public, np." +
                "class Student {\n" +
                "    String name;\n" +
                "}\n");
        System.out.println("Odpowiedź:");
        System.out.println("default, wtedy takie pole będzie dostępne w obrębie paczki, ale nie będzie dostępne poza nią," +
                "nawet w przypadku dziedziczenia.");
    }
}
