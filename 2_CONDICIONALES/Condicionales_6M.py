'''
Dado un número n, Ordenar los dígitos en orden descendente.
Entrada: La entrada consiste de cinco números enteros a,b,c,d,e. El objetivo es ordenarlos de mayor a menor.
'''
#ESTA ES LA SEGUNDA OPCION, SIN AÑADIR VARIABLES
a=int(input("a: "))
b=int(input("b: "))
c=int(input("c: "))
d=int(input("d: "))
e=int(input("e: ")) 
if a<b:
    a,b=b,a
if a<c:
    a,c=c,a
if a<d:
    a,d=d,a
if a<e:
    a,e=e,a
if b<c:
    b,c=c,b
if b<d:
    b,d=d,b
if b<e:
    b,e=e,b
if c<d:
    c,d=d,c
if c<e:
    c,e=e,c
if d<e:
    d,e=e,d
print(a,b,c,d,e)