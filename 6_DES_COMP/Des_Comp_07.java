/*
 * Dado un conjunto de N numeros enteros, imprimir el numero que resulta de la concatenacion
 * de los numeros dados.
 */
import java.util.Scanner;

public class Des_Comp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();
        
        int nn = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("n: ");
            int n = scanner.nextInt();
            int cd = (int) Math.log10(n) + 1;
            while (n > 0) {
                int d = n / (int) Math.pow(10, cd - 1);
                n %= (int) Math.pow(10, cd - 1);
                cd--;
                nn = nn * 10 + d;
            }
        }
        
        System.out.println(nn);
        scanner.close();
    }
}
