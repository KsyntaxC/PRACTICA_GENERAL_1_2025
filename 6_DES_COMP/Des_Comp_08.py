'''
Dado un numero N imprimir algun otro que tenga n digitos, sea multiplo de 3 y sea minimo.
'''
N=int(input("N: "))
n=10**(N-1)
while n%3!=0:
    n=n+1
print(n)
#Aunque seria sumar +2 a cualquier n tambien xd