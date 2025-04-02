/*
 * N donde N >= 1, se le pide generar los primeros N terminos de cada serie.
* Serie: 1, 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8 ...
 */
import java.util.Scanner;

public class Series_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int cont = 0;
        
        while (cont < N) {
            for (int j = 1; j <= i; j++) {
                if (cont < N) {
                    System.out.print(j + ", ");
                    cont++;
                }
            }
            i++;
        }
    }
}
