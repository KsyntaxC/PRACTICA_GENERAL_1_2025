'''
Verificar si la fecha proporcionada es correcta.
Entrada: La entrada consiste de tres números enteros a,b,c. Representando el día, mes y año.
'''
a=int(input("Día: "))
b=int(input("Mes: "))
c=int(input("Año: "))
if 1<=b<=12 and c>0:
    if b==2:
        if (c%4==0 and c%100!=0) or (c%400==0):
            max_dia=29 
        else:
            max_dia=28
    elif b in (4, 6, 9, 11):
        max_dia=30
    else:
        max_dia=31
    if 1<=a<=max_dia:
        print("Fecha Correcta")
    else:
        print("Fecha Incorrecta")
else:
    print("Fecha Incorrecta")