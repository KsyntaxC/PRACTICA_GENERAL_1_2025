'''
Dado un lote de N numeros, formar dos nuevos numeros, el primer numero formado por los
pares y el segundo formado por los impares de cada numero del lote, luego determine cual
es mayor o si son iguales.
Entrada: La primera linea contiene un numero N(1 ≤ N ≤ 1000), la cantidad de numeros que el lote posee.
Las siguientes N ineas contienen un entero a(1 ≤ a ≤ 9) .
Salida: Imprima el numero mayor o si son iguales imprima ”SON IGUALES”
'''
N=int(input("Introduce N: "))
while N<1 or N>1000:
    print("N(1 ≤ N ≤ 1000)")
    N=int(input("Introduce N: "))
P=0; IM=0
for i in range (1,N+1):
    a=int(input(f"a{i}: "))
    while a<1 or a>9:
        print("a(1 ≤ a ≤ 9)")
        a=int(input(f"a{i}: "))
    if a%2==0:
        P=P*10+a
    else:
        IM=IM*10+a
if P>IM:
    print(P)
elif P<IM:
    print(IM)
else: 
    print("SON IGUALES")