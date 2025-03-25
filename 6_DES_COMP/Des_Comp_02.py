'''
Descripcion: Se te dara un numero x y tu tarea es rotar sus digitos n veces a la izquierda.
Entrada: La entrada consiste en T casos de prueba, para cada caso se te dara dos numeros
enteros x y n.
Salida: La salida debera ser el numero x rotado n veces a la izquierda
'''
import math
T=int(input("T casos de prueba: "))
for i in range(T):
    x=int(input("Numero x: "))
    n=int(input("N rotaciones: "))
    cd=int(math.log10(x)+1)
    for j in range(n):
        d=x//(10**(cd-1))
        x=x%(10**(cd-1))
        x=x*10+d
    print(x)