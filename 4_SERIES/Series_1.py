'''
N donde N >= 1, se le pide generar los primeros N terminos de cada serie.
Serie: 1, 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8 ...
'''
N = int(input("Introduce N: "))
i = 1
cont = 0
while cont < N:
    for j in range(1, i + 1):
        if cont < N:
            print(j, end=" ")
            cont += 1
    i += 1
