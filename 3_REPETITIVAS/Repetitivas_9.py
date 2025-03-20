'''
Otra vez, la tarea es sencilla, se le pide que a partir de dos numeros X e Y , calcule el cociente
y el residuo de X/Y , pero existe una condicion, debe calcularlo sin hacer uso de la operacion
Division y tampoco hacer uso de la operacion modulo. Use for y While segun su conveniencia
Entrada: La entrada consiste de dos numeros X e Y ,ambos enteros, donde Y > 0
'''
X=int(input("X: "))
Y=int(input("Y: "))
coc=0
while X>=Y:
    X=X-Y
    coc=coc+1
    res=X
print("Cociente:",coc)
print("Residuo:",res)