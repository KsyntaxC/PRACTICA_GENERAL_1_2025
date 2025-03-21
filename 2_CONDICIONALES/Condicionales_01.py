'''
Descripción: Escriba un programa tal que dado 2 intervalos, calcule el intervalo que corresponde a su intersecci´on o indica si est´a vac´ıo.
Entrada: La entrada consiste de cuatro números enteros a1, b1, a2, b2, que representan los
intervalos [a1, b1] y [a2, b2]. Asuma que a1 ≤ b1 y a2 ≤ b2
Salida: Imprima [] si la intersección está vacía o [x, y] si la intersección no está vacía.
'''
print("PRIMER INTERVALO")
a1=int(input("Desde a1: "))
b1=int(input("Hasta b1: "))
print("SEGUNDO INTERVALO")
a2=int(input("Desde a2: "))
b2=int(input("Hasta b2: "))
if a1>a2:
    ini=a1
else:
    ini=a2
if b1<b2:
    fin=b1
else:
    fin=b2
if ini<=fin:
    print("[",ini,",",fin,"]")
else:
    print("[]")