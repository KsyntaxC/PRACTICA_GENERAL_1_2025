'''
Leer N numeros hasta que la suma de esos digitos sea multiplo de un numero X.
'''
X=int(input("X: "))
N=int(input("N: "))
sd=0
while N!=0:
        d=N%10
        N=N//10
        sd=sd+d
while sd%X!=0:
    sd=0
    N=int(input("N: "))
    while N!=0:
        d=N%10
        N=N//10
        sd=sd+d
print(f"{sd} es multiplo de {X}")