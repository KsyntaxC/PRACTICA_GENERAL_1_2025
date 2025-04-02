/*
 * Serie: 1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3 ...
 */
import java.util.Scanner;

public class Series_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = 1;
        int sr = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(n + ", ");
            n = n + sr;
            if (n >= 5 || n <= 1) {
                sr = sr * (-1);
            }
        }
    }
}
