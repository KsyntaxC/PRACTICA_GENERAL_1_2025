'''
Dado un conjunto de N numeros enteros, imprimir el numero que resulta de la concatenacion
de los numeros dados.
'''
import math
N=int(input("N: "))
nn=0; po=1
for i in range(N):
    n=int(input("n: "))
    cd=int(math.log10(n)+1)
    while n>0:
        d=n//(10**(cd-1))
        n=n%(10**(cd-1))
        cd=cd-1
        nn=nn*10+d
print(nn)