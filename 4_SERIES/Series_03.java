/*
 * Serie: 1, 2, 3, 4, 10, 19, 36, 69, 134, 258, 497 ...
 */
import java.util.Scanner;

public class Series_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 0, b = 1, c = 2, d = -2, s = a + b + c + d;

        for (int i = 0; i < N; i++) {
            System.out.print(s + ", ");
            a = b;
            b = c;
            c = d;
            d = s;
            s = a + b + c + d;
        }
    }
}
