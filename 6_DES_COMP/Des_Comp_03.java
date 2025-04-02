/*
 * Dado un numero n, verificar si este es un Numero Capicua o no.
 * Entrada: La entrada consiste en un numero n con mas de 2 digitos. Si el numero es Capicua
 * el resultado se mostrara en pantalla.
 */
import java.util.Scanner;

public class Des_Comp_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        while (n < 10) {
            System.out.print("n: ");
            n = scanner.nextInt();
        }

        int mo = n, nn = 0;
        while (mo > 0) {
            int d = mo % 10;
            mo = mo / 10;
            nn = nn * 10 + d;
        }
        
        System.out.println(nn);
        if (nn == n) {
            System.out.println("Es un número capicua");
        } else {
            System.out.println("No es un número capicua");
        }
        
        scanner.close();
    }
}
