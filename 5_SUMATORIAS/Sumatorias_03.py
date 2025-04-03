'''
Descripcion: Generar la siguiente sumatoria para n terminos.
Entrada: La entrada consiste de T(1 ≤ T ≤ 100) casos de prueba, en cada caso de prueba
se te daran 2 numeros en una sola fila separados por un espacio, estos numeros enteros seran
n (1 ≤ n ≤ 120) y x (1 ≤ x ≤ 70) respectivamente. .
Salida: Por cada caso de prueba muestre el resultado de la sumatoria con 4 decimales
de precision.
'''
T=int(input("T: "))
for i in range(T):
    n=int(input("n: "))
    while 1>n>120:
        n=int(input("n: "))
    x=int(input("x: "))
    while 1>x>70:
        x=int(input("x: "))
    sig=1; primo=2; sw=0; nprimo=primo
    e=1; ce=1; s=0
    a=-1; b=1; fibo=a+b
    for j in range(n):
        sig=sig*(-1)
        if j%2==0:
            while sw==0:
                np=1
                for j in range(2, primo):
                    if primo%j==0:
                        np=0
                if np==1:
                    nprimo=primo
                    sw=1
                primo=primo+1
            sw=0
        if ce>e:
            ce=1; e=e+1
        ce=ce+1
        a=b; b=fibo; fibo=a+b
        print(f"{sig*nprimo}*({x}^{e} / {fibo})")
        s=s+(sig*nprimo*((x**e)/fibo))
    print()
    print(f"{s:.4f}")