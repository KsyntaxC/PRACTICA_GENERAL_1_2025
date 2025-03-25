'''
Dado un lote de n numeros, aumentar el elemento de la secuencia a cada elemento del lote
segun el recorrido de la serie: 1 2 3 2 1 2 3 2 1...
'''
#ESTE EJERCICIO NO TIENE NI LA MAS MINIMA LOGICA, ES IMPOSIBLE SACAR LO QUE SE SACA EN EL EJEMPLO
N=int(input("N: "))
ns=1; sr=1
for i in range(1,N+1):
    n=int(input(f"n{i}: "))
    s=ns
    ns=ns+sr
    if ns>=3 or ns<=1:
        sr=sr*(-1)
    nn=n+s
    print(nn)
#LO CORRECTO ES ASI, TAL CUAL DICE EL ENUNCIADO