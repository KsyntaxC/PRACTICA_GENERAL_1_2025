/*
 * Dados dos números enteros a y b, determinar el cociente y resto de la división a ÷ b, sin
 * utilizar el operador módulo %, siendo el entero b distinto de cero.
 */
import java.util.Scanner;
public class Secuenciales_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,coc,rst;
        System.out.println("Intro a: "); a=sc.nextInt();
        do{System.out.println("Intro b: ");b=sc.nextInt();
        }while(b<=0);
        coc=a/b;
        rst=a-(b*coc);
        if(a==0)rst=rst+b;  //Sin el if no se da el caso dos xdxd
        System.out.println("Cociente: "+coc);
        System.out.println("Resto: "+rst);
        sc.close();
    }
}
