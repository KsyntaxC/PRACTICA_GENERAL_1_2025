/*
 * Verificar si la fecha proporcionada es correcta.
 * Entrada: La entrada consiste de tres números enteros a,b,c. Representando el día, mes y año.
 */
import java.util.Scanner;

public class Condicionales_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Día: ");
        int a = sc.nextInt();
        System.out.print("Mes: ");
        int b = sc.nextInt();
        System.out.print("Año: ");
        int c = sc.nextInt();
        
        boolean fechaCorrecta = false;
        if (b >= 1 && b <= 12 && c > 0) {
            int max_dia;
            if (b == 2) {
                if ((c % 4 == 0 && c % 100 != 0) || (c % 400 == 0)) {
                    max_dia = 29;
                } else {
                    max_dia = 28;
                }
            } else if (b == 4 || b == 6 || b == 9 || b == 11) {
                max_dia = 30;
            } else {
                max_dia = 31;
            }
            
            if (a >= 1 && a <= max_dia) {
                fechaCorrecta = true;
            }
        }
        
        if (fechaCorrecta) {
            System.out.println("Fecha Correcta");
        } else {
            System.out.println("Fecha Incorrecta");
        }
        
        sc.close();
    }
}