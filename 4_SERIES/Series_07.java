/*
 * Serie: : 2, 0, 4, 1, 6, 1, 8, 2, 10, 3, ...
 */
import java.util.Scanner;

public class Series_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int par = 2;
        int a = -1;
        int b = 1;
        int fibo = a + b;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                System.out.print(par + ", ");
                par = par + 2;
            } else {
                System.out.print(fibo + ", ");
                a = b;
                b = fibo;
                fibo = a + b;
            }
        }
    }
}
