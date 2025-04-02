/*
 * Descripción: Escriba un programa tal que dado 2 intervalos, calcule el intervalo que corresponde 
 * a su interseccion o indica si esta vacio.
 * Entrada: La entrada consiste de cuatro números enteros a1, b1, a2, b2, que representan los
 * intervalos [a1, b1] y [a2, b2]. Asuma que a1 ≤ b1 y a2 ≤ b2
 * Salida: Imprima [] si la intersección está vacía o [x, y] si la intersección no está vacía.
 */

import java.util.Scanner;
public class Condicionales_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRIMER INTERVALO");
        System.out.print("Desde a1: ");
        int a1 = sc.nextInt();
        System.out.print("Hasta b1: ");
        int b1 = sc.nextInt();
        System.out.println("SEGUNDO INTERVALO");
        System.out.print("Desde a2: ");
        int a2 = sc.nextInt();
        System.out.print("Hasta b2: ");
        int b2 = sc.nextInt();
        int ini = (a1 > a2) ? a1 : a2;
        int fin = (b1 < b2) ? b1 : b2;
        if (ini <= fin) {
            System.out.println("[" + ini + "," + fin + "]");
        } else {
            System.out.println("[]");
        } 
        sc.close();
    }
}
