'''
Estamos en el año 3025, y el ajedrez ha evolucionado significativamente. Como parte de esta
nueva era, el Club de Ajedrez del Futuro te ha encargado la creacion de diversas tablas de
distintos tamaños.
Cada tabla tendra un tamaño de NxN y seguira un patron alternado de colores:
- El color negro estara representado por el numero 1
- El color blanco estara representado por el numero 0
La cuadricula siempre comenzara con negro (1) en la esquina superior izquierda y continuara
alternandose en toda la tabla.
¡Manos a la obra!
'''
N=int(input("N: "))
for i in range (1,N+1):
    for j in range(1,N+1):
        if (i+j)%2==0:
            print("1",end=" ")
        else:
            print("0",end=" ")
    print()
#OTRO ADELANTO DE MATRICES, ESTE SI ESTABA IZI JSJS