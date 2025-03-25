'''
Se necesita convertir un numero binario en su equivalente decimal. Para
ello, se debe interpretar el numero dado en base 2 y calcular su valor en base 10.
Nota: Usar descomposicion de numeros para procesar los digitos individualmente.
Entrada: La entrada consiste en multiples casos de prueba. Cada caso es un numero binario
de hasta 16 bits. La entrada termina cuando no hay mas datos.
Salida: Para cada numero binario de entrada, imprimir su equivalente en decimal en una linea
'''
bin=int(input("Numero binario de hasta 16 bits: "))
dec=0; ex=1
while bin>0:
    d=bin%10
    bin=bin//10
    dec=dec+d*ex
    ex=ex*2
print(dec)