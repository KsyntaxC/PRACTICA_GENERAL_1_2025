'''
Descripcion: Dada una cadena con palabras separadas por al menos un espacio, mostrar
las palabras que tienen al menos una vocal “o”.
Entrada: Una linea con varias palabras (incluyendo espacios y comas).
Se garantiza que no hay una coma entre medio de los caracteres de una palabra, es decir
”momen,tos ”no ocurre
Salida: Solo las ”palabras”que cumplen la propiedad mencionada.
'''
cad=input("Introduce una cadena: ")
i=0
while i<len(cad):
    p=""; sw=0
    while i<len(cad) and cad[i]!=' ' and cad[i]!=',':
        p=p+cad[i]
        if cad[i] == 'o':
            sw=1
        i=i+1
    if sw==1:
        print(p)
    i=i+1