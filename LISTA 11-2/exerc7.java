import java.util.Scanner;

public class exerc7 {
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

        int [][] v = new int[10][10];
        int bungas = 0;
            for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i < j) {
                    v[i][j] = 2*i + 7*j - 2;
                } else if (i == j) {
                    v[i][j] = 3*(i * i) - 1;
                } else {
                    v[i][j] = 4*(i * i * i) - 5*(j * j);
                }
                bungas = v[i][j];
            }
        }
        mostraMatriz(v);
    }
}