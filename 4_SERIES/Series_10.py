'''
Juez Patito ID: 2125 Serie: 2 7 17 34 62 103 161 238 338 467 ...
'''
N = int(input("N: "))
p = 2
sp = 0
s = p

for i in range(N):
    print(s, end=" ")

    encontrado = 0
    while encontrado == 0:
        np = 1
        for j in range(2, p):
            if p % j == 0:
                np = 0
        if np == 1:
            primo = p
            encontrado = 1
        p = p + 1

    sp = sp + primo
    s = s + sp

