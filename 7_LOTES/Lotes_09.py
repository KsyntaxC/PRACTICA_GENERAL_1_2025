'''
Dado un lote, determinar el area de un triangulo por cada 3 numeros introducidos por teclado, cada 3 numeros simbolizan los 3 lados del tri´angulo.
Entrada: La primera linea contiene un numero n
Las siguientes n lineas contiene un unico entero x (1<=x<=10**2) por linea.
Salida: Para cada caso de prueba mostrar el area del triangulo. En caso de no haber
area imprimir ”No hay area”
'''
import math
n=int(input("n: "))
while n<1:
    n=int(input("n: "))
a=0; b=0; c=0; con=1
for i in range(n):
    x=int(input("x: "))
    while x<1 or x>10**2:
        print("x (1<=x<=10**2)")
        x=int(input("x: "))
    a=b; b=c; c=x
    con=con+1
    if con>3:
        if a+b>c and a+c>b and b+c>a:
            s=(a + b + c)/2
            A=math.sqrt(s*(s-a)*(s-b)*(s-c))
            a=0; b=0; c=0
            con=1
            print(f"Area: {A}")
        else:
            a=0; b=0; c=0
            con=1
            print("No hay area")