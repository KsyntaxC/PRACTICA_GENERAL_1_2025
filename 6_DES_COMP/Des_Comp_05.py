'''
Dado un numero x(11111 ≤ x ≤ 999999999) cuyos digitos son distintos de cero se pide rotar
los digitos pares N veces hacia la izquierda.'''

import math
x=int(input("Intro x: "))
n=int(input("N rotaciones: "))
while x<0: x=int(input("Intro x: "))
cd=int(math.log10(x))+1
r=0
while x>0:
    if cd>n:
        g=x//(10**(cd-n))
        x%=(10**(cd-n))
        cd = int(math.log10(x)) + 1
        rot = 0
        for i in range(n):
            rot = rot * 10 + g % 10
            g //= 10
        r = r * (10 ** n) + rot
    else:
        r=r*10+x
        x=0
print(r)