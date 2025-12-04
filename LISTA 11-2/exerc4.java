import java.util.Scanner;

public class exerc4 {
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
        int [][] v = {
            {18,86,07,19},
            {86,33,67,31},
            {94,60,38,68},
            {84,67,63,69}
        };
        int maior = 0;
        int maiorL = 0;
        int maiorC = 0;
        for (int i = 0; i < v.length; i++) {
           for (int j = 0; j < v[i].length; j++) {
                if(v[i][j] > maior) {
                    maior = v[i][j];
                    maiorL = i;
                    maiorC = j;
                }
           } 
        }
        mostraMatriz(v);
        System.out.println("as coordenadas do maior numero sao = " + maiorL + "," + maiorC + " = " + maior);
    }   
}