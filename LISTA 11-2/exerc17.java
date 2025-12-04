import java.util.Scanner;

public class exerc17 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int[][] provas = {
        {1,10,9,4,1,3,8,7,6,5},
        {3,3,8,3,3,9,4,4,8,3},
        {2,2,2,2,5,7,9,6,9,5}
    };
    int menorN1 = 11;
    int qtt1 = 0;
    int menorN2 = 11;
    int qtt2 = 0;
    int menorN3 = 11;
    int qtt3 = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < provas[i].length; j++) {
                if (provas[i][j] < menorN1) {
                menorN1 = provas[i][j];
                }
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < provas[i].length; j++) {
                if (provas[i][j] == menorN1) {
                    qtt1++;
                }
            }
        }

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < provas[i].length; j++) {
                if (provas[i][j] < menorN2) {
                menorN2 = provas[i][j];
                }
            }
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < provas[i].length; j++) {
                if (provas[i][j] == menorN2) {
                    qtt2++;
                }
            }
        }

        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < provas[i].length; j++) {
                if (provas[i][j] < menorN3) {
                menorN3 = provas[i][j];
                }
            }
        }
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < provas[i].length; j++) {
                if (provas[i][j] == menorN3) {
                    qtt3++;
                }
            }
        }
        System.out.println("quantidades de aluno que tiveram a pior nota; " + "'" +menorN1 + "'"+ " na prova 1" + " = " +qtt1);
        System.out.println("quantidades de aluno que tiveram a pior nota; " + "'" +menorN2 + "'"+ " na prova 2" + " = " +qtt2);
        System.out.println("quantidades de aluno que tiveram a pior nota; " + "'" +menorN3 + "'"+ " na prova 3" + " = " +qtt3); 
    }
}
