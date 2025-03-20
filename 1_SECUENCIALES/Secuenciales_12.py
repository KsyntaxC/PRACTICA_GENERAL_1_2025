'''
Conversión de Binario a Decimal
Descripción: Un número binario está compuesto únicamente por los dígitos 0 y 1. Romer
necesita tu ayuda para convertir un número binario de 8 bits a decimal, ya que ha olvidado
cómo hacerlo.
Entrada: La entrada consiste en 8 numeros que tendras valores de 0 o 1 .
Salida: Imprima el equivalente decimal del número binario
'''
a,b,c,d,e,f,g,h = map(int,input("Introduce un número binario de 8 bits, unicamente 0 y 1: ").split())
D=a*128+b*64+c*32+d*16+e*8+f*4+g*2+h*1
print("Binario:",a,b,c,d,e,f,g,h)
print("Decimal:",D)