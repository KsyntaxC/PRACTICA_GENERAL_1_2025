'''
Sumar todos los digitos de los numeros ingresados hasta que se ingrese -1 sin adicionar este
mismo
'''
n=int(input("Intro n: "))
s=0
while n!=-1:
    sd=0
    while n!=0:
        d=n%10
        n=n//10
        sd=sd+d
    s=s+sd
    n=int(input("Intro n: "))
print(s)