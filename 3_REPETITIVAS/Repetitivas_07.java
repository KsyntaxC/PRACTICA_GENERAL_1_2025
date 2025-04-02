/*
 * Durante las elecciones presidenciales en Venezuela, el equipo de ciberseguridad esta trabajando para asegurar el sistema de votaci´on en l´ınea. Uno de los desaf´ıos actuales es garantizar
 * que los codigos de acceso para los candidatos y los miembros del equipo de campaña sean
 * seguros.
 * El equipo ha decidido que los codigos de acceso seguros deben cumplir con las siguientes
 * condiciones:
 * El codigo debe consistir unicamente en letras latinas minusculas y digitos.
 * No debe haber ningun digito que aparezca despues de una letra.
 * Todos los digitos deben estar ordenados en orden no decreciente.
 * Todas las letras deben estar ordenadas en orden no decreciente.
 * Es importante tener en cuenta que se permite que el codigo tenga solo letras o solo digitos. El
 * equipo ha implementado la primera condicion, pero esta teniendo dificultades con las demas.
 * ¿Puedes ayudarles a verificar si los codigos de acceso cumplen con todas las condiciones
 * requeridas?
 * Entrada: La primera linea de la entrada contiene un unico numero entero N (1 ≤ N ≤ 1000)
 * el numero de casos de prueba. La primera linea de cada caso de prueba contiene un unico
 * numero entero n (1 ≤ n ≤ 20) la longitud de la contraseña. La segunda linea contiene una
 * cadena, que consiste en exactamente n caracteres. Cada caracter es una letra latina minuscula o un digito.
 * Salida: Para cada caso de prueba, imprima ”SI” si la contraseña proporcionada es segura
 * y ”NO” caso contrario..
 */
import java.util.Scanner;

public class Repetitivas_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        while (N < 1 || N > 1000) {
            System.out.println("N debe ser (1 ≤ N ≤ 1000)");
            N = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            while (n < 1 || n > 20) {
                System.out.println("Debe contener entre 1 a 20 caracteres: ");
                n = sc.nextInt();
            }

            String cad = sc.next();
            if (cad.length() == n) {
                String c = "";
                String d = "";
                boolean es_valido = true;
                char uc = ' ';
                char ud = '0';
                boolean d_en = false;

                for (int j = 0; j < cad.length(); j++) {
                    char currentChar = cad.charAt(j);

                    if (currentChar >= 'a' && currentChar <= 'z') {
                        if (d_en) {
                            es_valido = false;
                        }
                        if (currentChar < uc) {
                            es_valido = false;
                        }
                        c += currentChar;
                        uc = currentChar;
                    } else if (currentChar >= '0' && currentChar <= '9') {
                        d_en = true;
                        if (currentChar < ud) {
                            es_valido = false;
                        }
                        d += currentChar;
                        ud = currentChar;
                    } else {
                        es_valido = false;
                    }
                }

                if (es_valido) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
