'''
Dado un numero x llevar los digitos primos al inicio del numero si el numero es impar, en el
caso de que el numero sea par llevar a los numeros primos al final del numero
'''
x=int(input("x: "))
p=0; po=1; z=0; po2=1; con=x
while x>0:
    d=x%10
    x=x//10
    if d==2 or d==3 or d==5 or d==7:
        p=d*po+p
        po=po*10
    else:
        z=d*po2+z
        po2=po2*10
if con%2==0:
    nn=z*po+p
else:
    nn=p*po2+z
print(nn)
    