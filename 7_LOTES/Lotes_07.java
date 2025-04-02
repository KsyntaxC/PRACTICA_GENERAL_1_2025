/*
 * Dado un lote de N numeros, formar dos nuevos numeros, el primer numero formado por los
 * pares y el segundo formado por los impares de cada numero del lote, luego determine cual
 * es mayor o si son iguales.
 * Entrada: La primera linea contiene un numero N(1 ≤ N ≤ 1000), la cantidad de numeros que el lote posee.
 * Las siguientes N ineas contienen un entero a(1 ≤ a ≤ 9) .
 * Salida: Imprima el numero mayor o si son iguales imprima ”SON IGUALES”
 */
import java.util.Scanner;

public class Lotes_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        while (N < 1 || N > 1000) {
            System.out.println("N(1 ≤ N ≤ 1000)");
            N = scanner.nextInt();
        }
        
        int P = 0, IM = 0;
        
        for (int i = 1; i <= N; i++) {
            int a = scanner.nextInt();
            
            while (a < 1 || a > 9) {
                System.out.println("a(1 ≤ a ≤ 9)");
                a = scanner.nextInt();
            }
            
            if (a % 2 == 0) {
                P = P * 10 + a;
            } else {
                IM = IM * 10 + a;
            }
        }
        
        if (P > IM) {
            System.out.println(P);
        } else if (P < IM) {
            System.out.println(IM);
        } else {
            System.out.println("SON IGUALES");
        }
        
        scanner.close();
    }
}
