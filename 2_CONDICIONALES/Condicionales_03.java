/*
 * En una cadena de tiendas se tiene el siguiente sistema de descuentos. Los usarios de primera
 * clase tienen un descuento del 20 % en todas sus compras, los usuarios de segunda clase tienen
 * un descuento del 10 % en compras mayores a 400 Bs, mientras que un usuario corriente no
 * tiene ningun descuento, pero por promocion se hace un descuento de 100 Bs por compras
 * superiores a 1200 Bs(el cual se efectua antes de la aplicacion de descuentos especiales). El
 * sistema que usa la cadena es el uso de un ID en cada cliente de forma que los usuarios de
 * primera clase tienen numeros menores a 100 y los usuarios de segunda clase tienen numeros
 * menores a 1000. Muestre el monto que el cliente debe pagar.
 * Entrada: La entrada consiste en numeros a,b, que seran el ID del usuario y la cantidad de
 * su compra.
 */
import java.util.Scanner;

public class Condicionales_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ID de usuario: ");
        int a = sc.nextInt();
        System.out.print("Cantidad de la compra: ");
        double b = sc.nextDouble();
        
        if (b > 1200) {
            b -= 100;
        }
        if (a > 0 && a < 100) {
            b *= 0.80;
        } else if (a >= 100 && a < 1000 && b > 400) {
            b *= 0.90;
        }
        
        System.out.println("Monto a pagar: " + b);
        
        sc.close();
    }
}

