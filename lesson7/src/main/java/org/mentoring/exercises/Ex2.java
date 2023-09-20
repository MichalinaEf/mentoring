package org.mentoring.exercises;

public class Ex2 {

    public static void ex2(){
        System.out.println("Treść:");
        System.out.println("Popraw poniższy kod:\n");
        System.out.println("Odpowiedź:");
        System.out.println("Należy zmienić pola klasy na prywatny oraz dodać do nich gettery i settery aby umożliwić do nich" +
                "\n dostęp oraz modyfikację" +
                "\n metoda bark powinna być publiczna, inaczej nie będzie możliwości jej wykorzystania poza tą klasą.");
    }

//ex2WithError:
//        public class Dog {
//            public String name; -> private
//            public int noLegs; -> private
//            public int age; -> private
//
//            public Dog(String name, int age) {
//                this.name = name;
//                this.age = age;
//                this.noLegs = 4;
//            }
//
//              gettery i settery dla pól name, noLegs, age
//
//
//            private void bark() {                 -> public
//                System.out.println("Woof-woof!");
//            }
//        }
//    }
}
