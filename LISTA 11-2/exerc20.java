import java.util.Scanner;

public class exerc20 {

    public static void mostraVetor(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            // System.out.printf("v[%d] = %d  ", i, v[i]);
            System.out.print(v[i]);
            if (i < v.length-1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void mostraMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            mostraVetor(m[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] v = {
            {17,83,45,62,91,28},
            {59,34,70,11,56,89},
            {23,67,30,98,42,75},
        };

        int somaI = 0;
        int somaP = 0;
        int contadoP = 0;
        int media = 0;
        int substituiçao = 0;


        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i % 2 != 0) {
                    somaI = somaI + v[i][j];
                }
                if (i % 2 == 0) {
                    somaP = somaP + v[i][j];
                    contadoP++;
                }
            }
        }

        

        for (int i = 0; i < v.length; i++) {
            
                v[i][5] = v[i][0] + v[i][1]; 
        }
        media = somaP / contadoP;
        System.out.println(somaI);
        System.out.println(media);
        mostraMatriz(v);
    }
}