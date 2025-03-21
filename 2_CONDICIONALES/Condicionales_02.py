'''
El promedio de practicas de un curso se calcula en base a cuatro practicas calificadas, de las
cuales se elimina la nota menor y se promedian las tres notas mas altas. Diseñe un algoritmo
que imprima: la nota eliminada y el promedio de practicas de un estudiante.
'''
n1=int(input("Nota 1: "))
n2=int(input("Nota 2: "))
n3=int(input("Nota 3: "))
n4=int(input("Nota 4: "))
if n1>n2:
    m=n2
else:
    m=n1
if n3<m:
    m=n3
if n4<m:
    m=n4
P=(n1+n2+n3+n4-m)/3
print("Nota eliminada ",m)
print("Promedio: ",P)