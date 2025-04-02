/*
 * Dado un numero x llevar los digitos primos al inicio del numero si el numero es impar, en el
 * caso de que el numero sea par llevar a los numeros primos al final del numero
 */
import java.util.Scanner;

public class Des_Comp_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        
        int p = 0, po = 1, z = 0, po2 = 1, con = x;
        
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            
            if (d == 2 || d == 3 || d == 5 || d == 7) {
                p = d * po + p;
                po *= 10;
            } else {
                z = d * po2 + z;
                po2 *= 10;
            }
        }
        
        int nn;
        if (con % 2 == 0) {
            nn = z * po + p;
        } else {
            nn = p * po2 + z;
        }
        
        System.out.println(nn);
        scanner.close();
    }
}
