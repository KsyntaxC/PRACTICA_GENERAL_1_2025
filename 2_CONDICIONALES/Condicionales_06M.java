/*
 * Entrada: La entrada consiste de cinco números enteros a,b,c,d,e. El objetivo es ordenarlos de mayor a menor.
 * ESTA ES LA MEJOR VERSION
 */
import java.util.Scanner;

public class Condicionales_06M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        System.out.print("d: ");
        int d = sc.nextInt();
        System.out.print("e: ");
        int e = sc.nextInt();
        
        if (a < b) {
            int temp = a; a = b; b = temp; 
        }
        if (a < c) {
            int temp = a; a = c; c = temp; 
        }
        if (a < d) {
            int temp = a; a = d; d = temp; 
        }
        if (a < e) {
            int temp = a; a = e; e = temp; 
        }
        if (b < c) {
            int temp = b; b = c; c = temp; 
        }
        if (b < d) {
            int temp = b; b = d; d = temp; 
        }
        if (b < e) {
            int temp = b; b = e; e = temp; 
        }
        if (c < d) {
            int temp = c; c = d; d = temp; 
        }
        if (c < e) {
            int temp = c; c = e; e = temp; 
        }
        if (d < e) {
            int temp = d; d = e; e = temp; 
        }
        
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        
        sc.close();
    }
}
