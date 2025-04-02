'''
Dado un numero x(11111 ≤ x ≤ 999999999) cuyos digitos son distintos de cero se pide rotar
los digitos pares N veces hacia la izquierda.'''

'''
Dado un número positivo, rotar cada 3 digitos.
Ejm: x=1234567 --> x=3216547
'''
import math
x=int(input("Intro x: "))
while x<0: x=int(input("Intro x: "))
cd=int(math.log10(x))+1
r=0
while x>0:
    if cd>3:
        g=x//(10**(cd-3))
        x%=(10**(cd-3))
        cd = int(math.log10(x)) + 1
        rot = 0
        for i in range(3):
            rot = rot * 10 + g % 10
            g //= 10
        r = r * (10 ** 3) + rot
    else:
        r=r*10+x
        x=0
print(r)