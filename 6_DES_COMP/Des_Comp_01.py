'''
Dado un entero N donde cada digito es diferente de 0, se pide ordenar el numero de mayor
a menor.
'''
#1 Y 5 EN REVISION, NO ESTA ACABADO
import math
N=int(input("N: "))
while N<=0:
    print("N debe ser mayor o igual a 0")
    N=int(input("N: "))
dm=9; dM=0
cd=int(math.log10(N)+1)
po=1; nn=0
while N>0:
    d=N%10
    N=N//10
    temp=N
    cdtemp=int(math.log10(N)+1)
    while temp>0:
        dtemp=temp//10**(cd-1)
        temp=temp%10**(cd-1)
        cd=cd-1
        if d<dtemp:
            d
print(nn)