/*
 * Escribe un programa que dado dos puntos con coordenadas (x1, y1) y (x2, y2) calcule la
distancia D entre los dos puntos. Debe mostrar la salida con formato de 2 decimales.
Use la siguiente fórmula:
 */
import java.util.Scanner;
public class Secuenciales_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("x1: ");
        int x1=sc.nextInt();
        System.out.print("y1: ");
        int y1=sc.nextInt();
        System.out.print("x2: ");
        int x2=sc.nextInt();
        System.out.print("y2: ");
        int y2=sc.nextInt();
        double D=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("%.2f%n",D);
        sc.close();
    }
}