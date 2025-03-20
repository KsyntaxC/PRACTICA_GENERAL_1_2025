'''
Escriba un programa que tome como entrada un numero M donde 1 ≤ M ≤ 12 y devuelva
el nombre del mes correspondiente en español.
'''
M=int(input("M: "))
if M==1:
    print("Enero")
elif M==2:
    print("Febrero")
elif M==3:
    print("Marzo")
elif M==4: 
    print("Abril")
elif M==5:
    print("Mayo")
elif M==6: 
    print("Junio")
elif M==7:
    print("Julio")
elif M==8:
    print("Agosto")
elif M==9: 
    print("Septiembre")
elif M==10:
    print("Octubre")
elif M==11:
    print("Noviembre")
elif M==12:
    print("Diciembre")
else:
    print("Solo hay 12 meses genio")