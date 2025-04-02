/*
 * Hay tres hermanos llamados A, B y C. Las relaciones de edad entre ellos se dan mediante
 * tres caracteres SAB, SAC, y SBC, que significan lo siguiente:
 * Si SAB es < , entonces A es más joven que B; si es >, entonces A es mayor que B.
 * Si SAC es <, entonces A es más joven que C; si es >, entonces A es mayor que C.
 * Si SBC es <, entonces B es mas joven que C; si es >, entonces B es mayor que C.
 * Restricción: Cada uno de SAB, SAC, y SBC es < o >.
 * Entrada: La entrada consta de tres caracteres que representan SAB, SAC, y SBC respectivamente.
 * Salida: Imprime el nombre del hermano mediano, es decir, el segundo mayor de los tres
 */
import java.util.Scanner;

public class Condicionales_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la relación de A con B ('<' o '>'): ");
        char sab = sc.next().charAt(0);
        System.out.print("Ingrese la relación de A con C ('<' o '>'): ");
        char sac = sc.next().charAt(0);
        System.out.print("Ingrese la relación de B con C ('<' o '>'): ");
        char sbc = sc.next().charAt(0);
        
        String h_med = "";
        
        if (sab == '<' && sac == '>' && sbc == '<') {
            h_med = "A";
        } else if (sab == '>' && sac == '>' && sbc == '>') {
            h_med = "B";
        } else if (sab == '<' && sac == '<' && sbc == '>') {
            h_med = "C";
        } else if (sab == '<' && sac == '<' && sbc == '<') {
            h_med = "B";
        } else if (sab == '>' && sac == '<' && sbc == '>') {
            h_med = "A";
        } else if (sab == '>' && sac == '<' && sbc == '<') {
            h_med = "C";
        } else if (sab == '<' && sac == '>' && sbc == '>') {
            h_med = "C";
        } else if (sab == '>' && sac == '>' && sbc == '<') {
            h_med = "A";
        } else {
            System.out.println("Ingrese los valores indicados");
            sc.close();
            return;
        }
        
        System.out.println("El hermano mediano es: " + h_med);
        
        sc.close();
    }
}
