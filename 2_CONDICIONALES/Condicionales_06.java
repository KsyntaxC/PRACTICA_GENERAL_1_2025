/*
 * Entrada: La entrada consiste de cinco números enteros a,b,c,d,e. El objetivo es ordenarlos de mayor a menor.
 * ESTA ES LA OPCION MAS LARGA
 */
import java.util.Scanner;

public class Condicionales_06 {
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
        
        int m1, m2, m3, m4, m5; 
        
        if (a > b) {
            m1 = a; m2 = b;
        } else {
            m1 = b; m2 = a;
        }
        
        if (c > m1) {
            m3 = m2; m2 = m1; m1 = c;
        } else {
            if (c > m2) {
                m3 = m2; m2 = c;
            } else {
                m3 = c;
            }
        }
        
        if (d > m1) {
            m4 = m3; m3 = m2; m2 = m1; m1 = d;
        } else {
            if (d > m2) {
                m4 = m3; m3 = m2; m2 = d;
            } else {
                if (d > m3) {
                    m4 = m3; m3 = d;
                } else {
                    m4 = d;
                }
            }
        }
        
        if (e > m1) {
            m5 = m4; m4 = m3; m3 = m2; m2 = m1; m1 = e;
        } else {
            if (e > m2) {
                m5 = m4; m4 = m3; m3 = m2; m2 = e;
            } else {
                if (e > m3) {
                    m5 = m4; m4 = m3; m3 = e;
                } else {
                    if (e > m4) {
                        m5 = m4; m4 = e;
                    } else {
                        m5 = e;
                    }
                }
            }
        }
        
        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5);
        
        sc.close();
    }
}