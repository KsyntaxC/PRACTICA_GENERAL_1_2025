/*
 * Generar la siguiente sumatoria:
 * 1-0 + 1-2 + 1-0 + 1-2 + 3-2 + 1-0 + 1-2 + 3-4 + 3-2 + 1-0 + 1-2 + 3-4 + 5-4...
 */
import java.util.Scanner;

public class Sumatorias_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        
        int sb = 1;
        int m = -1;
        int c = 1;
        int mx = 1;
        int s = 0;
        
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                System.out.print(sb + " - ");
                s += sb;
            } else {
                System.out.print(sb + " + ");
                s -= sb;
            }
            
            sb += m;
            
            if (sb <= 0 || sb > mx) {
                m *= -1;
                c++;
            }
            
            if (c > 2) {
                mx++;
                c = 1;
            }
        }
        
        System.out.println("Resultado: " + s);
    }
}