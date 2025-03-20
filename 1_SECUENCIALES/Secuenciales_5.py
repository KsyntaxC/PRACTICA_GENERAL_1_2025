'''
Un Docente de la Universidad Mayor de San Andres tiene un salario base de X Bs por mes.
Por cada Y años de antiguedad del docente, se le otorga un aumento del 5 %, y por cada Z
horas que dedica a tutorías y cursos extras, se le suman 20 Bs adicionales. Calcula el salario
mensual y de un año del Docente.
Considere que 1800 ≤ X ≤ 14000, 1 ≤ Y ≤ 10, 1 ≤ Z ≤ 8 respectivamente.
'''
X=int(input("Salario base: "))
while X<1800 or X>14000:
    X=int(input("Salario base: "))
Y=int(input("Años de antiguedad: "))
while Y<1 or Y>10:
    Y=int(input("Años de antiguedad: "))
Z=int(input("Horas en tutorias y cursos extras: "))
while Z<1 or Z>8:
    Z=int(input("Horas en tutorias y cursos extras: "))
au=X*(5/100)
SM=X+(Y*au)+(Z*20)
print("Sueldo Mensual: ",SM)
print("Sueldo anual: ",SM*12)