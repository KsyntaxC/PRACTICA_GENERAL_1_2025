'''
Descripción: Una tienda desea optimizar la gestión de su inventario para reducir costos. La tienda vende un producto con una demanda anual determinada. Cada vez que realiza
un pedido, incurre en un costo fijo, y mantener las unidades en inventario también tiene un
costo.
El objetivo es calcular la cantidad óptima de productos que debe pedir en cada orden para
minimizar los costos totales. Para ello, se usará la fórmula del Lote Económico de Pedido
(EOQ, Economic Order Quantity):
Entrada: La entrada consiste en tres números decimales donde D es la demanda, S es
el costo de cada pedido y H es el costo de almacenamiento por año, en ese orden respectivamente.
Salida: Imprima la cantidad de pedidos óptimos para la tienda con formato de número
con dos decimales:
'''
D=int(input("Demanda: "))
S=float(input("Costo de cada pedido: "))
H=float(input("Costo de almacenamiento: "))
Q=((2*D*S)/H)**(1/2)
print(f"Cantidad de pedidos óptimos:{Q:.2f}")