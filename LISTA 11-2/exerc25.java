import java.util.Random;
import java.util.Scanner;

public class exerc25 {

        public static void mostraVetor(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            // System.out.printf("v[%d] = %d  ", i, v[i]);
            System.out.print(v[i]);
            if (i < v.length-1)
                System.out.print(" ");
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
    
        int [][] jogo = new int[3][3];
        int jogada = 0;
        Random random = new Random();
        boolean vez = false;
        for (int i = 0; i < 9; i++) {
            if (vez == false) {
                while (true) {
                int eixoX = random.nextInt(3);
                int eixoY = random.nextInt(3);
                    if (jogo[eixoX][eixoY] == 0) {
                    jogo[eixoX][eixoY] = -1;
                    mostraMatriz(jogo); 
                    vez = true;
                    break;
                    }   
                }   

            } else {
                while (true) {
                    System.out.println("sua vez de jogar");

                    System.out.println("me diga as coordenadas que queres jogar (0 a 2)");

                    int linha = in.nextInt();
                    int coluna = in.nextInt();

                    if (linha > 2 || coluna > 2) {
                    System.out.println("erro, fora do mapa da velha, voltando...");
                    System.out.println();
                    } else if (jogo[linha][coluna] != 0) {
                        System.out.println("ja colocaram um numero ali, tente novamente!");
                        System.out.println();
                    } else {
                        jogo[linha][coluna] = 1;
                        vez = false;
                        break;
                    }
                }
            }
        }   
    }
}
