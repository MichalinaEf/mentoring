package org.mentoring.exercises;

public class Ex7 {

    public static void ex7(){
        System.out.println("Treść:");
        System.out.println("Który sposób na iterowanie po tablicy jest “bezpieczniejszy” i efektywniejszy?\n" +
                "int[] values = {100, 200, 300, 400, 500, 600};\n" +
                "for(int i = 0; i < values.length; i++){\n" +
                "    System.out.println(values[i]);\n" +
                "}" +
                "\n" +
                "\nint[] values = {100, 200, 300, 400, 500, 600};\n" +
                "for(int i = 0; i < 6; i++){\n" +
                "    System.out.println(values[i]);\n" +
                "}\n");
        System.out.println("Odpowiedź:");
        System.out.println("Bezpieczniejsz może okazać się pętla for each, ponieważ \"sama dba\"" +
                "\no indeksy w tablicy, minimalizuje, to możliwość wystąpienia błędu ArrayIndexOutOfBoundsException." +
                "\nEfektywniejsza może okazać się pętla for, ponieważ jest tuaj większa dostępność do indeksów." +
                "\nJeżeli chcielibyśmy przeszukać pętlę od danego indeksu, lub do pewnego indeksu, lepszym wyborem, " +
                "\nmoże okazać się pętla for.");
    }
}
