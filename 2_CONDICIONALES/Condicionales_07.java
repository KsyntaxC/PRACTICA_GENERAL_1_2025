/*
 * En un caluroso día en la ciudad de La Paz, dos hermanos, Pepito y su amigo Juanito,
 * decidieron comprar una piña en el mercado Camacho. Eligieron la mas grande y jugosa,
 * segun criterio de ambos. Al llegar a la balanza, el vendedor les indicío que la sandia pesaba X
 * kilos. Con el calor intenso, llegaron a casa desesperados por refrescarse, pero se encontraron
 * con un dilema inesperado al intentar dividir la fruta.
 * Pepito y Juanito son fanaticos de los numeros pares, por lo que quieren partir la piña de
 * manera que cada una de las dos partes pese un numero par de kilos. No es necesario que
 * las dos partes sean iguales, pero ambas deben cumplir con la condicion de ser pares. Los
 * hermanos estan agotados por el calor y quieren empezar a disfrutar de la piña lo antes
 * posible, por lo que debes ayudarlos a determinar si es posible dividirla de la forma que ellos
 * desean. Ademas, es importante que cada parte tenga un peso positivo para que ambos puedan
 * disfrutar de la fruta.
 * Entrada: La primera y unica linea de entrada contiene un numero entero X (1 ≤ X ≤ 100),
 * el peso de la piña.
 * Salida: Imprime ”SI”, si los hermanos pueden dividir la piña en dos partes, cada una con
 * un nuero par de kilos; y ”NO.en el caso contrario.
 */
import java.util.Scanner;

public class Condicionales_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kilos: ");
        int x = sc.nextInt();
        
        while (x < 1 || x > 100) {
            System.out.print("Kilos (1<=x<=100): ");
            x = sc.nextInt();
        }
        
        if (x % 2 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
