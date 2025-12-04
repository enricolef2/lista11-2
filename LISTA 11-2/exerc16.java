import java.util.Scanner;

public class exerc16 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    char[][] respostas = new char[3][10];
    char[] gabarito = new char[10];
    int[] resultado = new int[3];
    int[] matrículas = new int[3];
    System.out.println("me digite o gabarito da prova");

        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = in.next().charAt(0);
        }

        for (int i = 0; i < respostas.length; i++) {
            System.out.println("me diga o numero de matrícula do aluno");
            int matrícula = in.nextInt();
            matrículas[i] = matrícula;  
            for (int j = 0; j < respostas[i].length; j++) {
                System.out.println("resposta da questao " + (j + 1));
                respostas[i][j] = in.next().charAt(0);
            }
        }
        System.out.println();
        
        for (int i = 0; i < respostas.length; i++) {
            int acertos = 0;
           for (int j = 0; j < gabarito.length; j++) {
                if (respostas[i][j] == gabarito[j]) {
                    acertos++;
                }
           }
           resultado[i] = acertos;
        }
        for (int i = 0; i < matrículas.length; i++) {
            System.out.println("estas foram as respostas do aluno do numero de matricula " + matrículas[i]);
            for (int j = 0; j < respostas[i].length; j++) {
                System.out.println(respostas[i][j]);
            }
            
        }
    
        for (int i = 0; i < resultado.length; i++) {
            if (resultado[i] < 7) {
                System.out.println(matrículas[i] + " reprovado " + " = " + resultado[i]);
            } else {
                System.out.println(matrículas[i] + " aprovado " + " = " + resultado[i]);
            } 
        }
    }
}
 