/*
 * Serie S
 * 1 / 2 - 1 / 3 + 2 / 5 + 4 / 7 - 7 / 11 - 13 / 13 - 24 / 17 + 44 / 19
 */
import java.util.Scanner;

public class Sumatorias_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("S: ");
        int N = sc.nextInt();
        
        int a = -1, b = 1, c = 0, dv = a + b + c;
        int sw = 0, p = 2, sig = -1, cn = 1, con = 1;
        double s = 0;
        
        for (int i = 0; i < N; i++) {
            while (sw == 0) {
                int np = 1;
                for (int j = 2; j < p; j++) {
                    if (p % j == 0) np = 0;
                }
                if (np == 1) {
                    int primo = p;
                    sw = 1;
                    p++;
                    
                    a = b;
                    b = c;
                    c = dv;
                    dv = a + b + c;
                    
                    if (cn >= con) {
                        sig *= -1;
                        con++;
                        cn = 1;
                    }
                    cn++;
                    
                    if (sig < 0) {
                        System.out.print(dv + "/" + primo + " + ");
                        s -= (double)dv / primo;
                    } else {
                        System.out.print(dv + "/" + primo + " - ");
                        s += (double)dv / primo;
                    }
                }
                if (sw == 0) p++;
            }
            sw = 0;
        }
        System.out.println(" = " + s);
    }
}