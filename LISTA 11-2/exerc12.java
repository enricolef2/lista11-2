import java.util.Scanner;

public class exerc12 {
    public static void mostraMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            mostraVetor(m[i]);
        }
    }
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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] v = {
            {80,30,34},
            {40,95,99},
            {66,33,31}
        };
        int [][] v2 = new int[3][3];

        for (int i = 0; i < v2.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                v2[j][i] = v[i][j]; 
            }
        }
        mostraMatriz(v2);
    }
}