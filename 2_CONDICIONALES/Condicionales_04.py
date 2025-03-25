'''
Se pide diseñar el algoritmo para resolver una ecuacion de segundo grado, donde se pide que
primeramente se defina si las soluciones son complejas o reales. En el caso de que sean reales
mostrar la o las soluciones.
Entrada: La entrada consiste en los coeficientes a, b, c de una ecuacion cuadratica ax2+bx+c,
que pueden ser numeros negativos o positivos.
'''
a=int(input("a: "))
b=int(input("b: "))
c=int(input("c: "))
D=b**2-4*a*c
if D>0:
    x1=(-b+D**(1/2))/(2*a)
    x2=(-b-D**(1/2))/(2*a)
    print("Las soluciones son reales")
    print(f"x1={x1:.3f}   x2={x2:.3f}")
if D==0:
    x=-b/(2*a)
    print("La solucion es real")
    print(f"x={x:.3f}")
if D<0:
    print("Las soluciones son imaginarias")