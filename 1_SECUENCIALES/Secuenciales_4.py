'''
Dados dos números enteros a y b, determinar el cociente y resto de la división a ÷ b, sin
utilizar el operador módulo %, siendo el entero b distinto de cero.
'''
a=int(input("Intro a: "))
b=int(input("Intro b: "))
while b==0:
    b=int(input("Intro b: "))
coc=a//b
rst=a-(b*coc)
rst=rst+(a==0)*b
print(coc, rst)