/*
 * Descripcion: Una cadena se llama bailarina, si y solo si, la primera letra es mayuscula y cada una de las demas letras es lo opuesto a la anterior letra (mayuscula, minuscula,
 * mayuscula, minuscula, ..., etc.).
 * Por ejemplo AbCd es una cadena bailarina, la primera letra es A mayuscula, la segunda letra
 * es b minuscula, la siguiente letra es C mayuscula y por ultimo d es minuscula.
 * Ahora, debes construir un programa para que lea varios casos de prueba y que convierta la
 * cadena de texto en una cadena BAILARINA.
 * Entrada: La entrada consiste en un entero T numero de casos de prueba, seguido por T
 * lineas, cada una contiene una cadena de texto, puede ser que este vacia.
 * Salida: Imprimir una linea por cada caso de prueba, que contiene la cadena bailarina
 * resultado.
 * Descripcion: Una cadena se llama bailarina, si y solo si, la primera letra es mayuscula
 * y cada una de las demas letras es lo opuesto a la anterior letra (mayuscula, minuscula,
 * mayuscula, minuscula, ..., etc.). Ahora, debes construir un programa para que lea varios casos de
 * prueba y que convierta la cadena de texto en una cadena BAILARINA.
 * Entrada: La entrada consiste en un entero T numero de casos de prueba, seguido por
 * T lineas, cada una contiene una cadena de texto, puede ser que este vacia.
 * Salida: Imprimir una linea por cada caso de prueba, que contiene la cadena bailarina
 * resultado.
 */
import java.util.Scanner;

public class Repetitivas_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < T; i++) {
            String cad = sc.nextLine();
            StringBuilder ba = new StringBuilder();
            int cc = 0;

            for (int j = 0; j < cad.length(); j++) {
                char c = cad.charAt(j);
                if (c != ' ') {
                    if (cc % 2 == 0) {
                        ba.append(Character.toUpperCase(c));
                    } else {
                        ba.append(Character.toLowerCase(c));
                    }
                    cc++;
                } else {
                    ba.append(' ');
                }
            }
            System.out.println(ba.toString());
        }

        sc.close();
    }
}
