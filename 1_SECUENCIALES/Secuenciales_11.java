/*
 * Descripción: Una tienda desea optimizar la gestión de su inventario para reducir costos. La tienda vende un producto con una demanda anual determinada. Cada vez que realiza
 * un pedido, incurre en un costo fijo, y mantener las unidades en inventario también tiene un
 * costo.
 * El objetivo es calcular la cantidad óptima de productos que debe pedir en cada orden para
 * minimizar los costos totales. Para ello, se usará la fórmula del Lote Económico de Pedido
 * (EOQ, Economic Order Quantity):
 * Entrada: La entrada consiste en tres números decimales donde D es la demanda, S es
 * el costo de cada pedido y H es el costo de almacenamiento por año, en ese orden respectivamente.
 * Salida: Imprima la cantidad de pedidos óptimos para la tienda con formato de número
 * con dos decimales:
 */
import java.util.Scanner;
public class Secuenciales_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Demanda: ");
        int D=sc.nextInt();
        System.out.print("Costo de cada pedido: ");
        double S=sc.nextDouble();
        System.out.print("Costo de almacenamiento: ");
        double H=sc.nextDouble();
        double Q=Math.sqrt((2*D*S)/H);
        System.out.printf("Cantidad de pedidos óptimos: %.2f\n", Q);
        sc.close();
    }
}
