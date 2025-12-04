import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    char[][] respostas = new char[5][10];
    char[] gabarito = new char[10];
    int[] resultado = new int[5];

    System.out.println("me digite o gabarito da prova");
        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = in.next().charAt(0);
        }
    
        for (int i = 0; i < respostas.length; i++) {
            System.out.println("me diga as respostas do aluno " + (i + 1));
            for (int j = 0; j < respostas[i].length; j++) {
                System.out.println("resposta da questao " + (j + 1));
                respostas[i][j] = in.next().charAt(0);
            }
        }
        
        for (int i = 0; i < resultado.length; i++) {
           int acertos = 0;
           for (int j = 0; j < gabarito.length; j++) {
                if (respostas[i][j] == gabarito[i]) {
                    acertos++;
                }
           }
           resultado[i] = acertos;
        }
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("resultado do aluno " + (i + 1) + " = " + resultado[i]);
        }
    }
}
