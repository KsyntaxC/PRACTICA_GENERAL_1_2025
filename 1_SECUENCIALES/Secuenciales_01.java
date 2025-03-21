/*
 * Dado un número entero N expresado en segundos, transformar en horas minutos y segundos,
en el siguiente formato, HH : MM : SS.
 */
import java.util.Scanner;
public class Secuenciales_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Intro N: ");
        int N=sc.nextInt();
        int h=N/3600;
        int m=(N%3600)/60;
        int s=N%60;
        System.out.printf("%02d:%02d:%02d%n",h,m,s);
        sc.close();
    }
}