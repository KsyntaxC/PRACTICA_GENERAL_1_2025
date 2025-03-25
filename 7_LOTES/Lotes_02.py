'''
Dado un lote de N numeros enteros Ai donde (1 ≤ n ≤ 1000) y 0 ≤ Ai ≤ 100000 imprimir
la cantidad de numeros primos que existen en el lote (sin repeticiones).
'''
N = int(input("N: "))
while N < 1 or N > 1000:
    print("N(1 ≤ N ≤ 1000)")
    N = int(input("N: "))
primos = 0
numeros = []  
for i in range(1, N + 1):
    A = int(input(f"A{i}: "))
    while A < 0 or A > 100000:
        print(f"0 ≤ A{i} ≤ 100000")
        A = int(input(f"A{i}: "))
    cp = 0  
    for j in range(1, A // 2 + 1):  
        if A % j == 0:
            cp = cp + 1
    cp = cp + 1  
    if cp == 2:  
        repetido = 0  
        for k in numeros:  
            if A == k:
                repetido = 1  
        if repetido == 0:
            numeros += [A]  
            primos = primos + 1
print(primos)