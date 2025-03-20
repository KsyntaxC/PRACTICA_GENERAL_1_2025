/*
 * Conversión de Binario a Decimal
 * Descripción: Un número binario está compuesto únicamente por los dígitos 0 y 1. Romer
 * necesita tu ayuda para convertir un número binario de 8 bits a decimal, ya que ha olvidado
 * cómo hacerlo.
 * Entrada: La entrada consiste en 8 numeros que tendras valores de 0 o 1 .
 * Salida: Imprima el equivalente decimal del número binario
 */
import java.util.Scanner;
public class Secuenciales_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número binario de 8 bits, únicamente 0 y 1: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        int g=sc.nextInt();
        int h=sc.nextInt();
        int D=a*128+b*64+c*2+d*6+e*8+f*4+g*2+h*1;
        System.out.print("Binario: ");
        System.out.print(a+""+b+""+c+""+d+""+e+""+f+""+g+""+h);
        System.out.println();
        System.out.println("Decimal: "+D);
        sc.close();
    }
}
