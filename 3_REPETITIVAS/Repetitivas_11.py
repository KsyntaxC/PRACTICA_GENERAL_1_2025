'''
Descripcion: Una cadena se llama bailarina, si y solo si, la primera letra es mayuscula y cada una de las demas letras es lo opuesto a la anterior letra (mayuscula, minuscula,
mayuscula, minuscula, ..., etc.).
Por ejemplo AbCd es una cadena bailarina, la primera letra es A mayuscula, la segunda letra
es b minuscula, la siguiente letra es C mayuscula y por ultimo d es minuscula.
Ahora, debes construir un programa para que lea varios casos de prueba y que convierta la
cadena de texto en una cadena BAILARINA.
Entrada: La entrada consiste en un entero T numero de casos de prueba, seguido por T
lineas, cada una contiene una cadena de texto, puede ser que este vacia.
Salida: Imprimir una linea por cada caso de prueba, que contiene la cadena bailarina
resultado.
'''
'''Descripcion: Una cadena se llama bailarina, si y solo si, la primera letra es mayuscula
y cada una de las demas letras es lo opuesto a la anterior letra (mayuscula, minuscula,
mayuscula, minuscula, ..., etc.). Ahora, debes construir un programa para que lea varios casos de
prueba y que convierta la cadena de texto en una cadena BAILARINA.
Entrada: La entrada consiste en un entero T numero de casos de prueba, seguido por
T lineas, cada una contiene una cadena de texto, puede ser que este vacia.
Salida: Imprimir una linea por cada caso de prueba, que contiene la cadena bailarina
resultado.
'''
T=int(input("Introduce el numero T de casos de prueba: "))
for i in range(1,T+1):
    cad=input("Introduce la cadena: ")
    ba="";cc=0
    for j in range(0,len(cad)):
        c=cad[j]
        if c!=" ":
            if cc%2==0:
                ba=ba+c.upper()
            else:
                ba=ba+c.lower()
            cc=cc+1
        else:
            ba=ba+" "
    print(ba)
#ESTO ES CADENAS, OSEA WTF, QUE HACE AQUI