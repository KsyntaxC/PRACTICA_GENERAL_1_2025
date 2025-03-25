'''
Dado un numero n crear dos nuevos numeros, en el primero estaran digitos mayores que 5 y
en el segundo los menores o iguales 5.
'''
n=int(input("n: "))
M=0; m=0; poM=1; pom=1
while n>0:
    d=n%10
    n=n//10
    if d>5:
        M=d*poM+M
        poM=poM*10
    else:
        m=d*pom+m
        pom=pom*10
print("Mayores a 5: ",M)
print("Menores o iguales a 5: ",m)