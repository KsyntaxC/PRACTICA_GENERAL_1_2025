/*
 * Un Docente de la Universidad Mayor de San Andres tiene un salario base de X Bs por mes.
 * Por cada Y años de antiguedad del docente, se le otorga un aumento del 5 %, y por cada Z
 * horas que dedica a tutorías y cursos extras, se le suman 20 Bs adicionales. Calcula el salario
 * mensual y de un año del Docente.
 * Considere que 1800 ≤ X ≤ 14000, 1 ≤ Y ≤ 10, 1 ≤ Z ≤ 8 respectivamente.
 */
import java.util.Scanner;
public class Secuenciales_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int X,Y,Z;
        do{System.out.println("Salario base: ");X=sc.nextInt();
        }while(X<1800 || X>14000);
        do{System.out.println("Años de antiguedad: ");Y=sc.nextInt();
        }while(Y<1 || Y>10);
        do{System.out.println("Horas en tutorias y cursos extras: ");Z=sc.nextInt();
        }while(Z<1 || Z>8);
        float au=X*(5/100);
        float SM=X+(Y*au)+(Z*20);
        System.out.println("Sueldo Mensual: "+SM);
        System.out.println("Sueldo anual: "+SM*12);
        sc.close();
    }
}
