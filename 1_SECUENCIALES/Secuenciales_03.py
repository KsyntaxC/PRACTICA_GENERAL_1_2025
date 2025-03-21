'''
Para el calculo del cobro de un préstamo, se pide que para la cuantificación del pago se tome
en cuenta el dinero prestado, el interés anual y los años en los que la deuda se cancela.
'''
a=int(input("Prestamo: "))
b=int(input("Interes: "))
c=int(input("Años: "))
Cobro=a*(1+(b/100)*c)
print(f"{Cobro:.2f}")