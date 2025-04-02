/*
 * Dado un lote de n numeros enteros positivos, mostrar de cada numero leido
 * el siguiente numero superior que sea multiplo de 7 .
 * Entrada: La primera linea contiene un numero n, el cual indica cuantos numeros leer.
 * Las siguientes n -lineas contienen un numero ni por linea.
 * Salida: De cada numero ni imprimir el siguiente numero que sea multiplo de 7 .
 */
import java.util.Scanner;

public class Lotes_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        
        while (N <= 0) {
            System.out.println("N debe ser un entero positivo");
            N = scanner.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            int n = scanner.nextInt();
            
            while (n % 7 != 0) {
                n = n + 1;
            }
            
            System.out.println(n);
        }

        scanner.close();
    }
}
