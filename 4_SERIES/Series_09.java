/*
 * Juez Patito ID: 2169 Serie: 1 3 6 11 18 19 22 29 38 41 50 51 ...
 */
import java.util.Scanner;

public class Series_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        int p = -2;
        int a = 1;
        System.out.print(a + " ");
        
        for (int j = 0; j < N; j++) {
            int cont = 0;
            for (int i = 1; i < N; i++) {
                if (p % i == 0) {
                    cont = cont + 1;
                }
            }
            if (cont == 2) {
                System.out.print(a + p % 10 + " ");
                a = a + p % 10;
                j = j + 1;
                p = p + 1;
            } else {
                p = p + 1;
            }
        }
    }
}
