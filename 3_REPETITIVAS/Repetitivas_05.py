'''
Generar toda la tabla de multiplicar (del 1 al 10) dado un N.
'''
N=int(input("N: "))
for i in range(1,11):
    r=N*i
    print(N,"x",i,"=",r)