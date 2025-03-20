/*
 * Dado una base B, una altura H, y una profundidad A, calcule el volumen de un Prisma
 * Triangular
 */
import java.util.Scanner;
public class Secuenciales_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Base: ");
        int B=sc.nextInt();
        System.out.print("Altura: ");
        int H=sc.nextInt();
        System.out.print("Profundidad: ");
        int A=sc.nextInt();
        int V=(B*H*A)/2;
        System.out.println("Volumen: "+V+" m^3");
        sc.close();
    }
}
