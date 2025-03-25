'''
Dado un numero n, verificar si este es un Numero Capicua o no.
Entrada: La entrada consiste en un numero n con mas de 2 digitos. Si el numero es Capicua
el resultado se mostrara en pantalla.
'''
import math
n=int(input("n: "))
while n<10:
    n=int(input("n: "))
mo=n; nn=0
while mo>0:
    d=mo%10
    mo=mo//10
    nn=nn*10+d
print(nn)
if nn==n:
    print("Es un número capicua")
else: 
    print("No es un número capicua")