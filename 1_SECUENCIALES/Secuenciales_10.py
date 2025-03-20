'''
Descripción: Dadas las horas, minutos y segundos se le pide sumar un segundo.
Entrada: La entrada consiste de 3 números enteros separados por un espacio que representan las horas minutos y segundos. Donde horas < 24, minutos < 60 segundos < 60.
Salida: Imprima en la salida la nueva hora del reloj en formato mostrado en el ejemplo.
Las horas, minutos y segundos deben estar en el siguiente formato:
XX:YY:ZZ
Se debe poner ceros a la izquierda de los numeros si es necesario.
'''
XX = int(input("Hora: "))  
while XX>24 or XX<0:
    XX = int(input("Hora (Debe ser <24): ")) 
YY = int(input("Minutos: "))
while YY>60 or YY<0:
    YY = int(input("Minutos (Debe ser menor a 60): "))
ZZ = int(input("Segundos: "))
while ZZ>60 or ZZ<0:
    ZZ = int(input("Segundos (Debe ser menor a 60):"))
TS=XX*3600+YY*60+ZZ+1
h=TS//3600%24
m=TS//60%60
s=TS%60
print(f"{h:02d}:{m:02d}:{s:02d}")