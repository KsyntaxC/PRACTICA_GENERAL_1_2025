'''
Dado un numero N(1 ≤ N < 1000000000), eliminar sus digitos que se encuentren detras de
un 3 o 7.
'''
import math
N=int(input("N: "))
while 1>N>=1000000000:
    print("N(1 ≤ N < 1000000000)")
    N=int(input("N: "))
cd=int(math.log10(N)+1)
sw=1; y=0
while N>0:
    d=N//(10**(cd-1))
    N=N%(10**(cd-1))
    cd=cd-1
    if sw==1:
        y=y*10+d
    if d==3 or d==7:
        sw=0
    else:
        sw=1
print(y)