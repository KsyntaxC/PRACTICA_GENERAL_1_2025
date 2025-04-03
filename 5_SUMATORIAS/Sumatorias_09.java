/*
 * Generar la siguiente sumatoria para N terminos:
 * S = 2 - 3 + 5 - 7 + 11 - 13 + 17 - 19 + 23 - 29 + 31 + ...
 */
import java.util.Scanner;

public class Sumatorias_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        
        int sw = 0, p = 2, s = 0;
        
        for (int i = 0; i < N; i++) {
            while (sw == 0) {
                int np = 1;
                for (int j = 2; j < p; j++) {
                    if (p % j == 0) {
                        np = 0;
                    }
                }
                if (np == 1) {
                    int primo = p;
                    sw = 1;
                    p++;
                    
                    if (i % 2 == 0) {
                        s += primo;
                    } else {
                        s -= primo;
                    }
                }
                if (sw == 0) {
                    p++;
                }
            }
            sw = 0;
        }
        System.out.println(s);
    }
}