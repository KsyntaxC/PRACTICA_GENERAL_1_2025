/*
 * Descripcion: Se te dara un numero x y tu tarea es rotar sus digitos n veces a la izquierda.
 * Entrada: La entrada consiste en T casos de prueba, para cada caso se te dara dos numeros
 * enteros x y n.
 * Salida: La salida debera ser el numero x rotado n veces a la izquierda
 */
import java.util.Scanner;

public class Des_Comp_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("T casos de prueba: ");
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.print("Numero x: ");
            int x = scanner.nextInt();
            System.out.print("N rotaciones: ");
            int n = scanner.nextInt();
            
            String numeroStr = Integer.toString(x);
            int cd = numeroStr.length();
            
            for (int j = 0; j < n; j++) {
                char primerDigito = numeroStr.charAt(0);
                numeroStr = numeroStr.substring(1) + primerDigito;
            }
            
            System.out.println("Numero rotado: " + numeroStr);
        }
        
        scanner.close();
    }
}
