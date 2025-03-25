'''
Dado un lote de N numeros enteros Ai (1 ≤ i ≤ N ≤ 1000), donde 0 ≤ Ai ≤ 100000 contar
la cantidad de digitos 1, 3, 5, 7, 9 que existen.
Si N = 9 y los Ai = 12, 45, 981, 230190, 2, 45, 1354, 0, 54
Existen 4 uno s
Existen 2 tres s
Existen 4 cinco s
Existen 0 siete s
Existen 2 nueve s
'''
import math
N=int(input("N: "))
while N<1 or N>1000:
    print("(1 ≤ i ≤ N ≤ 1000)")
    N=int(input("N: "))
c1=0;c3=0;c5=0;c7=0;c9=0
for i in range(1,N+1):
    A=int(input(f"A{i}: "))
    while A<0 or A>100000:
        print("A (0 ≤ Ai ≤ 100000)")
        A=int(input(f"A{i}: "))
    while A>0:
        d=A%10
        A=A//10
        if d==1:
            c1=c1+1
        elif d==3:
            c3=c3+1
        elif d==5:
            c5=c5+1
        elif d==7:
            c7=c7+1
        elif d==9:
            c9=c9+1
print("Existen",c1,"uno s")
print("Existen",c3,"tres s")
print("Existen",c5,"cinco s")
print("Existen",c7,"siete s")
print("Existen",c9,"nueve s")
