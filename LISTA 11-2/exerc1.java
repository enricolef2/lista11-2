import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int contador = 0;
    int[][] v = new int[4][4];
        for (int i = 0; i < v.length; i++) {
            System.out.println("me informe os elementos da linha " + i );
            for (int j = 0; j < v[i].length; j++) {       
            int linha = in.nextInt();
                v[i][j] = linha;
            }          
        }
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (v[i][j] >= 10) {
                    contador++;
                    System.out.println(v[i][j] + " é maior que 10!");
                }
            }
        }
        System.out.println("total de numero maiores que 10 encontrados = " + contador);
    }
}

