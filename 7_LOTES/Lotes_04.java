/*
 * Dado un lote de numeros detener la lectura de los numeros si se introduce algun numero que
 * sea perfecto. Un numero perfecto es aquel que es el resultado de la suma de sus divisores.
 * Mostrar el resultado de la suma de los numeros no perfectos.
 */
import java.util.Scanner;

public class Lotes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sw = 1;
        int sp = 0;
        
        while (sw == 1) {
            int n = scanner.nextInt();
            int s = 0;
            
            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    s = s + j;
                }
            }
            
            if (s == n) {
                sw = 0;
            } else {
                sp = sp + n;
            }
        }
        
        System.out.println("Suma de los numeros no perfectos: " + sp);
        scanner.close();
    }
}