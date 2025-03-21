'''
En una cadena de tiendas se tiene el siguiente sistema de descuentos. Los usarios de primera
clase tienen un descuento del 20 % en todas sus compras, los usuarios de segunda clase tienen
un descuento del 10 % en compras mayores a 400 Bs, mientras que un usuario corriente no
tiene ningun descuento, pero por promocion se hace un descuento de 100 Bs por compras
superiores a 1200 Bs(el cual se efectua antes de la aplicacion de descuentos especiales). El
sistema que usa la cadena es el uso de un ID en cada cliente de forma que los usuarios de
primera clase tienen numeros menores a 100 y los usuarios de segunda clase tienen numeros
menores a 1000. Muestre el monto que el cliente debe pagar.
Entrada: La entrada consiste en numeros a,b, que seran el ID del usuario y la cantidad de
su compra.

'''
a=int(input("ID de usuario: "))
b=int(input("Cantidad de la compra: "))
if b>1200:
    b=b-100
if 0<a<100:
    b=b*0.80
if 100<=a<1000 and b>400:
    b=b*0.90 
print(b)