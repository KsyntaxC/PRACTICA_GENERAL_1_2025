/*
 * Dado un numero x(11111 ≤ x ≤ 999999999) cuyos digitos son distintos de cero se pide rotar
 * los digitos pares N veces hacia la izquierda.'''
 * Dado un número positivo, rotar cada 3 digitos.
 * Ejm: x=1234567 --> x=3216547
 */
import java.util.Scanner;

public class Des_Comp_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Intro x: ");
        int x = scanner.nextInt();
        
        while (x < 0) {
            System.out.print("Intro x: ");
            x = scanner.nextInt();
        }
        
        int r = 0;
        int cd = (int) Math.log10(x) + 1;
        
        while (x > 0) {
            if (cd > 3) {
                int g = x / (int) Math.pow(10, cd - 3);
                x %= (int) Math.pow(10, cd - 3);
                cd = (int) Math.log10(x) + 1;
                int rot = 0;
                
                for (int i = 0; i < 3; i++) {
                    rot = rot * 10 + g % 10;
                    g /= 10;
                }
                
                r = r * 1000 + rot;
            } else {
                r = r * (int) Math.pow(10, cd) + x;
                x = 0;
            }
        }
        
        System.out.println(r);
        scanner.close();
    }
}