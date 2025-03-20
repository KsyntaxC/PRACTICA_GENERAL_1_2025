/*
 * Para el calculo del cobro de un préstamo, se pide que para la cuantificación del pago se tome
en cuenta el dinero prestado, el interés anual y los años en los que la deuda se cancela.
 */
import java.util.Scanner;
public class Secuenciales_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Prestamo: ");
        int a=sc.nextInt();
        System.out.print("Interes: ");
        int b=sc.nextInt();
        System.out.print("Años: ");
        int c=sc.nextInt();
        float Cobro=a*(1+(b/100)*c);
        System.out.println("Cobro:"+Cobro);
        sc.close();
    }
}