import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] v = {
            {80,30,34},
            {40,95,99},
            {66,33,31}
        };
        int sungas4 = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i + j == 2) {
                    sungas4 = sungas4 + v[i][j];
                }
            }
        }
        System.out.println(sungas4);
    }
}