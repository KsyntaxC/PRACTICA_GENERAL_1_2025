'''
Dado un numero entero N averiguar la cantidad de digitos que tiene este
numero, y ademas determinar cual es su k -esimo digito.
Por ejemplo para N=18421 y k=3 , el numero tiene 5 digitos y el tercer digito es 4 .
Entrada: La entrada consta de dos numeros N (1 <=N <=1018 ), el numero a evaluar,
y K el digito que estamos interesados en conocer, se garantiza que K siempre sera menor o
igual al numero de digitos de N .
Salida: La salida consta de dos numeros separados por un espacio, la cantidad de digitos 
del numero N , y el k-esimo digito de este
'''
import math
N=int(input("N: "))
cd=int(math.log10(N)+1)
K="Error"; cdig=cd
k=int(input("k-esimo digito: "))
for i in range(1,cd+1):
    d=N//(10**(cd-1))
    N=N%(10**(cd-1))
    cd=cd-1
    if i==k:
        K=d
print("Cantidad de dígitos:",cdig)
print("k-ésimo digito:",K)