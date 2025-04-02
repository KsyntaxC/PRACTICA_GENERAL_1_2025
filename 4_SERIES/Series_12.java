/*
 * Juez Patito ID: 1899 Serie: 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9,...
 */
import java.util.Scanner;

public class Series_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        int n = 0;

        for (int i = 0; i < N; i++) {
            System.out.print(n + ", ");
            if (i % 2 != 0) {
                n = n + 1;
            }
        }
    }
}
