'''
Hallar el factorial de un numero N
'''
N=int(input("N: "))
while N<0:
    print("N no debe ser negativo")
    N=int(input("N:"))
if N!=0:
    f=1
    for i in range(1,N+1):
        f=f*i
    print(N,"! =",f)
else:
    print(N,"! = 1")