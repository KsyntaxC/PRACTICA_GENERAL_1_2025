/*
 * Dado un numero N(1 ≤ N < 1000000000), eliminar sus digitos que se encuentren detras de
 * un 3 o 7.
 */
import java.util.Scanner;

public class Des_Comp_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();
        
        while (N <= 1 || N >= 1000000000) {
            System.out.println("N(1 ≤ N < 1000000000)");
            N = scanner.nextInt();
        }
        
        int cd = (int) Math.log10(N) + 1;
        int sw = 1, y = 0;
        
        while (N > 0) {
            int d = N / (int) Math.pow(10, cd - 1);
            N %= (int) Math.pow(10, cd - 1);
            cd--;
            if (sw == 1) {
                y = y * 10 + d;
            }
            if (d == 3 || d == 7) {
                sw = 0;
            } else {
                sw = 1;
            }
        }
        
        System.out.println(y);
        scanner.close();
    }
}
