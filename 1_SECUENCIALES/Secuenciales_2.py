'''
Escribe un programa que dado dos puntos con coordenadas (x1, y1) y (x2, y2) calcule la
distancia D entre los dos puntos. Debe mostrar la salida con formato de 2 decimales.
Use la siguiente fórmula:
'''
x1=int(input("x1: "))
y1=int(input("y1: "))
x2=int(input("x2: "))
y2=int(input("y2: "))
D=((x2-x1)**2+(y2-y1)**2)**(1/2)
print(f"{D:.2f}")