/*
 * uez Patito ID: 1605 Serie: 1!/1 + 1!/2 + 2!/2 + 3!/3 + 5!/3 + 8!/3 + 13!/4 + 21!/4 +...
 */
import java.util.Scanner;

public class Series_13 {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();
        scanner.close();
        
        int a = 1, b = 0, fibo = a + b, sc = 1, c = 2;
        
        for (int i = 0; i < N; i++) {
            System.out.print(factorial(fibo) + "/" + sc);
            if (i < N - 1) {
                System.out.print(" + ");
            }
            
            a = b;
            b = fibo;
            fibo = a + b;
            
            if (c > sc) {
                sc++;
                c = 1;
            }
            c++;
        }
    }
}
