import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] v = {
            {80,30,34},
            {40,95,99},
            {66,33,31}
        };
        int sungas2 = 0; //soma + bungas = sungas :)
        for (int i = 0; i < v.length; i++) {
           for (int j = 0; j < v.length; j++) {
                if (i > j) {
                    sungas2 = sungas2 + v[i][j];
                }
           } 
        }
        System.out.println(sungas2);
    }
}