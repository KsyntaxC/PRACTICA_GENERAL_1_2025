/*
 * Dada la velocidad en metros por segundo de despegue de un avión y la aceleración en metros
 * por segundo se pide calcular el tamaño de la pista utilice la formula D = V
 * 2/2A.
 */
import java.util.Scanner;
public class Secuenciales_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Velocidad en metros por segundo: ");
        float V=sc.nextFloat();
        System.out.print("Aceleracion en metros por segundo: ");
        float A=sc.nextFloat();
        float D=(V*V)/(2*A);
        System.out.println("Tamaño de la pista: "+D);
        sc.close();
    }
}
