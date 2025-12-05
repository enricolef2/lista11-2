import java.util.Scanner;

public class exerc22 {

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

        int [][] v1 = {
            {7,20,29},
            {69,2,55},
            {69,55,13}
        };
        int [][] v2 = {
            {5,77,86},
            {65,93,60},
            {27,3,50}
        };
        int [][] produto = new int[3][3];
        for (int i = 0; i < v2.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                produto[i][j] = v1[i][j] * v2[i][j]; 
            }
        }
        mostraMatriz(produto);
    }
}