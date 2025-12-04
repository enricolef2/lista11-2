import java.util.Scanner;
public class exerc3 {
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
        int [][] v = new int[4][4];
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = i * j;
            }
        }    
        mostraMatriz(v);
    }   
}