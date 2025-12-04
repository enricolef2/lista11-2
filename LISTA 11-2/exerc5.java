import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] v = {
            {83,20,42,33},
            {20,76,35,19},
            {97,8,31,35},
            {93,52,11,66}
        };
        System.out.println("me digite, um numero e aperte ENTER que localizarei");   
        int numero = in.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (numero == v[i][j]) {
                    encontrado = true;
                    System.out.println("Seu numero esta dentro da matriz :) " + numero);;
                    break;
                }
            }
        }
        if (encontrado == false) {
            System.out.println("seu numero nao foi encontrado :(");
        }
    }
}
