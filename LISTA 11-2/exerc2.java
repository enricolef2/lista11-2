import java.util.Scanner;

public class exerc2 {

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
    
    int[][] v = new int[5][5];
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i == j) {
                    v[i][j] = 1;
                } else {
                    v[i][j] = 0;
                }
            }
        }
        mostraMatriz(v);
    }
}
