package org.mentoring.exercises;

public class Ex9 {

    public static void ex9(){
        System.out.println("Treść");
        System.out.println("Jaki będzie wynik poniższych operacji?\nint value = 10;\n" +
                "System.out.println(value++); \n" +
                "System.out.println(value); /nint value1 = 10, value2 = 20;\n" +
                "int sum = (value1++) + (++value2);\n" +
                "System.out.println(value1);\n" +
                "System.out.println(value2);\n" +
                "System.out.println(sum);");
        System.out.println("Odpowiedź:");
        System.out.println("int value = 10;\n" +
                "System.out.println(value++); //10 \n" +
                "System.out.println(value); //11 \n" +
                "int value1 = 10, value2 = 20; \n" +
                "int sum = (value1++) + (++value2); \n" +
                "System.out.println(value1); //11 \n" +
                "System.out.println(value2); //21 \n" +
                "System.out.println(sum);//31\n");
    }
}
