/*
 * Dada una temperatura en grados Celsius C, imprima sus respectivos valores en las diferentes
 * escalas de temperatura:
 */
import java.util.Scanner;
public class Secuenciales_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura en grados Celsius: ");
        float C = sc.nextFloat();
        float F = (C * 9 / 5) + 32;
        float K = C + 273.15f;
        float R = (C + 273.15f) * 9 / 5;
        float Re = C * 4 / 5;
        System.out.println("Fahrenheit: " + F + " °F");
        System.out.println("Kelvin: " + K + " °K");
        System.out.println("Rankine: " + R + " °R");
        System.out.println("Réaumur: " + Re + " °Re");
        sc.close();
    }
}
