'''
Sumatoria de tribonacci
'''
N=int(input("Casos de prueba: "))
for i in range(N):
    C=int(input("C: "))
    a=0; b=-1; c=1; tribo=a+b+c; s=0
    for j in range(C):
        a=b; b=c; c=tribo; tribo=a+b+c
        s=s+tribo
    print(s)