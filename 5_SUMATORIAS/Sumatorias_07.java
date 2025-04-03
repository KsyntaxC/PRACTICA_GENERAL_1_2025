import java.util.Scanner;

public class Sumatorias_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        System.out.print("x: ");
        int x = sc.nextInt();
        
        int sw = 0, p = 2, e = 1, ce = 1;
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
                    
                    if (ce > e) {
                        ce = 1;
                        e++;
                    }
                    ce++;
                    
                    double div = Math.pow(x, e);
                    double t = factorial(primo) / factorial((int)div);
                    
                    if (i % 2 == 0) {
                        s -= t;
                    } else {
                        s += t;
                    }
                }
                if (sw == 0) p++;
            }
            sw = 0;
        }
        System.out.printf("%.2f%n", s);
    }
    
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}