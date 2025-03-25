'''
NUMEROS BALANCEADOS
En este ejercicio decimos que un numero es balanceado si la suma de sus
digitos en posiciones pares es igual a la suma de sus digitos en posiciones impares. 
Nota: usar descomposicion de numeros.
'''
n=int(input("Intro N: "))
i=1; x=0; y=0
while n!=0:
    d=n%10; 
    n=n//10
    if i%2==0:
        y=y+d
    else:
        x=x+d
    i=i+1
if x==y:
    print("SI")
else:
    print("NO")