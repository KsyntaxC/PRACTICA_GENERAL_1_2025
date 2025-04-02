/*
 * Dado un lote de N numeros, determinar los divisores de cada numero.
 * Entrada: La primera linea contiene un numero N(1 ≤ N ≤ 1000), el cual indica cuantos
 * numeros leer. Las siguientes N lineas contienen un N-esimo numero por linea (2 ≤ ni ≤ 1000)
 * Salida: Imprima los divisores de cada numero
 */
import java.util.Scanner;

public class Lotes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();
        
        while (N < 1 || N > 1000) {
            System.out.println("N(1 ≤ N ≤ 1000)");
            N = scanner.nextInt();
        }
        
        for (int i = 1; i <= N; i++) {
            System.out.println();
            System.out.print("n" + i + ": ");
            int ni = scanner.nextInt();
            
            while (ni < 2 || ni > 1000) {
                System.out.println("(2 ≤ ni ≤ 1000)");
                ni = scanner.nextInt();
            }
            System.out.print("Divisores de " + ni + ": ");
            for (int j = 1; j <= ni; j++) {
                if (ni % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
        scanner.close();
    }
}