/*
 * Serie: 1, 0, 3, 0, 0, 0, 5, 0, 0, 0, 0, 0, 7, 0, ...
 */
import java.util.Scanner;

public class Series_08 {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 1;
        int c = 1;
        int sw = 1;

        for (int i = 0; i < N; i++) {
            if (sw == 1) {
                System.out.print(n + ", ");
                n = n + 1;
                sw = 0;
            } else {
                System.out.print(0 + ", ");
                c = c + 1;
                if (c >= n) {
                    sw = 1;
                    c = 1;
                }
            }
        }
    }
}
