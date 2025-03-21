'''
Se pide analizar la conjetura de collatz en un intervalo de valores, la conjetura es un problema
acerca de la teoria de numeros que establece que no importa el numero que se escoja siempre
se llegara al numero uno.
Se siguen los siguientes pasos si el numero es par se divide entre 2, y si el numero es impar
se multiplica por tres y se le suma 1.
Dado que se presupone que el numero llegara a ser 1 se pide que se cuantifique en cuantas
iteraciones se llega al 1. Pero se pide que dados un n ≥ 5 y m ≥ 5 se determine en el rango
[n, m] el numero que menos iteraciones le toma llegar al 1 y al que mas iteraciones le toma.
Ayuda: En el caso de empate de iteraciones se pide que se tome al numero mayor.
Salida: Se debe mostrar el numero que menos iteraciones le tomo llegar a 1 con el mensaje
”menos iteraciones:” seguido de la cantidad de iteraciones. Hacer los mismo con el que mas
iteraciones le tomo llegar al 1.
'''
n,m= map(int,input("Intro n, m: ").split())
while n<5 or m<5:
    print("n y m deben ser mayores o iguales a 5")
    n,m=map(int,input("Intro n, m: ").split())
cn=0; cm=0; nn=n; mm=m
while n!=1:
    if n%2==0:
        n=n//2
    else:
        n=n*3+1
    cn=cn+1
while m!=1:
    if m%2==0:
        m=m//2
    else:
        m=m*3+1
    cm=cm+1
if cn<cm:
    print(nn,"menos interaciones:",cn)
    print(mm,"mas iteraciones:",cm)
else:
    print(mm,"menos iteraciones:",cm)
    print(nn,"mas iteraciones:",cn)