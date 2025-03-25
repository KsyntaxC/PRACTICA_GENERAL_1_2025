'''
Juez Patito ID: 1605 Serie: 1!/1 + 1!/2 + 2!/2 + 3!/3 + 5!/3 + 8!/3 + 13!/4 + 21!/4 +...
'''
N=int(input("N: "))
a=1; b=0; fibo=a+b; sc=1; c=2
for i in range(N):
    print(f"{fibo}!/{sc}",end=" + ")
    a=b; b=fibo; fibo=a+b
    if c>sc:
        sc=sc+1
        c=1
    c=c+1
#MINI ADELANTO DE SUMATORIAS
#ESTO ENTRO EN EL EXAMEN DE VERANO