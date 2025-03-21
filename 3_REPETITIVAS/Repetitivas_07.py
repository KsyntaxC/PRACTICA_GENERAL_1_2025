'''
Durante las elecciones presidenciales en Venezuela, el equipo de ciberseguridad esta trabajando para asegurar el sistema de votaci´on en l´ınea. Uno de los desaf´ıos actuales es garantizar
que los codigos de acceso para los candidatos y los miembros del equipo de campaña sean
seguros.
El equipo ha decidido que los codigos de acceso seguros deben cumplir con las siguientes
condiciones:
El codigo debe consistir unicamente en letras latinas minusculas y digitos.
No debe haber ningun digito que aparezca despues de una letra.
Todos los digitos deben estar ordenados en orden no decreciente.
Todas las letras deben estar ordenadas en orden no decreciente.
Es importante tener en cuenta que se permite que el codigo tenga solo letras o solo digitos. El
equipo ha implementado la primera condicion, pero esta teniendo dificultades con las demas.
¿Puedes ayudarles a verificar si los codigos de acceso cumplen con todas las condiciones
requeridas?
Entrada: La primera linea de la entrada contiene un unico numero entero N (1 ≤ N ≤ 1000)
el numero de casos de prueba. La primera linea de cada caso de prueba contiene un unico
numero entero n (1 ≤ n ≤ 20) la longitud de la contraseña. La segunda linea contiene una
cadena, que consiste en exactamente n caracteres. Cada caracter es una letra latina minuscula o un digito.
Salida: Para cada caso de prueba, imprima ”SI” si la contraseña proporcionada es segura
y ”NO” caso contrario..
'''
N=int(input("N: "))
while 1>N>1000:
    print("N debe ser (1 ≤ N ≤ 1000)")
    N=int(input("N:"))
for i in range(N):
    n=int(input("Longitud de la contraseña: "))
    while 1>n>20:
        print("Debe contener entre 1 a 20 caractereres: ")
        n=int(input("Longitud de la cadena: "))
    cad=input("Ingrese la cadena: ")
    if len(cad)==n:
        c=""
        d=""
        es_valido=True
        uc = ''
        ud = '0'
        d_en = False
        for c in cad:
            if 'a' <= c <= 'z':
                if d_en:
                    es_valido = False
                if c and c < uc:
                    es_valido = False
                c += c
                uc = c
            elif '0' <= c <= '9':
                d_en = True
                if d and c < ud:
                    es_valido = False
                d += c
                ud = c
            else:
                es_valido = False
        if es_valido:
            print("NO")
        else:
            print("SI")
       
    else:
        print("NO")