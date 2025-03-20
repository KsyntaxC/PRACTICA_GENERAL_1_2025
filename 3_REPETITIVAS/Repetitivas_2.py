'''
Diseñe un algoritmo que dado un numero N, halle la suma de los numeros pares e impares,
muestre por pantalla el resultado de ambas sumas.
'''
N=int(input("N: "))
pa=0;im=0
for i in range(1,N+1):
    if i%2==0:
        pa=pa+i
    else:
        im=im+i
print("Pares:",pa)
print("Impares:",im)