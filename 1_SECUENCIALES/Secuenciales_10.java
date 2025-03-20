/*
 * Descripción: Dadas las horas, minutos y segundos se le pide sumar un segundo.
 * Entrada: La entrada consiste de 3 números enteros separados por un espacio que representan las horas minutos y segundos. Donde horas < 24, minutos < 60 segundos < 60.
 * Salida: Imprima en la salida la nueva hora del reloj en formato mostrado en el ejemplo.
 * Las horas, minutos y segundos deben estar en el siguiente formato:
 * XX:YY:ZZ
 * Se debe poner ceros a la izquierda de los numeros si es necesario.
 */
import java.util.Scanner;
public class Secuenciales_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int XX, YY, ZZ;
        do {System.out.print("Hora: ");XX=sc.nextInt();
        }while (XX < 0 || XX >= 24);
        do {System.out.print("Minutos: ");YY=sc.nextInt();
        }while (YY < 0 || YY >= 60);
        do {System.out.print("Segundos: ");ZZ=sc.nextInt();
        }while (ZZ < 0 || ZZ >= 60);
        int TS = XX * 3600 + YY * 60 + ZZ + 1;
        int h = (TS / 3600) % 24;
        int m = (TS / 60) % 60;
        int s = TS % 60;
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
        sc.close();
    }
}
