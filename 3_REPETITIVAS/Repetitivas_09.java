/*
 * Otra vez, la tarea es sencilla, se le pide que a partir de dos numeros X e Y , calcule el cociente
 * y el residuo de X/Y , pero existe una condicion, debe calcularlo sin hacer uso de la operacion
 * Division y tampoco hacer uso de la operacion modulo. Use for y While segun su conveniencia
 * Entrada: La entrada consiste de dos numeros X e Y ,ambos enteros, donde Y > 0
 */
import java.util.Scanner;

public class Repetitivas_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int coc = 0;
        int res = X;
        
        while (res >= Y) {
            res = res - Y;
            coc++;
        }
        
        System.out.println("Cociente: " + coc);
        System.out.println("Residuo: " + res);
        
        sc.close();
    }
}
