/*
 * Juez Patito ID: 2125 Serie: 2 7 17 34 62 103 161 238 338 467 ...
 */
import java.util.Scanner;

public class Series_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        int p = 2;
        int sp = 0;
        int s = 0;
        int sw = 0;

        for (int i = 0; i < N; i++) {
            while (sw == 0) {
                int np = 1;
                for (int j = 2; j < p; j++) {
                    if (p % j == 0) {
                        np = 0;
                    }
                }
                if (np == 1) {
                    int primo = p;
                    sw = 1;
                    sp = sp + primo;
                    s = s + sp;
                    System.out.print(s + " ");
                }
                p = p + 1;
            }
            sw = 0;
        }
    }
}
