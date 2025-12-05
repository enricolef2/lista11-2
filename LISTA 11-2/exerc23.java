import java.util.Scanner;

public class exerc23 {

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

        int [][] a = {
            {7,20,29},
            {69,2,55},
            {69,55,13}
        };
        int [][] b = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[i][j] * a[i][j]; 
            }
        }
        mostraMatriz(b);
    }
}