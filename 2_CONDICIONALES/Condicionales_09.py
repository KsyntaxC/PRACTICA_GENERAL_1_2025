'''
Descripcion: En el reino de los Insanos Herland, Sami y Luisin estan jugando un juego, en cada ronda del juego cada uno de ellos grita un numero cualquiera, pero casualmente
dos de ellos siempre dicen el mismo numero (esto solo es posible en el reino de los Insanos).
Ahora tu trabajo es hacer un programa que imprima el nombre de la persona que dijo el
numero diferente.
Entrada: Se te dara un entero N que es el numero de rondas que se jugaran.Luego siguen N lineas, donde cada linea contiene 3 enteros separados por un espacio, a,b y c que
representan el numero que dijo Herland, Sami y Luisin respectivamente.
Salida: Por cada ronda del juego, debes imprimir el nombre de la persona que dijo el
numero diferente.
'''
#PARA HACER LO DE LAS N LINEAS SE DEBE UTILIZAR UN CICLO (LOTES) SIN ESO NO SE PUEDE WTF
N=int(input("Intro N: "))
for i in range (N):
    a,b,c=map(int,input("Herland, Sami, Luisin: ").split())
    if a==b and a!=c:
        print("Luisin")
    elif a==c and a!=b: 
        print("Sami")
    elif b==c and b!=a:
        print("Herland")
    else:
        print("Dos de ellos siempre dicen el mismo numero, PORQUE SON INSANOS")