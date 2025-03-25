'''
Dado un lote de n numeros enteros positivos, mostrar de cada numero leido
el siguiente numero superior que sea multiplo de 7 .
Entrada: La primera linea contiene un numero n, el cual indica cuantos numeros leer.
Las siguientes n -lineas contienen un numero ni por linea.
Salida: De cada numero ni imprimir el siguiente numero que sea multiplo de 7 .
'''
N=int(input("N: "))
while N<=0:
    print("N debe ser un entero positivo")
    N=int(input("N: "))
for i in range(1,N+1):
    n=int(input(f"n{i}: "))
    while n%7!=0:
        n=n+1
    print(n)