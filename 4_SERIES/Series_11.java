/*
 * Serie: 0, 2, 1, 3, 1, 5, 2, 7, 3, 11, 5, 13, 8, 17, 13 ...
 */
import java.util.Scanner;

public class Series_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        int primo = 2;
        int a = -1;
        int b = 1;
        int fibo = a + b;
        int sw = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                while (sw == 0) {
                    int np = 1;
                    for (int j = 2; j < primo; j++) {
                        if (primo % j == 0) {
                            np = 0;
                        }
                    }
                    if (np == 1) {
                        System.out.print(primo + ", ");
                        sw = 1;
                    }
                    primo = primo + 1;
                }
                sw = 0;
            } else {
                System.out.print(fibo + ", ");
                a = b;
                b = fibo;
                fibo = a + b;
            }
        }
    }
}
