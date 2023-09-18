package org.mentoring.exercises;

public class Ex11 {

    public static void ex11(){
        System.out.println("Treść:");
        System.out.println("Z podanej tablicy Wyświetl tylko te podtablice składowe, " +
                "\nktóre nie mają w sobie wartości “Unknown”. Wykorzystaj metodę .contains(). \n" +
                "\n" +
                "String[][] names2D = {{\"John\", \"Jasper\"}, {\"Casper\", \"Jonathan\"}, {\"Unknown\", \"Unknown\"}, " +
                "{\"Alice\", \"Bob\"}, {\"Stanley\", \"Unknown\"}};\n" +
                "\n");
        System.out.println("Odpowiedź:");
        ex11Solution();
    }

    private static void ex11Solution() {
        String[][] names2D = {{"John", "Jasper"}, {"Casper", "Jonathan"}, {"Unknown", "Unknown"}, {"Alice", "Bob"},
                {"Stanley", "Unknown"}};

        for (String[] row : names2D) {
            boolean containsUnknown = false;
            for (String name:row) {
                if(name.contains("Unknown")){
                    containsUnknown = true;
                    break;
                }
            }

            if(!containsUnknown){
                for (String name:row) {
                    System.out.print(name + " | ");
                }
                System.out.println();
            }

        }
    }


}
