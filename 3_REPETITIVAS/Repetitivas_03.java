/*
 * Dado un numero N, expresarlo como la multiplicacion de sus divisores primos primos con su
 * potencia correspondiente y hallar la suma de esos multiplos primos.
 * Sugerencia: Para mejorar la presentacion de la multiplicacion, al concatenar el caracter
 * añadir un 1 al final de la cadena, pero no tomarlo en cuenta para la suma.
 */
import java.util.Scanner;

public class Repetitivas_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int original = N;
        int fac = 2;
        String r = "";
        int s = 0;

        while (N > 1) {
            int ex = 0;
            while (N % fac == 0) {
                N = N / fac;
                ex = ex + 1;
            }
            if (ex > 0) {
                r = r + fac + " ^ " + ex + " * ";
                s = s + fac;
            }
            fac = fac + 1;
        }
        r = r + "1";
        System.out.println(r + " = " + s);

        sc.close();
    }
}
