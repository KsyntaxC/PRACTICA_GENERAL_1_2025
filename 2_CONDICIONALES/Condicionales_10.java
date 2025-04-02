/*
 * Escriba un programa que tome como entrada un numero M donde 1 ≤ M ≤ 12 y devuelva
 * el nombre del mes correspondiente en español.
 */
import java.util.Scanner;

public class Condicionales_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("M: ");
        int M = sc.nextInt();
        
        if (M == 1) {
            System.out.println("Enero");
        } else if (M == 2) {
            System.out.println("Febrero");
        } else if (M == 3) {
            System.out.println("Marzo");
        } else if (M == 4) {
            System.out.println("Abril");
        } else if (M == 5) {
            System.out.println("Mayo");
        } else if (M == 6) {
            System.out.println("Junio");
        } else if (M == 7) {
            System.out.println("Julio");
        } else if (M == 8) {
            System.out.println("Agosto");
        } else if (M == 9) {
            System.out.println("Septiembre");
        } else if (M == 10) {
            System.out.println("Octubre");
        } else if (M == 11) {
            System.out.println("Noviembre");
        } else if (M == 12) {
            System.out.println("Diciembre");
        } else {
            System.out.println("Solo hay 12 meses genio");
        }
        
        sc.close();
    }
}
