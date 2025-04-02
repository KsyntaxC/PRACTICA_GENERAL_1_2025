/*
 * Serie: 1, 8, 27, 64, 125, 216, ...
 */
import java.util.Scanner;

public class Series_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int p;

        for (int i = 1; i <= N; i++) {
            p = i * i * i;
            System.out.print(p + ", ");
        }
    }
}
