/*
 * NUMEROS BALANCEADOS
 * En este ejercicio decimos que un numero es balanceado si la suma de sus
 * digitos en posiciones pares es igual a la suma de sus digitos en posiciones impares. 
 * Nota: usar descomposicion de numeros.
 */
import java.util.Scanner;

public class Des_Comp_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Intro N: ");
        int n = scanner.nextInt();
        
        int i = 1, x = 0, y = 0;
        
        while (n != 0) {
            int d = n % 10;
            n = n / 10;
            
            if (i % 2 == 0) {
                y += d;
            } else {
                x += d;
            }
            i++;
        }
        
        if (x == y) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
