/*
 * Serie: 1, 0, 1, 2, 1, 2, 3, 2, 6, 4, 5, 24, 5, 8, 120, 6, 13, 720 ...
 */
import java.util.Scanner;

public class Series_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sw = 1, n = 1, facto = 1, j = 2;
        int sim = 0, im = 1, c = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 != 0) {
                if (sw == 1) {
                    System.out.print(n + ", ");
                    n = n + 1;
                    sw = 0;
                } else {
                    System.out.print(sim + ", ");
                    c = c + 1;
                    if (c > 2) {
                        c = 1;
                        im = im + 2;
                    }
                    sim = sim + im;
                    sw = 1;
                }
            } else {
                System.out.print(facto + ", ");
                facto = facto * j;
                j = j + 1;
            }
        }
    }
}
