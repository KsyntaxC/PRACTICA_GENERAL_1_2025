'''

'''
import math
N=int(input("N: "))
x=int(input("x: "))
sw=0; p=2; e=1; ce=1; s=0
for i in range(N):
    while sw==0:
        np=1
        for j in range(2, p):
            if p%j==0:
                np=0
        if np==1:
            primo=p
            sw=1
        p=p+1
    sw=0
    if ce>e:
        ce=1; e=e+1
    ce=ce+1
    div=x**e
    t=math.factorial(primo)/math.factorial(div)
    if i%2==0:
        s=s-t
    else:
        s=s+t
print(f"{s:.2f}")
##EL EJEMPLO ESTA MAL AL PONER N=3 Y X=1 SALE 116, COMPRUEBENLO MANUALMENTE SI DUDAN