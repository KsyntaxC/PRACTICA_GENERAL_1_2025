'''
Generar la siguiente sumatoria para N terminos:
S = 2 - 3 + 5 - 7 + 11 - 13 + 17 - 19 + 23 - 29 + 31 + ...
'''
N=int(input("N: "))
sw=0; p=2; s=0
for i in range(N):
    while sw==0:
        np=1
        for j in range(2, p):
            if p%j==0:
                np=0
        if np==1:
            primo=p
            sw=1
        p=p+1
    sw=0
    if i%2==0:
        s=s+primo
    else:
        s=s-primo
print(s)