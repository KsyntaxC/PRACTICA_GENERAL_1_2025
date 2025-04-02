/*
 * Descripcion: Dada una cadena con palabras separadas por al menos un espacio, mostrar
 * las palabras que tienen al menos una vocal “o”.
 * Entrada: Una linea con varias palabras (incluyendo espacios y comas).
 * Se garantiza que no hay una coma entre medio de los caracteres de una palabra, es decir
 * ”momen,tos ”no ocurre
 * Salida: Solo las ”palabras”que cumplen la propiedad mencionada.
 */
import java.util.Scanner;

public class Repetitivas_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad = scanner.nextLine();
        int i = 0;
        
        while (i < cad.length()) {
            String p = "";
            int sw = 0;
            
            while (i < cad.length() && cad.charAt(i) != ' ' && cad.charAt(i) != ',') {
                p = p + cad.charAt(i);
                if (cad.charAt(i) == 'o' || cad.charAt(i) == 'O') {
                    sw = 1;
                }
                i++;
            }
            
            if (sw == 1) {
                System.out.println(p);
            }
            i++;
        }
    }
}

