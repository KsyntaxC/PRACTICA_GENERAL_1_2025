/*
 * Dado un entero N donde cada digito es diferente de 0, se pide ordenar el numero de mayor a menor.
 */
import java.util.Scanner;

public class Des_Comp_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();

        while (N <= 0) {
            System.out.println("N debe ser mayor o igual a 0");
            System.out.print("N: ");
            N = scanner.nextInt();
        }

        String numeroStr = Integer.toString(N);
        char[] digitos = numeroStr.toCharArray();
        
        // Ordenar los dígitos de mayor a menor
        for (int i = 0; i < digitos.length - 1; i++) {
            for (int j = i + 1; j < digitos.length; j++) {
                if (digitos[i] < digitos[j]) {
                    char temp = digitos[i];
                    digitos[i] = digitos[j];
                    digitos[j] = temp;
                }
            }
        }
        
        String numeroOrdenado = new String(digitos);
        System.out.println("Número ordenado: " + numeroOrdenado);
        
        scanner.close();
    }
}