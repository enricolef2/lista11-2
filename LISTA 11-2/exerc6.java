import java.util.Scanner;

public class exerc6 {
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
            {18,86,07,19},
            {86,33,67,31},
            {94,60,38,68},
            {84,67,63,69}
        };
        int [][] v2 = {
            {83,20,42,33},
            {20,76,35,19},
            {97,8,31,35},
            {93,52,11,66}
        };
        int [][] v3 = new int[4][4];
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (v[i][j] > v2[i][j]){
                    v3[i][j] = v[i][j];
                } else {
                    v3[i][j] = v2[i][j];
                }
            }
        }
        mostraMatriz(v3);
    }
}