/*
 * Si una persona tiene que llegar a su trabajo que esta a X metros de distancia y ya solo le
 * quedan T minutos, (X y T son datos de entrada)¿A que velocidad constante debería conducir
 * para llegar a tiempo a su trabajo?
 */
import java.util.Scanner;
public class Secuenciales_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Distancia en metros: ");
        int X=sc.nextInt();
        System.out.print("Tiempo en minutos: ");
        int T=sc.nextInt();
        float V=(float)X/(T*60);
        System.out.println("Velocidad: "+V+" m/s");
        sc.close();
    }
}
