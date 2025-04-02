/*
 * Dado un lote de n numeros, aumentar el elemento de la secuencia a cada elemento del lote
 * segun el recorrido de la serie: 1 2 3 2 1 2 3 2 1...
 */
import java.util.Scanner;

public class Lotes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();
        
        int ns = 1;
        int sr = 1;
        
        for (int i = 1; i <= N; i++) {
            System.out.print("n" + i + ": ");
            int n = scanner.nextInt();
            
            int s = ns;
            ns = ns + sr;
            
            if (ns >= 3 || ns <= 1) {
                sr = sr * (-1);
            }
            
            int nn = n + s;
            System.out.println(nn);
        }
        
        scanner.close();
    }
}
