'''
Descripcion: Algunos operadores verifican la relacion entre dos valores y estos operadores
se denominan operadores relacionales. Dado dos valores numericos, su trabajo es solamente
determinar la relacion entre ellos:
El primero es mayor que el segundo. El primero es menor que el segundo. El primero y el
segundo son iguales.
Entrada: La primera linea del archivo de entrada es un numero entero t (t ¡15), que indica
cuantos pares de numeros se tiene en la entrada. Cada una de las siguientes t lineas, contiene
dos enteros a y b (—a—,—b—). La entrada termina cuando no hay mas datos
por leer.
Salida: Para cada linea de entrada se produce una linea de salida. Esta linea contiene
alguno de los siguientes operadores relacionales "<,>,=.”, el cual indica la relacion apropiada
entre los dos numeros.
'''
#PARA HACER LO DE LAS t LINEAS SE DEBE UTILIZAR UN CICLO (LOTES) SIN ESO NO SE PUEDE WTF
t=int(input("t intentos: "))
for i in range(t):
    a,b=map(int,input("Ingrese un par de números: ").split())
    if a>b:
        print(">")
    elif a<b:
        print("<")
    else:
        print("=")