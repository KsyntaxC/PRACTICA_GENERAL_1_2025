/*
 * Serie: 1, 2, 6, 24, 120, 720, ...
 */
import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int facto = 1;

        for (int i = 1; i <= N; i++) {
            facto = facto * i;
            System.out.print(facto + ", ");
        }
    }
}
