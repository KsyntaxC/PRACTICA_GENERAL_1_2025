'''
Dado un numero N, expresarlo como la multiplicacion de sus divisores primos primos con su
potencia correspondiente y hallar la suma de esos multiplos primos.
Sugerencia: Para mejorar la presentacion de la multiplicacion, al concatenar el caracter
añadir un 1 al final de la cadena, pero no tomarlo en cuenta para la suma.
'''
N=int(input("N: "))
original=N
fac=2
r=""
s=0
while N>1:
    ex=0
    while N%fac==0:
        N=N//fac
        ex=ex+1
    if ex>0:
        r=r+str(fac)+" ^ "+str(ex)+" * "
        s=s+fac
    fac=fac+1
r=r+"1"
print(r,"  = ",s)