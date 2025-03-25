'''
Dado un lote de N numeros, determinar los divisores de cada numero.
Entrada: La primera linea contiene un numero N(1 ≤ N ≤ 1000), el cual indica cuantos
numeros leer. Las siguientes N lineas contienen un N-esimo numero por linea (2 ≤ ni ≤ 1000)
Salida: Imprima los divisores de cada numero
'''
N=int(input("N: "))
while 1>N>1000:
    print("N(1 ≤ N ≤ 1000)")
    N=int(input("N: "))
for i in range(1,N+1):
    print()
    ni=int(input(f"n{i}: "))
    while 2>ni>1000:
        print("(2 ≤ ni ≤ 1000)")
        ni=int(input(f"n{i}: "))
    print(f"Divisores de {ni}: ",end=" ")
    for j in range(1,ni+1):
        if ni%j==0:
            print(j,end=" ")