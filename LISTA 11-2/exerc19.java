import java.util.Scanner;

public class exerc19 {

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

        int [][] v = new int[5][4];

        int matricula = 0;
        int prova = 0;
        int trabalho = 0;
        int maiorNotaF = 0;
        int matriculaMaiorN = 0;
        int notaF = 0;
        int media = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.println("");
            for (int j = 0; j < v[i].length; j++) {
                if (j == 0){
                    System.out.println("me informe as matriculas dos aluno");
                    matricula = in.nextInt();
                    v[i][j] = matricula;
                } else if (j == 1) {
                    System.out.println("me diga a media da prova do aluno " + matricula);
                    prova = in.nextInt();
                    v[i][j] = prova;
                } else if (j == 2) {
                    System.out.println("me diga a nota do trabalho do aluno " + matricula);
                    trabalho = in.nextInt();
                    v[i][j] = trabalho;
                } else if (j == 3) {
                    notaF = prova + trabalho;
                    v[i][j] = notaF;
                }
                if (maiorNotaF < notaF) {
                    maiorNotaF = notaF;
                    matriculaMaiorN = matricula;
                }
            }
            media = media + notaF;
        }
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (maiorNotaF < notaF) {
                    maiorNotaF = notaF;

                }
            }
        }
        media = media / 5;
        mostraMatriz(v);
        System.out.println("o aluno da matricula " + matriculaMaiorN + " tirou a maior nota sendo "+ maiorNotaF);
        System.out.println("a media aritmética das notas finais foi = " + media);
    }
}