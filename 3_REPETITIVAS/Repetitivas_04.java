/*
 * Dado un numero N mostrar en la pantalla de la siguiente manera.
N=5
* 1 2 3 4
1 * 1 2 3
2 1 * 1 2
3 2 1 * 1
4 3 2 1 *
 */
import java.util.Scanner;

public class Repetitivas_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int n = 1;
            int nr = i - 1;
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else if (i < j) {
                    System.out.print(n + " ");
                    n = n + 1;
                } else {
                    System.out.print(nr + " ");
                    nr = nr - 1;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
