/*
 * Se necesita convertir un numero binario en su equivalente decimal. Para
 * ello, se debe interpretar el numero dado en base 2 y calcular su valor en base 10.
 * Nota: Usar descomposicion de numeros para procesar los digitos individualmente.
 * Entrada: La entrada consiste en multiples casos de prueba. Cada caso es un numero binario
 * de hasta 16 bits. La entrada termina cuando no hay mas datos.
 * Salida: Para cada numero binario de entrada, imprimir su equivalente en decimal en una linea
 */
import java.util.Scanner;

public class Des_Comp_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int bin = scanner.nextInt();
            int dec = 0, ex = 1;
            
            while (bin > 0) {
                int d = bin % 10;
                bin /= 10;
                dec += d * ex;
                ex *= 2;
            }
            
            System.out.println(dec);
        }
        scanner.close();
    }
}