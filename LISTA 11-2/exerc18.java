import java.util.Scanner;

public class exerc18 {

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
    
    int[][] v = new int[3][3];
    int [][] vT = new int[3][3];
    int[] soma = new int[3];

        for (int i = 0; i < v.length; i++) {
            System.out.println("me diga os valores da linha " + (i + 1));
            for (int j = 0; j < v[i].length; j++) {
                System.out.println("valor " + (j + 1));
                int valor = in.nextInt();
                v[i][j] = valor;
            }
        }
        System.out.println();
        mostraMatriz(v);
        System.out.println();
        System.out.println("///////////");
        System.out.println();
        for (int i = 0; i < vT.length; i++) {
            for (int j = 0; j < vT.length; j++) {
                vT[j][i] = v[i][j]; 
            }
        }

        for (int i = 0; i < vT.length; i++) {
            int anterior = 0;
            for (int j = 0; j < vT[i].length; j++) {
                anterior = anterior + vT[i][j];
                soma[i] = anterior;
            }
        }
        
        mostraVetor(soma);
    }
}
