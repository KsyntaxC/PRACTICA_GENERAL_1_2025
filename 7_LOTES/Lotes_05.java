/*
 * Sumar todos los digitos de los numeros ingresados hasta que se ingrese -1 sin adicionar este
 * mismo
 */
import java.util.Scanner;

public class Lotes_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int s = 0;
        
        while (n != -1) {
            int sd = 0;
            while (n != 0) {
                int d = n % 10;
                n = n / 10;
                sd = sd + d;
            }
            s = s + sd;
            n = scanner.nextInt();
        }
        
        System.out.println(s);
        scanner.close();
    }
}
