import java.util.Scanner;

public class exerc21 {

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
            {83,42},
            {15,91}
        };
        int [][] v2 = {
            {35,32},
            {58,85}
        };
        int [][] soma = new int[2][2];
        int [][] sub = new int[2][2];
        while (true) {
            System.out.println();
            System.out.println("menu de opcões");
            System.out.println();
            System.out.println("digite 1 para soma duas matrizes");
            System.out.println("digite 2 para subtrair as duas matrizes");
            System.out.println("digite 3 para aumentar os valores das duas matrizes");
            System.out.println("digite 4 para imprimir as duas matrizes");
            int digito = in.nextInt();
            if(digito == 1) {
                for (int i = 0; i < v1.length; i++) {
                    for (int j = 0; j < v1.length; j++) {
                        
                        soma[i][j] =  v1[i][j] + v2[i][j];
                       
                    }
                }
                mostraMatriz(soma);
            }
            if (digito == 2) {
                for (int i = 0; i < v1.length; i++) {
                    for (int j = 0; j < v1.length; j++) {
                        
                        sub[i][j] =  v1[i][j] - v2[i][j];
                        
                    }
                }
                mostraMatriz(sub);
            }
            if (digito == 3) {
                System.out.println("me digite o numero a ser adicionado");
                int mais = in.nextInt();
                for (int i = 0; i < v1.length; i++) {
                    for (int j = 0; j < v1.length; j++) {
                        v1[i][j] += 5;
                        v2[i][j] += 5;
                        
                    }
                }
                mostraMatriz(v1);
                System.out.println();
                mostraMatriz(v2);
            }
            if (digito == 4)  {
                System.out.println("aqui esta as matrizes");
                mostraMatriz(v1);
                System.out.println();
                mostraMatriz(v2);
            }
        }
    }
}