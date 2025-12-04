import java.util.Scanner;

public class exerc13 {
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
            {11,19,14,12},
            {3,1,16,12},
            {3,8,8,13},
            {16,17,18,1}
        };
        mostraMatriz(v);
        System.out.println();
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if(i < j) {
                    v[i][j] = 0;
                }
            }
        }
        mostraMatriz(v);
    }
}