/*
 * El promedio de practicas de un curso se calcula en base a cuatro practicas calificadas, de las
 * cuales se elimina la nota menor y se promedian las tres notas mas altas. Diseñe un algoritmo
 * que imprima: la nota eliminada y el promedio de practicas de un estudiante.
 */
import java.util.Scanner;

public class Condicionales_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        int n1 = sc.nextInt();
        System.out.print("Nota 2: ");
        int n2 = sc.nextInt();
        System.out.print("Nota 3: ");
        int n3 = sc.nextInt();
        System.out.print("Nota 4: ");
        int n4 = sc.nextInt();
        
        int m = Math.min(n1, Math.min(n2, Math.min(n3, n4)));
        double P = (n1 + n2 + n3 + n4 - m) / 3.0;
        
        System.out.println("Nota eliminada " + m);
        System.out.println("Promedio: " + P);
        
        sc.close();
    }
}
