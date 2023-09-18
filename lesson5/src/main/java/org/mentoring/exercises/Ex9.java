package org.mentoring.exercises;

public class Ex9 {

    public static void ex9(){
        System.out.println("Treść:");
        System.out.println("Zdefiniuj tablicę dwuwymiarową o następującym kształcie:\n" +
                "\n" +
                "10 20 30 40 50 60\n" +
                "70 80 90 100 110 120 130\n" +
                "140 150 160 170 180 190 200 210\n" +
                "220 230 240 250 260 270 280 290 300\n");
        System.out.println("Odpowiedź:");
        ex9Solution();
    }

    private static void ex9Solution() {
        int[][] arr = new int[4][];
        arr[0] = new int[6];
        arr[1] = new int[7];
        arr[2] = new int[8];
        arr[3] = new int[9];

        System.out.println("Utworzono tablicę arr, gdzie ilość wierszy, to: " + arr.length);
        System.out.println("Ilość kolumn pierwszego wiersza: " + arr[0].length);
        System.out.println("Ilość kolumn drugiego wiersza: " + arr[1].length);
        System.out.println("Ilość kolumn trzeciego wiersza: " + arr[2].length);
        System.out.println("Ilość kolumn czwartego wiersza: " + arr[3].length);


        int[][] arr1 = new int[][]{
                {10, 20, 30, 40, 50, 60},
                {70, 80, 90, 100, 110, 120, 130},
                {140, 150, 160, 170, 180, 190, 200, 210},
                {220, 230, 240, 250, 260, 270, 280, 290, 300}
        };

        System.out.println("Utworzono tablicę arr1, gdzie ilość wierszy, to: " + arr1.length);
        System.out.println("Ilość kolumn pierwszego wiersza: " + arr1[0].length);
        System.out.println("Ilość kolumn drugiego wiersza: " + arr1[1].length);
        System.out.println("Ilość kolumn trzeciego wiersza: " + arr1[2].length);
        System.out.println("Ilość kolumn czwartego wiersza: " + arr1[3].length);
    }
}
