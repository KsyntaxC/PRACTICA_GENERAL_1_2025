'''
Verificar si la fecha proporcionada es correcta.
Entrada: La entrada consiste de tres números enteros a,b,c. Representando el día, mes y año.
'''
a=int(input("Día: "))
b=int(input("Mes: "))
c=int(input("Año: "))
if 0<a<=31 and 0<b<=12 and c>0:
    if b in (4,6,9,11) and a>30:
        print("Fecha Incorrecta")
    elif b == 2:
        if (c%4==0 and c%100!=0) or (c%400==0):
            if a>29:
                print("Fecha Incorrecta")
            else:
                print("Fecha Correcta")
        else:
            if a>28:
                print("Fecha Incorrecta")
            else:
                print("Fecha Correcta")
    else:
        print("Fecha Correcta")
else:
    print("Fecha Incorrecta")