package org.mentoring.exercises;

public class Ex7 {

    public static void ex7(){
        System.out.println("Treść:");
        System.out.println("Czym różnią się poniższe dwa sposoby na inicjalizowanie pól w obiekcie? Który ze sposobów preferujesz i dlaczego?\n");
        //class DummyPerson {
        //    private String name;
        //    private int age;
        //    private int height;
        //    private int weight;
        //    DummyPerson(String newName, int newAge, int newHeight, int newWeight) {
        //        name = newName;
        //        age = newAge;
        //        height = newHeight;
        //        weight = newWeight;
        //    }
        //}

        //class DummyPerson {
        //    private String name;
        //    private int age;
        //    private int height;
        //    private int weight;
        //    DummyPerson(String name, int age, int height, int weight) {
        //        this.name = name;
        //        this.age = age;
        //        this.height = height;
        //        this.weight = weight;
        //    }
        //}
        System.out.println("Odpowiedź:");
        System.out.println("Różnią się przypisaniem wartości do zmiennych w konstruktorze. " +
                "\nLepszy jest zapis ze słowem \"this\", ponieważ taki zapis umożliwia jawne ukazanie, " +
                "\nże chcemy odwołać się do zmiennej, która jest polem bieżącego obiektu. ");
    }
}
