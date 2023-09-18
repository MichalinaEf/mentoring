package org.mentoring.exercises;

public class Ex8 {

    public static void ex8(){
        System.out.println("Treść:");
        System.out.println("Mając do dyspozycji następujące tablice (wśród nich znajduje się również dwuwymiarowa):\n" +
                "int[] numbers = {10, 20, 30, 100, 50, 2000};\n" +
                "int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};" +
                "\nNapisz program, który policzy, ile znajduje się liczb trzycyfrowych w każdej z nich. \n");
        System.out.println("Odpowiedź:");
        ex8Solution();

    }

    private static void ex8Solution(){
        int[] numbers = {10, 20, 30, 100, 50, 2000};
        int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};

        int count=0;
        for (int number:numbers) {
            if(number>99){
                count++;
            }
        }

        System.out.println("Ilość liczb 3-cyfrowych w tablicy jednowymiarowej: " + count);

        int count2D = 0;
        for (int i = 0; i < numbers2D.length; i++) {
            for (int j = 0; j < numbers2D[i].length; j++) {
                if(numbers2D[i][j]>99){
                    count2D++;
                }
            }

        }
        System.out.println("Ilość liczb 3-cyfrowych w tablicy dwuwymiarowej: " + count2D);

    }
}
