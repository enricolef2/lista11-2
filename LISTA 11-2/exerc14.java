import java.util.Random;
import java.util.Scanner;

public class exerc14 {
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
        int [][] v = new int[5][5];

         Random random = new Random();

        int qtd = 0;

        while (qtd < 25) {
            int num = random.nextInt(100);
            boolean repetido = false;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (v[i][j] == num) {
                        repetido = true;
                    }
                }
            }

            if (repetido == false) {
                v[qtd / 5][qtd % 5] = num;
                qtd++;
            }
        }
        mostraMatriz(v);
    }
}